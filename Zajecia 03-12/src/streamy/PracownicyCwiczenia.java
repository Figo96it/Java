package streamy;

import model.NarzedziaCSV;
import model.Plec;
import model.Pracownik;

import java.util.*;
import java.util.stream.Collectors;

public class PracownicyCwiczenia {

    public static void main(String[] args) {
        String sciezkaDoPliku = "C:/Users/MSI/Desktop/209307/SDAJAVA/data.csv";
        List<Pracownik> pracownicy = NarzedziaCSV.czytajCSVZPliku(sciezkaDoPliku);
        System.out.println(pracownicy.size());
        System.out.println(pracownicy.get(0));

        Zadanie4(pracownicy);


        //WSZYSCY PRACOWNICY, KTÓRYCH NAZWISKO ZACZYNA SIĘ NA LITERĘ C
        /*
        List<Pracownik> nazwiskaNaC=pracownicy.stream()
                .filter(pracownik -> pracownik.getNazwisko().startsWith("C"))
                .collect(Collectors.toList());
        System.out.println(nazwiskaNaC.size());
        */

        //LISTA PRACOWNIKÓW PO 50-TCE JEŻDŻĄCY BMW
        /*
        List<Pracownik> po50tceIBMW=pracownicy.stream()
                .filter(pracownik -> pracownik.getWiek()>50 && pracownik.getSamochod().getMarka().equalsIgnoreCase("BMW"))
                .collect(Collectors.toList());
        for(Pracownik pracownik : po50tceIBMW){
            System.out.println(String.format("%s %s %d %s",pracownik.getImie(),pracownik.getNazwisko(),pracownik.getWiek(),pracownik.getSamochod()));
        }
        */

        //LISTA PRACOWNIKÓW POSORTOWANA WEDŁUG PENSJI MALEJĄCO
        /*
        List<Pracownik> posortowanePoPensjiMalejaco=pracownicy.stream().sorted((o1,o2)->o2.getPensja()-o1.getPensja())
                .collect(Collectors.toList());
        for(Pracownik pracownik : posortowanePoPensjiMalejaco){
            System.out.println(String.format("Nazwisko: %s, Imie: %s, Pensja: %d",pracownik.getImie(),pracownik.getNazwisko(),pracownik.getPensja()));
        }
        */

        //LISTA 10 NAJBOGATSZYCH PRACOWNIKÓW 1 SPOSÓB
        /*
        List<Pracownik> pierwsze10Pensji=pracownicy.stream().sorted((o1,o2)->o2.getPensja()-o1.getPensja())
                .limit(10)
                .collect(Collectors.toList());
        for(Pracownik pracownik : pierwsze10Pensji){
            System.out.println(String.format("Nazwisko: %s Imie: %s Pensja: %d",pracownik.getNazwisko(),pracownik.getImie(),pracownik.getPensja()));
        }
        */

        //LISTA 10 NAJBOGATSZYCH PRACOWNIKÓW 2 SPOSÓB
        /*
        List<Pracownik> pracownicyKopia=new ArrayList<>(pracownicy);
        pracownicyKopia.sort(new Comparator<Pracownik>() {
            @Override
            public int compare(Pracownik o1, Pracownik o2) {
                return o2.getPensja()-o1.getPensja();
            }
        });

        List<Pracownik> pierwsze10=new ArrayList<>();
        for(int i=0;i<10;i++){
            pierwsze10.add(pracownicyKopia.get(i));
        }

        for(Pracownik pracownik : pierwsze10){
            System.out.println(String.format("Nazwisko: %s, pensja: %d",pracownik.getNazwisko(),pracownik.getPensja()));
        }
        */

        //LISTA PRACOWNIKOW POMIEDZY 30 A 50 ROKIEM ZYCIA
        /*
        List<Pracownik> pracownicyPomiedzy30a50=pracownicy.stream().sorted((o1,o2)->o2.getWiek()-o1.getWiek())
                .filter(pracownik -> pracownik.getWiek()>30 && pracownik.getWiek()<50)
                .collect(Collectors.toList());
        for(Pracownik pracownik : pracownicyPomiedzy30a50){
            System.out.println(String.format("Nazwisko: %s Imie: %s Wiek: %d",pracownik.getNazwisko(),pracownik.getImie(),pracownik.getWiek()));
        }
        System.out.println(pracownicyPomiedzy30a50.size());
        */

        //LISTA OSOB, KTORZY ZARABIAJA WIECEJ NIZ 80 TYS. I MIESZKAJA WE WRO
        /*
        List<Pracownik> osobyZarabiajaceWiecejNiz80TysIMieszkajacychWeWro=pracownicy.stream()
                .filter(pracownik -> pracownik.getPensja()>80000 && pracownik.getMiejscowosc().equalsIgnoreCase("wrocław"))
                .collect(Collectors.toList());
        for(Pracownik pracownik : osobyZarabiajaceWiecejNiz80TysIMieszkajacychWeWro){
            System.out.println(String.format("Nazwisko: %s Imie: %s Pensja: %d Miasto: %s",pracownik.getNazwisko(),pracownik.getImie(),pracownik.getPensja(),pracownik.getMiejscowosc()));
        }
        */

        //LISTA MAREK SAMOCHODOW 0 SPOSOB
        /*
        List<Pracownik> opcja=pracownicy
                .stream()
                .map(pracownik -> pracownik.getSamochod().getMarka())
                .distinct()
                .collect(Collectors.toList());
        System.out.println(opcja);
        */

        //LISTA MAREK SAMOCHODOW 1 SPOSOB
        /*
        Set<String> unikalnaListaMarek=pracownicy.stream()
                .map(pracownik -> pracownik.getSamochod().getMarka())
                .collect(Collectors.toSet());
        System.out.println(unikalnaListaMarek);
        */

        //LISTA MAREK SAMOCHODOW 2 SPOSOB
        /*
        Set<String> unikalnaListaMarek2=new HashSet<>();
        String marka;
        for(int i=0;i<pracownicy.size();i++){
            marka=pracownicy.get(i).getSamochod().getMarka();
            unikalnaListaMarek2.add(marka);
        }
        System.out.println(unikalnaListaMarek2);
        */

        //OSOBY WAZACE WIECEJ NIZ 100 KG
        /*
        List<Pracownik> osobyWazaceWiecejNiz100kg=pracownicy.stream()
                .filter(pracownik -> pracownik.getWaga()>100.0)
                .collect(Collectors.toList());
        for(Pracownik pracownik : osobyWazaceWiecejNiz100kg){
            System.out.println(String.format("%s %s %d %s %f", pracownik.getImie(), pracownik.getNazwisko(), pracownik.getWiek(), pracownik.getMiejscowosc(), pracownik.getWaga()));
        }
        */

        //PRACOWNICY Z PRAWIDLOWYM WSKAZNIKIEM BMI
        //wskaznikBMI(pracownicy);
        //procentKobiet(pracownicy);
        //rocznikiSmochodow(pracownicy);
    }

