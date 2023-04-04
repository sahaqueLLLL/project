import java.util.Scanner;

public class Game {

    void startGame() {
        System.out.println("Hello user! This is a simple math game. \nPress 'r' to show the rules or 'w' to start.");
        int symbol = Main.sc.nextLine().charAt(0);
        if (symbol == 'r'){
            showRules();
            startGame();
        } else if (symbol == 'w') {
            theGameItself();
        }
        else {
            throw new RuntimeException("Incorrect symbol");
        }
    }
    static private void showRules() {
        System.out.println("The rules are very easy. \nYou will be shown some integer numbers and you need to write the sum of them." +
                "\n If you are right the game continues until you press '1' to end it. \n In case of incorrect answer the game ends and you will be able to" +
                "see your score."
        );
    }
    static private int theGameItself() {
        int score = 0;
        int a;
        int b;
        boolean incorrectAnswer = false;
        while (!incorrectAnswer) {
            a = (int) (Math.random() * 90 + 10);
            b = (int) (Math.random() * 90 + 10);
            System.out.println(a + " " + b);
            int currentAnswer = Main.sc.nextInt();
             if (currentAnswer == 1) {
                break;

             } else if (currentAnswer != a + b) {
                 incorrectAnswer = true;
                 System.out.println("Wrong!");

             } else {
                System.out.println("Right!");
                score++;
            }

            }
        System.out.print("Your score is: " + score);
        return score;
    }










}
