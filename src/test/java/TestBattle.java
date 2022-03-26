import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestBattle {

    @Test
    void battle_of_the_same_characters() {
        String string1 = "A";
        String string2 = "A";

        Warrior warrior1 = new Warrior(string1);
        Warrior warrior2 = new Warrior(string2);

        Assertions.assertEquals("Tie!", Warrior.battleResult(warrior1, warrior2));

    }

    @Test
    void battle_of_the_different_characters() {
        String string1 = "S";
        String string2 = "Y";

        Warrior warrior1 = new Warrior(string1);
        Warrior warrior2 = new Warrior(string2);

        Assertions.assertEquals("Y", Warrior.battleResult(warrior1, warrior2));


    }

    @Test
    void battle_of_same_words() {
        String string1 = "ONE";
        String string2 = "ONE";

        Warrior warrior1 = new Warrior(string1);
        Warrior warrior2 = new Warrior(string2);

        Assertions.assertEquals("Tie!", Warrior.battleResult(warrior1, warrior2));


    }

    @Test
    void battle_of_different_words() {
        String string1 = "ONE";
        String string2 = "TWO";

        Warrior warrior1 = new Warrior(string1);
        Warrior warrior2 = new Warrior(string2);

        Assertions.assertEquals("TWO", Warrior.battleResult(warrior1, warrior2));
    }

    @Test
    void battle_of_different_words_with_same_characters() {
        String string1 = "ONE";
        String string2 = "NEO";

        Warrior warrior1 = new Warrior(string1);
        Warrior warrior2 = new Warrior(string2);

        Assertions.assertEquals("Tie!", Warrior.battleResult(warrior1, warrior2));
    }
}
