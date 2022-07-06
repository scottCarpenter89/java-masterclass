package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	boolean gameOver = true;
    int score = 800;
    int levelCompleted = 5;
    int bonus = 100;

    if (score < 5000 && score > 1000) {
        System.out.println("Your score was less than 5000, but good game");
    } else if (score < 1000) {
        System.out.println("Your score was less than 1000");
    } else {
        System.out.println("Got here");
    }

    if (gameOver) {
        int finalScore = score + (levelCompleted * bonus);
        System.out.println("Your final score is " + finalScore);
    }

    score = 10000;
    levelCompleted = 8;
    bonus = 200;

    if (gameOver) {
        int finalScore = score + (levelCompleted * bonus);
        System.out.println("Your new high score is " + finalScore);
    }
     }
}
