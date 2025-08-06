import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TennisScoreTest {
    @Test
    public void InitialScoreIsLove_Love () {
        // Arrange
        String expectedScore = "Love-Love";
        TennisScore tennisScore = new TennisScore();

        // Act
        String actualScore = tennisScore.getScore();

        // Assert
        assertEquals(expectedScore, actualScore);
    }

    @Test
    public void Player1WinTheBall_ScoreIsFifteenLove () {
        // Arrange
        String expectedScore = "Fifteen-Love";
        TennisScore tennisScore = new TennisScore();

        // Act
        tennisScore.player1WinTheBall(1);
        String actualScore = tennisScore.getScore();

        // Assert
        assertEquals(expectedScore, actualScore);
    }

    @Test
    public void Player1WinOneBall_Player2WinOneBall_ScoreIsFifteenLove() {
        // Arrange
        String expectedScore = "Fifteen-Fifteen";
        TennisScore tennisScore = new TennisScore();

        // Act
        tennisScore.player1WinTheBall(1);
        tennisScore.player2WinTheBall(1);
        String actualScore = tennisScore.getScore();

        // Assert
        assertEquals(expectedScore, actualScore);
    }

    @Test
    public void Player1WinTwoBalls_Player2WinOneBall_ScoreIsThirtyFifteen() {
        // Arrange
        String expectedScore = "Thirty-Fifteen";
        TennisScore tennisScore = new TennisScore();

        // Act
        tennisScore.player1WinTheBall(2);
        tennisScore.player2WinTheBall(1);
        String actualScore = tennisScore.getScore();

        // Assert
        assertEquals(expectedScore, actualScore);
    }
    
    @Test
    public void Player1WinThreeBalls_Player2WinOneBall_ScoreIsFortyFifteen() {
        // Arrange
        String expectedScore = "Forty-Fifteen";
        TennisScore tennisScore = new TennisScore();

        // Act
        tennisScore.player1WinTheBall(3);
        tennisScore.player2WinTheBall(1);
        String actualScore = tennisScore.getScore();

        // Assert
        assertEquals(expectedScore, actualScore);
    }

    @Test
    public void Player1WinThreeBalls_Player2WinTwoBalls_ScoreIsFortyThirty() {
        // Arrange
        String expectedScore = "Forty-Thirty";
        TennisScore tennisScore = new TennisScore();

        // Act
        tennisScore.player1WinTheBall(3);
        tennisScore.player2WinTheBall(2);
        String actualScore = tennisScore.getScore();

        // Assert
        assertEquals(expectedScore, actualScore);
    }

    @Test
    public void Player1WinThreeBalls_Player2WinThreeBalls_ScoreIsDeuce() {
        // Arrange
        String expectedScore = "Deuce";
        TennisScore tennisScore = new TennisScore();

        // Act
        tennisScore.player1WinTheBall(3);
        tennisScore.player2WinTheBall(3);
        String actualScore = tennisScore.getScore();

        // Assert
        assertEquals(expectedScore, actualScore);
    }

    @Test
    public void Player1WinFourBalls_Player2WinThreeBalls_ScoreIsPlayer1_Advantage() {
        // Arrange
        String expectedScore = "Player1 - Advantage";
        TennisScore tennisScore = new TennisScore();

        // Act
        tennisScore.player1WinTheBall(4);
        tennisScore.player2WinTheBall(3);
        String actualScore = tennisScore.getScore();

        // Assert
        assertEquals(expectedScore, actualScore);
    }

    @Test
    public void Player1WinFiveBalls_Player2WinThreeBalls_ScoreIsPlayer1_Win() {
        // Arrange
        String expectedScore = "Player1 - Win";
        TennisScore tennisScore = new TennisScore();

        // Act
        tennisScore.player1WinTheBall(5);
        tennisScore.player2WinTheBall(3);
        String actualScore = tennisScore.getScore();

        // Assert
        assertEquals(expectedScore, actualScore);
    }

    @Test
    public void Player1WinFourBalls_Player2WinTwoBalls_ScoreIsPlayer1_Win() {
        // Arrange
        String expectedScore = "Player1 - Win";
        TennisScore tennisScore = new TennisScore();

        // Act
        tennisScore.player1WinTheBall(4);
        tennisScore.player2WinTheBall(2);
        String actualScore = tennisScore.getScore();

        // Assert
        assertEquals(expectedScore, actualScore);
    }

    @Test
    public void Player1WinFiveBalls_Player2WinFiveBalls_ScoreIsDeuce() {
        // Arrange
        String expectedScore = "Deuce";
        TennisScore tennisScore = new TennisScore();

        // Act
        tennisScore.player1WinTheBall(5);
        tennisScore.player2WinTheBall(5);
        String actualScore = tennisScore.getScore();

        // Assert
        assertEquals(expectedScore, actualScore);
    }

    @Test
    public void Player1WinSixBalls_Player2WinFourBalls_ScoreIsPlayer1_Win() {
        // Arrange
        String expectedScore = "Player1 - Win";
        TennisScore tennisScore = new TennisScore();

        // Act
        tennisScore.player1WinTheBall(6);
        tennisScore.player2WinTheBall(4);
        String actualScore = tennisScore.getScore();

        // Assert
        assertEquals(expectedScore, actualScore);
    }
}
