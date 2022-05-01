package com.timbuchalka;

public class Main {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelComplete = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelComplete, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelComplete = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelComplete, bonus);
        System.out.println("Your final score was " + highScore);


        calculateScore(true, 800, 5, 100);
        calculateScore(true, 10000, 8, 200);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Persey", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Gilbert", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Louise", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Carol", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Frank", highScorePosition);

    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {

        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {

        if (playerScore >= 1000) {
            return 1;
        } else if (500 <= playerScore && playerScore < 1000) {
            return 2;
        } else if (100 <= playerScore && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;


    }
}

