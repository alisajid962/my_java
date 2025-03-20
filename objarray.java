import java.util.*;
public class objarray {

private String name;
private String id;
private String dep;
objarray(){

}

objarray(String name, String id, String dep){
this.name = name;
this.id = id;
this.dep = dep;
}
void input(){

    System.out.println("Enter name: ");
    Scanner sc = new Scanner(System.in);
    name = sc.nextLine();
    System.out.println("Enter id: ");
    id = sc.nextLine();
    System.out.println("Enter department: ");
    dep = sc.nextLine();
}

void display(){
System.out.println("Name: " + name + ", ID: " + id+	", Dep: " + dep);
}

    public static void main(String[] args) {
        objarray [] fa23 = new objarray[4];
        for(int i=0; i<4; i++){
            fa23[i] = new objarray();
            fa23[i].input();
        }
        for(int i=0; i<4; i++){

            fa23[i].display();
        }
       
    }}
