import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static Scanner _inputFromThePlayer = new Scanner(System.in);

    protected static int _chooseTheLevel;       //the level which the player chooses
    protected static int _theMinimumNumber;     //the minimum number in the interval
    protected static int _theHighestNumber;     //the highest number in the interval
    protected static int _theRightAnswer;       //the randomized number
    protected static int _theGuessesLeft;       //the number of guesses which are left
    protected static int _theNumberOfGuesses;   //the number of guesses which the player choose
    protected static int _theGuessedNumber;     //the number which the player guessed
    protected static boolean run = true;        //the program will run until this is true
    protected static int _playAgainOrNot;       //the player choose to play again or not

    public static void main(String[] args) {

        launchGuesseyGame();
    }

    /**
     *
     * This method makes the answer.
     * @param _theHighestNumber the highest number in the interval
     * @param _theMinimumNumber the minimum number in the interval
     * @return the number which the player has to guess
     */
    protected static int theRightAnswer(int _theHighestNumber, int _theMinimumNumber){
        Random theAnswer = new Random();

        return theAnswer.nextInt(_theHighestNumber - _theMinimumNumber +1 ) +
                _theMinimumNumber;
    }

    /**
     *
     * This method contains the code of the game.
     * This will contain the whole game.
     */
    protected static void launchGuesseyGame(){

        do {


        while (run) {
            System.out.println("Hello and welcome to Guessey game.");
            System.out.println();
            System.out.println("This a guess game.\n" +
                    "You will choose a level and then guess the \"unknown\" number.\n" +
                    "You win if you guess right.\n" +
                    "You lose if you don't have any guesses left.");
            System.out.println();
            System.out.println("Choose the level: \n" + "1. Easy\n" + "2. Medium\n"
                    + "3. Hard\n" + "0. GoodBye");
            System.out.println();
            System.out.println("Please write the chosen number down blow");

            _chooseTheLevel = _inputFromThePlayer.nextInt();
            System.out.println();

            switch (_chooseTheLevel) {
                case 0:
                    System.out.println("Hope to see you soon.");

                    break;

                case 1:
                    easyMode();

                    break;

                case 2:
                    mediumMode();

                    break;

                case 3:
                    hardMode();

                    break;

            }
            System.out.println("Do you want to play again?");
            System.out.println();
            System.out.println("Write the chosen number and press enter");
            System.out.println("1. Yes");
            System.out.println("2. No");
            System.out.println();

            _playAgainOrNot = _inputFromThePlayer.nextInt();

            switch (_playAgainOrNot){
                case 1:
                    break;

                case 2:
                    run = false;
                    System.out.println();
                    System.out.println("Hope to see you soon.");
            }
        }
        }while (run);
    }

    /**
     *
     * This method contains the easiest mode of this game.
     */
    protected static void easyMode(){

        System.out.flush();
        System.out.println("How many guesses do you want?");
        _theNumberOfGuesses = _inputFromThePlayer.nextInt();
        System.out.println("Write the minimum number of the interval which you " +
                "want to play between: ");
        _theMinimumNumber = _inputFromThePlayer.nextInt();
        System.out.println("Write the highest number of the interval which you " +
                "want to play between: ");
        _theHighestNumber = _inputFromThePlayer.nextInt();

        System.out.println("You chose a interval between " + _theMinimumNumber +
                " - " + _theHighestNumber + " and you have " + _theNumberOfGuesses +
                " guesses to guess the number.");

        theAlgorithmOfTheGame();

    }

    /**
     *
     * This method contains the medium mode of this game.
     * This will complain how this mode works.
     */
    protected static void mediumMode(){

        System.out.flush();
        _theNumberOfGuesses = 10;
        System.out.println("Write the minimum number of the interval which you " +
                "want to play between: ");
        _theMinimumNumber = _inputFromThePlayer.nextInt();
        System.out.println("Write the highest number of the interval which you " +
                "want to play between: ");
        _theHighestNumber = _inputFromThePlayer.nextInt();

        System.out.println("You chose a interval between " + _theMinimumNumber +
                " - " + _theHighestNumber + " and you have 10 guesses to guess the number.");

        theAlgorithmOfTheGame();


    }

    /**
     *
     * This method contains the hardest mode of this game.
     * This says how the game plays and so on.
     */
    protected static void hardMode(){

        System.out.flush();
        _theNumberOfGuesses = 5;
        _theMinimumNumber = 1;
        _theHighestNumber = 100;

        System.out.println("we chose a number between " + _theMinimumNumber +
                " - " + _theHighestNumber + " and you have " + _theNumberOfGuesses +
                " guesses to guess the number.");

        theAlgorithmOfTheGame();


    }

    /**
     *
     * This is the algorithm of the game. It means how the game works.
     */
    private static void theAlgorithmOfTheGame() {

        System.out.println("Pleas try your first try ");

        _theRightAnswer = theRightAnswer(_theHighestNumber, _theMinimumNumber);


        for(int i = 1; i <= _theNumberOfGuesses; i--){


            _theGuessedNumber = _inputFromThePlayer.nextInt();
            _theNumberOfGuesses--;

            if (_theGuessedNumber == _theRightAnswer){
                System.out.println("Congurats!!!\n" +
                        "You just won the game!\n" +
                        "You are so smart!");
                System.out.println();
                break;
            }
            else if (_theNumberOfGuesses != 0) {

                if (_theGuessedNumber > _theRightAnswer) {
                    System.out.println("You guessed wrong :( \n" +
                            "Don't give up! Try a lower number :) \n" +
                            "You have " + _theNumberOfGuesses + "guesses left");
                }
                else if (_theGuessedNumber < _theRightAnswer) {
                    System.out.println("You guessed wrong :( \n" +
                            "Don't give up! Try a higher number :) \n" +
                            "You have " + _theNumberOfGuesses + "guesses left");

                }
            }
            else{
                System.out.println("It's so sad,\n" +
                        "You lost.\n" +
                        "But don't give up, you can win next time.");

                break;
            }
        }
    }
}