    public static void zadanie3(List<Pracownik> pracownicy){

    }

    public static void wskaznikBMI(List<Pracownik> pracownicy) {
        List<Pracownik> wyniki = new ArrayList<>();
        for (Pracownik pracownik : pracownicy) {
            double waga = pracownik.getWaga();
            int wzrostCm = pracownik.getWzrost();
            double wzrost = (1.0 * wzrostCm) / 100;
            double bmi = waga / (wzrost * wzrost);
            if (bmi > 18.5 && bmi < 25.0) {
                wyniki.add(pracownik);
            }
        }
        for (Pracownik pracownik : wyniki) {
            System.out.println("" + pracownik.getNazwisko() + " " + pracownik.getImie() + " waga:" + pracownik.getWaga() + " wzrost: " + pracownik.getWzrost());
        }
    }

    public static void procentKobiet(List<Pracownik> pracownicy) {
        int licznik = 0;
        for (Pracownik pracownik : pracownicy) {
            if (pracownik.getPlec().equals(Plec.KOBIETA)) {
                licznik++;
            }
        }
        double procent = (1.0 * licznik / pracownicy.size()) * 100;
        System.out.println(procent);
    }

    private static void rocznikiSmochodow(List<Pracownik> pracownicy) {
        Map<Integer, Long> mapa = new HashMap<>();
        for (Pracownik pracownik : pracownicy) {
            int rocznik = pracownik.getSamochod().getRocznik();
            if (mapa.containsKey(rocznik)) {
                mapa.put(rocznik, mapa.get(rocznik) + 1);
            } else {
                mapa.put(rocznik, (long) 11); //11 oznacza ze to wartosc long
            }
        }
        System.out.println(mapa);
    }

