import java.util.ArrayList;
import java.util.Scanner;

public class ColorsArrayList {

    public static void main (String []args) {

        Scanner in = new Scanner(System.in);

        ArrayList<String> colorsList = new ArrayList<String>();
        colorsList.add("red");
        colorsList.add("blue");
        colorsList.add("green");

        //prints all values of the color array list
        for (String s : colorsList) {
            System.out.println(s);
        }

        //prints value at index 1 of the colors array list
        System.out.println(colorsList.get(1));

        //prompt user to enter new color and adds that color the list
        //until the user quits
        String colorInput;
        do {
            System.out.print("Enter a color: (enter Q or q to quit) ");
            colorInput = in.nextLine();
            if (!(colorInput.equalsIgnoreCase("Q"))) {
                colorsList.add(colorInput);
            }
        } while (!(colorInput.equalsIgnoreCase("Q")));

        //prints all values of the color array list
        for (String s : colorsList) {
            System.out.println(s);
        }

    }

}
