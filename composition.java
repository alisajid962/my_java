class heart {
    String heartrate;
    String blood_group;

    heart(String hr, String bg) {
        heartrate = hr;
        blood_group = bg;
    }
    void beat(){
        System.out.println("Heart is at "+ heartrate+"beating");
    }
}
class person{
    String name;
    int age;
    heart h;
    person(String n,int a){
        name = n;
        age = a;
      // this.h = new heart(h.heartrate,h.blood_group);
        this.h = new heart("3","O+");
    }
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Heart Rate: " + h.heartrate);
        System.out.println("Blood Group: " + h.blood_group);
}}

public class composition {
    public static void main(String[] args) {

        person p2 = new person("qazi",23);
        p2.displayInfo();
    }
}
