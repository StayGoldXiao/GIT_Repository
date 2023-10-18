package Work_5;

public class ScoreCal {
    public static int Calculate(String name, int... scores) {
        int Score = 0;
        for (int score : scores) {
            Score += score;
        }
        return Score;
    }

    public static void main(String[] args) {
        String name = "肖国涛";
        int[] Scores = {786786, 6276, 672578, 36728, 692782};

        int totalScore = Calculate(name, Scores);

        System.out.println(name + "的总分是：" + totalScore);
    }
}