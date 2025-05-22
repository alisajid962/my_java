import java.util.Sacnner;
import java.util.ArrayList;

public class Array_list {

    public static void main(String[] args) {
        ArrayList<String> days = new ArrayList<>();
        //usage of array list
        days.add("Monday");
        days.add("tueday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");
        ArrayList<Integer> expenses = new ArrayList<>();
        expenses.add(1200);
        expenses.add(800);
        expenses.add(950);
        expenses.add(1300);
        expenses.add(760);
        expenses.add(1100);
        expenses.add(980);  // Example data
        int total = 0;
        int max = expenses.get(0);
        int maxIndex = 0;

        for (int i = 0; i < expenses.size(); i++) {
            total += expenses.get(i);
            if (expenses.get(i) > max) {
                max = expenses.get(i);
                maxIndex = i;

            }
        }
        System.out.println("Total weekly expense: " + total);
        System.out.println("Highest expense on: " + days.get(maxIndex) + " (" + max + ")");

    }
}
