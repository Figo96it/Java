package pl.sda;

import java.util.ArrayList;
import java.util.HashMap;

public class Przychodnia {

    public ArrayList<Lekarz> getListLekarzy () {

        ArrayList<Lekarz> lekarze = new ArrayList<>();

        Lekarz l1 = new Lekarz("L1","Adam", "Nowak", "dr n. med.");
        Lekarz l2 = new Lekarz("L2", "Tomasz", "Kowalski", "dr hab.");

        lekarze.add(l1);
        lekarze.add(l2);

        return lekarze;
    }

    public HashMap<Integer, String> getGodzinyPrzyjec (String id) {

        HashMap<Integer, String> godziny = new HashMap<>();

        if (id.equals("L1")) {
            godziny.put(1, "8:00 - 8:30");
            godziny.put(2, "10:30 - 11:00");
        } else if (id.equals("L2")) {
            godziny.put(1, "9:00 - 1:30");
            godziny.put(2, "11:30 - 12:00");
        }
        return godziny;
    }

    public boolean zarezerwuj (String lekarzId, Integer slot) {

        return true;
    }
}
