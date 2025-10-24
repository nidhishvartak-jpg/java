import java.util.Scanner;
 
public class Number{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
try{
System.out.println("Enter First Number:");
int a = Integer.parseInt(sc.nextLine());
System.out.println("Enter Second Number:");
int b = Integer.parseInt(sc.nextLine());
System.out.println("result :"+(a/b));
}
catch(ArithmeticException e){
System.out.println("Division by Zero is not possible..");
}
catch(NumberFormatException e){
System.out.println("Integers are only Allowed..");
}
catch(Exception e){
System.out.println("Unexpected Exception...");
}
finally{
System.out.println("Code executed Successfully...");
}  }  }