    //OSOBY Z NAJNIZSZYM DOCHODEM JEZDZACE PORSCHE
    private static void Zadanie7(List<Pracownik> pracownicy) {
        List<Pracownik> pracownicyZPorsche = new ArrayList<>();
        for (Pracownik pracownik : pracownicy) {
            if (pracownik.getSamochod().getMarka().equalsIgnoreCase("porsche")) {
                pracownicyZPorsche.add(pracownik);
            }
        }
        Pracownik najbiedniejszy = null;
        for (Pracownik pracownik : pracownicyZPorsche) {
            if (najbiedniejszy != null) {
                if (pracownik.getPensja() < najbiedniejszy.getPensja()) {
                    najbiedniejszy = pracownik;
                }
            } else {
                najbiedniejszy = pracownik;
            }
        }
        System.out.println(wypiszPracownika("Najbiedniejszy: ", najbiedniejszy.getNazwisko(), najbiedniejszy.getImie(), najbiedniejszy.getPensja(), najbiedniejszy.getSamochod()));

        Optional<Pracownik> pracownikNajbiedniejszy=pracownicy.stream()
                .filter(pracownik -> pracownik.getSamochod().getMarka().equalsIgnoreCase("porsche"))
                .min((o1,o2)->o1.getPensja()-o2.getPensja());
        if(pracownikNajbiedniejszy.isPresent()){
            Pracownik wartosc=pracownikNajbiedniejszy.get();
            System.out.println(wypiszPracownika("Najbiedniejszy: ", najbiedniejszy.getNazwisko(), najbiedniejszy.getImie(), najbiedniejszy.getPensja(), najbiedniejszy.getSamochod()));
        }else{
            System.out.println("Nie ma takiej osoby.");
        }
    }

    //OSOBY KORZYSTAJĄCE Z LINUXA
    private static void  Zadanie4(List<Pracownik> pracownicy){
        List<Pracownik> opcja1=pracownicy.stream()
                .filter(pracownik -> pracownik.getPrzegladarka().toLowerCase().contains("linux"))
                .collect(Collectors.toList());
        for(Pracownik p : opcja1){
            System.out.println(wypiszPracownika(p.getNazwisko(), p.getImie(), p.getPrzegladarka()));
        }
        List<Pracownik> opcja2=new ArrayList<>();
        for(Pracownik pracownik : pracownicy){
            if(pracownik.getPrzegladarka().toLowerCase().contains("linux")){
                opcja2.add(pracownik);
            }
        }
        System.out.println("--------------------------------------");
        for(Pracownik pracownik : opcja2){
            System.out.println(wypiszPracownika(pracownik.getNazwisko(),pracownik.getImie(),pracownik.getPrzegladarka()));
        }
    }

    public static String wypiszPracownika(Object... parametry) {
        StringBuilder sb = new StringBuilder();
        for (Object param : parametry) {
            sb.append(param.toString()+" ");
        }
        return sb.toString();
    }

    /*OSOBY KORZYSTAJACE Z LINUXA
        List<Pracownik> osobyKorzystajaceZLinuxa=pracownicy.stream()
                .filter(pracownik -> pracownik.getPrzegladarka().contains("Linux") && pracownik.getPrzegladarka().contains("linux")
                .collect(Collectors.toList());
        for(Pracownik pracownik : osobyKorzystajaceZLinuxa){
            System.out.println(String.format("%s %s %d %s przegladarka: %s", pracownik.getImie(), pracownik.getNazwisko(), pracownik.getWiek(), pracownik.getMiejscowosc(), pracownik.getPrzegladarka()));
        }
        */
}






