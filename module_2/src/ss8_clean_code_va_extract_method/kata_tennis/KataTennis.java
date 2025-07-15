package module_2.src.ss8_clean_code_va_extract_method.kata_tennis;

public class KataTennis {
    public static String getScore(String player1, String player2, int score1, int score2) {
        if (isDraw(score1, score2)) {
            return getDrawScore(score1);
        } else if (isEndGame(score1, score2)) {
            return getAdvantageOrWin(score1, score2, player1, player2);
        } else {
            return getNormalScore(score1, score2);
        }
    }

    private static boolean isDraw(int score1, int score2) {
        return score1 == score2;
    }

    private static boolean isEndGame(int score1, int score2) {
        return score1 >= 4 || score2 >= 4;
    }

    private static String getDrawScore(int score) {
         return switch (score) {
            case 0->"Love-All";
            case 1->"Fifteen-All";
            case 2-> "Thirty-All";
            case 3->"Forty-All";
            default-> "Deuce";
        };
    }

    private static String getAdvantageOrWin(int score1, int score2, String player1, String player2) {
        int diff = score1 - score2;
        if (diff == 1) return "Advantage " + player1;
        if (diff == -1) return "Advantage " + player2;
        if (diff >= 2) return "Win for " + player1;
        return "Win for " + player2;
    }

    private static String getNormalScore(int score1, int score2) {
        return getScoreTerm(score1) + "-" + getScoreTerm(score2);
    }

    private static String getScoreTerm(int score) {
         return switch (score) {
            case 0 ->"Love";
            case 1->"Fifteen";
            case 2->"Thirty";
            case 3-> "Forty";
            default-> "";
        };
    }

    public static void main(String[] args) {
        String result = KataTennis.getScore("Thành", "Tịnh", 3, 2);
        System.out.println(result);
    }
}
