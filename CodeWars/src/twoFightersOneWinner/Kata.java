package twoFightersOneWinner;

public class Kata {

    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        Fighter attacker, defender;

        if (fighter1.name == firstAttacker) {
            attacker = fighter1;
            defender = fighter2;
        } else {
            attacker = fighter2;
            defender = fighter1;
        }

        while (true) {
            defender.health -= attacker.damagePerAttack;
            if (defender.health <= 0) {
                return attacker.name;
            } else {
                Fighter temp = attacker;
                attacker = defender;
                defender = temp;
            }
        }
    }
}
