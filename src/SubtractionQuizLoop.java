import java.util.Scanner;

public class SubtractionQuizLoop {

    public static void main(String[] args) {
        String playAgain = "";
        Scanner replayScanner = new Scanner(System.in);

        do {

            SubtractionQuizLoop subtractionQuizLoop = new SubtractionQuizLoop();
            subtractionQuizLoop.subtractionQuizTest();

            System.out.print("Enter Yes to play again, and anything to quit: ");
            playAgain = replayScanner.nextLine();
        }
        while (playAgain.equalsIgnoreCase("Yes"));

        System.out.println("Thanks for taking the quiz.");
    }

    public void subtractionQuizTest() {
        final int questionAmount = 5;
        int questionsAsked = 0;
        int questionsCorrect = 0;
        int number1 = 0;
        int number2 = 0;
        int subtractionAnswer = 0;
        int scannedSubtractionAnswer = 0;
        Scanner scanner = new Scanner(System.in);

        while (questionsAsked < questionAmount) {

            number1 = (int) (Math.random() * 10);
            number2 = (int) (Math.random() * 10);
            subtractionAnswer = number1 - number2;

            System.out.println("Question " + (questionsAsked + 1) + ":");
            System.out.println("What is " + number1 + " - " + number2 + "?");
            scannedSubtractionAnswer = scanner.nextInt();

            if (scannedSubtractionAnswer == subtractionAnswer) {

                System.out.println("Correct! The answer is indeed " + subtractionAnswer);
                System.out.println();

                questionsCorrect++;

            } else {

                System.out.println("Wrong! The answer is " + subtractionAnswer);
                System.out.println();
            }

            //System.out.println(number1 + " + " + number2 + " = " + subtraction);


            questionsAsked++;
        }

        System.out.println("You got " + questionsCorrect + " correct out of " + questionsAsked + ".");

    }
}
