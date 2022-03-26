import java.util.HashMap;

public class Warrior {
    String content;

    public Warrior(String content) {
        this.content = content;
    }

    public int calculateScore() {
        int totalScore = 0;
        HashMap<Character, Integer> scores = new HashMap<>();
        scores.put('A', 1);
        scores.put('B', 2);
        scores.put('C', 3);
        scores.put('D', 4);
        scores.put('E', 5);
        scores.put('F', 6);
        scores.put('G', 7);
        scores.put('H', 8);
        scores.put('I', 9);
        scores.put('J', 10);
        scores.put('K', 11);
        scores.put('L', 12);
        scores.put('M', 13);
        scores.put('N', 14);
        scores.put('O', 15);
        scores.put('P', 16);
        scores.put('Q', 17);
        scores.put('R', 18);
        scores.put('S', 19);
        scores.put('T', 20);
        scores.put('U', 21);
        scores.put('V', 22);
        scores.put('W', 23);
        scores.put('X', 24);
        scores.put('Y', 25);
        scores.put('Z', 26);

        for (char chr: this.content.toCharArray()) {
            totalScore += scores.get(chr);
        }
        return totalScore;
    }

    public static String battleResult(Warrior warrior1, Warrior warrior2) {
        int resultWarrior1 = warrior1.calculateScore();
        int resultWarrior2 = warrior2.calculateScore();

        if (resultWarrior1 > resultWarrior2) {
            return warrior1.content;
        }
        if (resultWarrior1 < resultWarrior2) {
            return warrior2.content;
        }
        return "Tie!";

    }
}
