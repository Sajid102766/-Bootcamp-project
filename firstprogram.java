public class firstprogram 

      
{
      public static String productName = "puma";
      public static void main(String args[]) {
            System.out.println("This is my first program");
      


String collegename = "Suresh Gyan Vihar university";
String address = "121, jagatpura, jaipur, 302017";
int age = 32; 
float per= 98.4f;
float f1=10;
double value = 10.50;
System.out.println("product name : "+productName);


String productName = "motrola G85";
double productPrice = 16999;
float productRating=4.5f;
double productMRP =20999;
System.out.println("product name : "+productName);
testvariableTypes();
testConditionalstatement();

}

public static void testvariableTypes(){
  System.out.println("inside test variable type method");
  System.out.println("product name : "+productName);
}
public static void testConditionalstatement(){
      int a = 10;
      int b = 25;
      int c = 19;
      if (a>=b && a>c)
      {
            System.out.println(" a is greater");
      } 
      else if (b>c){
            System.out.println("b is greater");
      }
      else{
            System.out.println("c is greater");
      }
}

}
      