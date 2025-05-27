import java.sql.SQLOutput;

public class Copy_constructor {
   private String name;
    private int roll_no;
    //original constructor
    Copy_constructor(String name, int roll_no){
        this.name=name;
        this.roll_no=roll_no;
    }


    //copy constructor
    Copy_constructor(Copy_constructor a){
        this.name = a.name;
        this.roll_no=a.roll_no;
    }
    void Display(){
        System.out.println("Name : "+name);
        System.out.println("Roll No :"+roll_no);
    }
    public static void main(String[] args) {

        Copy_constructor s1 = new Copy_constructor("ALi",1234);
        s1.Display();

        //copy constructor
        Copy_constructor s2 = new Copy_constructor(s1);
        System.out.println("Copy Constructor");
        s2.Display();



    }
}
