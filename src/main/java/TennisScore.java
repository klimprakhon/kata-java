import java.util.Map;

public class TennisScore {
    private final Map<Integer, String> ScoreLadder = Map.of(
            0, "Love",
            1, "Fifteen",
            2, "Thirty",
            3, "Forty"
    );

    private int player1WinBall = 0;
    private int player2WinBall = 0;

    public String getScore() {
        int MAX_SCORE = 3;
        boolean isNormalGame = player1WinBall <= MAX_SCORE && player2WinBall <= MAX_SCORE;
        boolean isDeuce = player1WinBall >= MAX_SCORE && player2WinBall >= MAX_SCORE && player1WinBall == player2WinBall;

        if (isDeuce) {
            return deuceGame();
        }

        if (isNormalGame) {
            return normalGame();
        }

        return matchPointGame();
    }

    public void player1WinTheBall (int winBall) {
        player1WinBall = winBall;
    }

    public void player2WinTheBall (int winBall) {
        player2WinBall = winBall;
    }

    public String normalGame () {
        String player1Score = ScoreLadder.get(player1WinBall);
        String player2Score = ScoreLadder.get(player2WinBall);

        return player1Score + "-" + player2Score;
    }

    public String deuceGame () {
        return "Deuce";
    }

    public String matchPointGame () {
        String winPlayer;
        if (player1WinBall > player2WinBall) {
            winPlayer = "Player1";
        } else {
            winPlayer = "Player2";
        }

        boolean isMatchPoint = Math.abs(player1WinBall - player2WinBall) == 1;

        if (isMatchPoint) {
            return winPlayer + " - Advantage";
        }

        return winPlayer + " - Win";
    }
}
