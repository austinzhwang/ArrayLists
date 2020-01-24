import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Hangman {

    public static void main (String []args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        String wordArray [] = {
                "tree"
                , "rain"
                , "bear"
                , "encourage"
                , "promise"
                , "soup"
                , "chess"
                , "insurance"
                , "pancakes"
                , "stream"
        };
        //Initialize array list with words from an array
        ArrayList<String> wordList = new ArrayList<>();
        for (String s : wordArray) {
            wordList.add(s);
        }

        boolean hasWon = false;
        int guessCounter = 0;
        int randomWordPos = rand.nextInt(wordList.size());
        String randomWord = wordList.get(randomWordPos);
        String [] guessArray = new String [randomWord.length()];
        //initialize the guess array with "_ " depending on the length of the random word
        for (int i = 0; i < guessArray.length; i++) {
            guessArray[i] = "_ ";
        }
        System.out.println("Welcome, Let's play Hangman!");
        // Outputs the length of the hidden word with "_ "
        System.out.print("Here is the word I am thinking of: ");
        for (int i = 0; i < randomWord.length(); i++) {
            System.out.print("_ ");
        }

        do {
            System.out.println();
            System.out.print("Enter letter or word guess: ");
            String guessInput = in.nextLine();
            //if the user doesnt guess the word correctly, increment the counter by 1
            if (!(guessInput.equals(randomWord))) {
                guessCounter++;
                System.out.println("You have guessed incorrectly " + guessCounter + "/6 times.");
            }
            //if the number of guess reaches 6; end the game
            if (guessCounter == 6) {
                System.out.println("Sorry, you have no more guesses left. The word was " + randomWord + ".");
                break;
            }

            //If user guesses the correct word; output that they won with the correct word
            if (randomWord.equals(guessInput)) {
                System.out.println("You've won! The word was: " + randomWord);
                hasWon = true;
            } else {
                System.out.print("Your guess so far: ");
                for (int i = 0; i < randomWord.length(); i++) {
                    String s = randomWord.charAt(i) + "";
                    char c = guessArray[i].charAt(0);
                    //if the user guesses a correct letter replace the "_ " in that position with the letter.
                    if (s.equals(guessInput)) {
                        guessArray[i] = s + " ";
                    } else if (!Character.isLetter(c)) {
                        guessArray[i] = "_ ";
                    }
                    System.out.print(guessArray[i]);
                }
            }

        } while (guessCounter < 6 && hasWon != true);
        System.out.println("Thank you for playing!");
    }
}
