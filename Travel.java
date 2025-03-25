package oop;
import java.util.Scanner;

class Travel {
    private int kilometers;
    private int hours;
 Travel() {
        this.kilometers = 0;
        this.hours = 0;
    }
    public void get() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter kilometers traveled: ");
        kilometers = sc.nextInt();
        System.out.print("Enter hours traveled: ");
        hours = sc.nextInt();
    }
    public void show() {
        System.out.println("Kilometers traveled: " + kilometers);
        System.out.println("Hours traveled: " + hours);
    }

    
    public Travel add(Travel obj) {
        Travel temp = new Travel(); 
        temp.kilometers = this.kilometers + obj.kilometers;
        temp.hours = this.hours + obj.hours;
        return temp; 
    }

    public static void main(String[] args) {
     
        Travel t1 = new Travel();
        Travel t2 = new Travel();

      
        System.out.println("Enter details for Travel 1:");
        t1.get();

        System.out.println("Enter details for Travel 2:");
        t2.get();

        System.out.println("\nTravel 1 details:");
        t1.show();
        
        System.out.println("Travel 2 details:");
        t2.show();

        Travel t3 = t1.add(t2);

        System.out.println("Travel 3 Result of Travel 1 + Travel 2:");
        t3.show();
    }
}
