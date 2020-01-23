import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class FindArrayList {

    public static void main (String []args) {

        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        ArrayList<Integer> numList = new ArrayList<>();

        // adds 10 random numbers to the array list
        for (int i = 0; i < 10; i++) {
            int randomNumToAdd = 1 + rand.nextInt(51);
            numList.add(randomNumToAdd);
        }
        System.out.print("Enter a number: ");
        int numToSearch = in.nextInt();
        int count = 0;
        boolean isInList = false;
        //checks to see if the user inputted number exists in the random ArrayList
        //If it does; increment count and set the flag to true
        //Otherwise do nothing
        for (int i = 0; i < numList.size(); i++) {
            if (numList.get(i) == numToSearch) {
                count++;
                isInList = true;
            }
        }

        System.out.println("ArrayList: " + numList);
        System.out.println("Value to find: " + numToSearch);
        if (isInList == true) {
            System.out.println(numToSearch + " is in the ArrayList " + count + " times");
        } else {
            System.out.println(numToSearch + " is not in the ArrayList.");
        }

    }
}

