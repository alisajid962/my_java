import java.util.Scanner;
class food{
    String name;
    int price;
    food(String name,int price ){
        this.name =name;
        this.price =price;
    }



    void display(){
        System.out.println("Name: "+name);
        System.out.println("Price: "+price);
    }
}











public class object_arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of food items: ");
        int n = sc.nextInt();
        food[] foodArray = new food[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the name of food item "+(i+1)+": ");
            String name = sc.next();
            System.out.println("Enter the price of food item "+(i+1)+": ");
            int price = sc.nextInt();
            foodArray[i] = new food(name,price);
        }
        System.out.println("Food items are: ");
        for(int i=0;i<n;i++){
            foodArray[i].display();
        }

      
    }
}