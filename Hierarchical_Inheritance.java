 class Shape {
    int comarearea( Shape other){
        double thisarea= this.area();
        double otherarea = other.area();
     if (thisarea>otherarea){
        return 1;
     }
     else if(thisarea<otherarea){
        return -1;
     }
     else {
        return 0;
     }
        
    }
    double area(){
       return 0.0;
       }
      void displayshape(){
   System.out.println("This is a shape");
      }}

      class circle extends Shape{
        double radius;
        circle (double radius){
            this.radius=radius;}
            @Override
            double area(){
                  double ar =3.14*radius*radius;
                  return ar;
            }
            @Override
            void displayshape(){
                System.out.println("THIS IS A CIRCLE ");
            }
            public int comparearea( Shape other){
                double thisarea= this.area();
                double otherarea = other.area();
             if (thisarea>otherarea){
                return 1;
             }
             else if(thisarea<otherarea){
                return -1;
             }
             else {
                return 0;
             }
             }
      }
      class Rectangle extends Shape{
        double width;
        double height;
        Rectangle(double width,double height){
            this.width=width;
            this.height=height;
        }
        @Override
        double area(){
        double ar = width*height;
        return ar;

        }
        @Override
        void displayshape(){
            System.out.println("THIS IS A RECTANGLE");
        }

     
        public int comarearea( Shape other){
            double thisarea= this.area();
            double otherarea = other.area();
         if (thisarea>otherarea){
            return 1;
         }
         else if(thisarea<otherarea){
            return -1;
         }
         else {
            return 0;
         }
         }


      }
      class Triangle extends Shape{
        double base;
        double height;
        Triangle(double base,double height){
            this.base=base;
            this.height=height;
        }
        @Override
        double area(){
            double area = 0.5*base*height;
            return area;

        }
        @Override
        void displayshape(){
            System.out.println("THIS IS A RECTANGLE ");
        }
        public int comarearea( Shape other){
            double thisarea= this.area();
            double otherarea = this.area();
         if (thisarea>otherarea){
            return 1;
         }
         else if(thisarea<otherarea){
            return -1;
         }
         else {
            return 0;
         }
         }
    
    
    } 
        public class Hierarchical_Inheritance{

            public static void main(String[] args) {
                circle c1 = new circle(3);
                System.out.println( c1.area());
                 c1.displayshape();
                Rectangle r1= new Rectangle(3, 4);
               System.out.println( r1.area());
                r1.displayshape();
                Triangle t1 = new Triangle(2,2);
               System.out.println(t1.area());
              t1.displayshape();
              System.out.println("COMPARING CIRCLE AND RECTANGEL :"+c1.comarearea(r1));
              System.out.println("COMAPRING RECTANGLE AND TRIANGLE : "+ r1.comarearea(t1));
              System.out.println("COMPARING TRIANDLE AND CIRCLE : "+t1.comarearea(c1));;
            }
        }
       
     
        
   
    

