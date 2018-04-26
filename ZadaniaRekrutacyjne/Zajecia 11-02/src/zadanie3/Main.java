package zadanie3;

public class Main {

    public static void main(String[] args) {
        System.out.println(sum("2800011111111111111111111111111111111111", "2000000000000"));
    }

    private static String sum(String number1, String number2) {
        String firstNumber = new StringBuilder(number1).reverse().toString();
        String secondNumber = new StringBuilder(number2).reverse().toString();
        int proportLength = 0;
        if (firstNumber.length() >= secondNumber.length()) {
            proportLength = firstNumber.length();
        } else if (secondNumber.length() > firstNumber.length()) {
            proportLength = secondNumber.length();
        }
        StringBuilder result = new StringBuilder();
        int rest = 0;
        for (int i = 0; i < proportLength; i++) {
            if (i >= firstNumber.length()) {
                rest += Integer.parseInt("" + secondNumber.charAt(i));
            } else if (i >= secondNumber.length()) {
                rest += Integer.parseInt("" + firstNumber.charAt(i));
            } else {
                rest += Integer.parseInt("" + firstNumber.charAt(i)) + Integer.parseInt(""+secondNumber.charAt(i));
            }
            if (rest >= 10) {
                result.append(Integer.toString(rest - 10));
                rest = 1;
            } else {
                result.append(Integer.toString(rest));
                rest = 0;
            }
        }
        if(rest>0){
            result.append(Integer.toString(rest));
        }
        return result.reverse().toString();
    }
}
