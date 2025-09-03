import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Student_Record_file_Manager {
   static void DisplayAllRecords(){
     try{
         File file = new File("Student_Records.txt");
         BufferedReader reader = new BufferedReader(new FileReader(file));
         String line;
         while((line =reader.readLine())!= null){
             String[] parts =line.split(",");
             if(parts.length==3){
                 System.out.println(
                         "ID: "+ parts[0].trim()+
                         ",Name: " +parts[1].trim()+
                         ",Department: "+parts[2].trim()
                 );
             }
         }

     } catch (Exception e) {
         throw new RuntimeException(e);
     }
    }
   static void addStudent(){
        try{
            File file = new File("Student_Records.txt");
            BufferedWriter writer = new BufferedWriter(new FileWriter(file,true));
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter ID: ");
            String id = sc.nextLine();
            System.out.println("Enter Student Name: ");
            String name =sc.nextLine();
            System.out.println("Enter Department: ");
            String Department =sc.nextLine();
            writer.write(id+","+name+","+Department);
            writer.newLine();
            writer.close();
            System.out.println("-------Student Added Successfully------");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    static  void SearchStudent(){
        try{
            Scanner sc =  new Scanner(System.in);
            System.out.println("Enter ID: ");
            String id = sc.nextLine();

            id=id.trim();
            String line;
            File file = new File("Student_Records.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            while((line = reader.readLine())!=null){
                String [] parts =line.split(",");
                if(parts[0].trim().equals(id)){
                    System.out.println("-------Record Found--------");
                    System.out.println(
                            "ID: "+ parts[0].trim()+
                                    ",Name: " +parts[1].trim()+
                                    ",Department: "+parts[2].trim()
                    );

                }

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        try{
            File file = new File("Student_Records.txt");
            if(file.createNewFile()){
                System.out.println("File Created");
            } else if (file.exists()) {
                System.out.println("File Already Exists");
            }
            else{
                System.out.println("File not Found!");
            }
        } catch (Exception e) {
            System.out.println("Error Occurred");
            throw new RuntimeException(e);
        }

        while(true){
            System.out.println("-----------------------");
            System.out.println("1.Display All Students");
            System.out.println("2.Add Student");
            System.out.println("3.Search Student");
            System.out.println("4.Exit");
            System.out.println("Enter your Choice: ");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                   DisplayAllRecords();
                   break;
                case 2:
                    addStudent();
                    break;
                case 3:
                    SearchStudent();
                    break;
                case 4:
                    System.out.println("----Good Bye------");
                    System.exit(0);

            }


        }



    }
}
