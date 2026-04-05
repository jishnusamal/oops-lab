package src;
import java.util.*;

interface ThreatScorer {
    int score(int baseThreat);
}

// Concrete scorer classes
class LowScorer implements ThreatScorer {
    public int score(int baseThreat) {
        return baseThreat * 1;
    }
}

class MediumScorer implements ThreatScorer {
    public int score(int baseThreat) {
        return baseThreat * 3;
    }
}

class HighScorer implements ThreatScorer {
    public int score(int baseThreat) {
        return baseThreat * 7 + 50;
    }
}

public class ThreatScoringEngine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

        // Map to hold strategies
        Map<String, ThreatScorer> scorerMap = new HashMap<>();
        scorerMap.put("LOW", new LowScorer());
        scorerMap.put("MEDIUM", new MediumScorer());
        scorerMap.put("HIGH", new HighScorer());
        scorerMap.put("CRITICAL", new ThreatScorer() { 
            @Override
            public int score(int baseThreat) {
                int score = baseThreat * 10 + 100;
                System.out.println("CRITICAL ALERT: score = " + score);
                return score;
            }
        });

        int[] total = {0};

        for (int i = 0; i < N; i++) {
            String[] parts = sc.nextLine().split(" ");
            String level = parts[0];
            int base = Integer.parseInt(parts[1]);

            ThreatScorer scorer = scorerMap.get(level);
            if (scorer != null) {
                total[0] += scorer.score(base);
            } else {
                System.out.println(level + ": Unknown threat level. Skipped.");
            }
        }

        System.out.println("Total Threat Score: " + total[0]);
        sc.close();
    }
}