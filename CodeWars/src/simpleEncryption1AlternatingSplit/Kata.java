package simpleEncryption1AlternatingSplit;

public class Kata {

    public static String encrypt(final String text, final int n) {
        if (text == null) {
            return null;
        } else if (n <= 0) {
            return text;
        }

        char[] decryptText = text.toCharArray();
        String finalDecryptText = "";
        for (int x = 0; x < n; x++) {
            for (int i = 1; i < decryptText.length; i += 2) {
                finalDecryptText += decryptText[i];
            }
            for (int i = 0; i < decryptText.length; i += 2) {
                finalDecryptText += decryptText[i];
            }
            decryptText = finalDecryptText.toCharArray();
            if (x < n - 1) {
                finalDecryptText="";
            }
        }

        return finalDecryptText;
    }

    public static String decrypt(final String encryptedText, final int n) {
        if (encryptedText == null) {
            return null;
        } else if (n <= 0) {
            return encryptedText;
        }

        char[] encryptText = encryptedText.toCharArray();
        String finalEncryptText = "";

        for (int x = 0; x < n; x++) {
            for (int i = encryptText.length / 2, z = 0; i < encryptText.length; i++, z++) {
                finalEncryptText += encryptText[i];
                if (encryptText.length % 2 == 1) {
                    if (i < encryptText.length - 1) {
                        finalEncryptText += encryptText[z];
                    }
                } else {
                    finalEncryptText += encryptText[z];
                }
            }
            encryptText = finalEncryptText.toCharArray();
            if (x < n - 1) {
                finalEncryptText="";
            }
        }
        return finalEncryptText;
    }


    public static void main(String[] args) {
        System.out.println(decrypt("hsi  etTi sats!", 1));
        System.out.println(decrypt("s eT ashi tist!", 2));
        System.out.println(decrypt(" Tah itse sits!", 3));
        System.out.println(decrypt("This is a test!", 4));
        System.out.println(decrypt("This is a test!", -1));
    }
}