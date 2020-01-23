import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Random;
public class MoviesArrayList {

    public static void main (String []args) {

        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        ArrayList<String> moviesList = new ArrayList<String>();

        //prompt user to enter new movie and adds that movie the list
        //until the user quits
        String movieInput;
        do {
            System.out.print("Enter a movie: (enter Q or q to quit) ");
            movieInput = in.nextLine();
            if (!(movieInput.equalsIgnoreCase("Q"))) {
                moviesList.add(movieInput);
            }
        } while (!(movieInput.equalsIgnoreCase("Q")));

        //prints all values of the movies array list in abc order
        Collections.sort(moviesList);
        for (String s : moviesList) {
            System.out.println(s);
        }

        //Randomly selects a movie from the list and prints it to the user
        System.out.println("Recommended movie: " + moviesList.get(rand.nextInt(moviesList.size())));

        in.close();
    }

}
