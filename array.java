public class array {
    public static void main(String[] args) {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int[] expenses = {1200, 800, 950, 1300, 760, 1100, 980};  // Example data

        int total = 0;
        int max = expenses[0];
        int maxIndex = 0;

        for (int i = 0; i < expenses.length; i++) {
            total += expenses[i];
            if (expenses[i] > max) {
                max = expenses[i];
                maxIndex = i; 
            }
        }

        System.out.println("Total weekly expense: " + total);
        System.out.println("Highest expense on: " + days[maxIndex] + " (" + max + ")");
    }
}
