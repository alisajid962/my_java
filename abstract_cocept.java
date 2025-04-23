abstract class payment_methods{
    String name;

    payment_methods(String name){
        this.name=name;
    }

    abstract void pay(); // abstarct method
     void displayinfo(){
        System.out.println("Name: "+name);

     }
}
// concrete subclass
class paypal extends payment_methods{
        String paypal_id ;
        paypal(String name ,String paypal_id){
            super(name);
            this.paypal_id=paypal_id;
        }
        @Override
        void pay(){
            System.out.println("Payment done using paypal id: "+paypal_id);
        }
        @Override
        // overriding the displayinfo method of parent class
        void displayinfo(){
            super.displayinfo();
            System.out.println("Paypal id: "+paypal_id);
        }
    
}
class bank extends payment_methods {
    int account_no;
    String bank_name;
    bank(String bank_name,String name,int account_no ){
        super(name);
        this.account_no=account_no;
        this.bank_name=bank_name;
    }
    @Override
    void pay(){
        System.out.println("Payment done using the bank account no : "+account_no);
    }
    @Override
    void displayinfo(){
        super.displayinfo();
        System.out.println("Bank name: "+bank_name);
        System.out.println("Account no: "+account_no);
    }
}
class credit_card extends payment_methods{
    String card_no;
    credit_card(String name,String card_no){
        super(name);
        this.card_no=card_no;
    }
    @Override
    void pay(){
        System.out.println("Payment done using the credit card no: "+card_no);
    }
    @Override
    void displayinfo(){
        super.displayinfo();
        System.out.println("Card no: "+card_no);
    }
}

public class abstract_cocept {
    public static void main(String[] args) {
        payment_methods p1 = new paypal("mark zuckerberg","mark@134paypal");
        payment_methods p2 = new bank("state bank","sundar pichai",123456789);
        payment_methods p3 = new credit_card("elon musk","1234-5678-9101-1121");

        p1.displayinfo();
        p1.pay();
       System.out.println(); // for better readability
        p2.displayinfo();
        p2.pay();
        System.out.println(); // for better readability
        p3.displayinfo();
        p3.pay();
        // Dynamic method dispatch

    }
}
