import java.security.SecureRandom;


public class ArcheryGame {
    public static void main (String[] args) {
        int[][] scores = new int[4][3];
        SecureRandom random = new SecureRandom();

        for(int player = 0; player < scores.length; player++){
            for (int chance = 0; chance < scores[player].length; chance++){
                scores[player][chance] = random.nextInt(11);
            }
        }

        int[] totals = new int[4];
        int maxScore = -1;
        int winner = -1;

        for (int player = 0; player < scores.length; player++){
            int total = 0;
            for (int chance = 0; chance < scores[player].length; chance ++) {
                total += scores[player][chance];
            }
            totals[player] = total;
            if (total > maxScore) {
                maxScore = total;
                winner = player + 1;
            }
        }
        System.out.println("Archery Game Results:");
        System.out.println("Player|Chance1|Chance2|Chance3|Total");

    System.out.println("------|-------|--------|---------|----------");

        for (int player = 0; player < scores.length; player ++) {
            System.out.printf("%d | %d | %d | %d| %d%n",(player +1 ), scores[player][0], scores[player][1],scores[player][2],totals[player]);
        }
        System.out.println("\nPlayer" + winner + "wins with a total score of " + maxScore + "!");        
    }
}