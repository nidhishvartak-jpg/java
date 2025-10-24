import java.util.Scanner;
public class Div{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

try{
System.out.println("Enter value of a :");
int a = sc.nextInt();
System.out.println("Enter value of b :");
int b = sc.nextInt();
int result = a/b;
System.out.println("Result : "+result);

}
catch(ArithmeticException e){
System.out.println("Division by Zero is not possible..");
}
catch(Exception e){
System.out.println("Unexpected Error..");
}
finally{
System.out.println("Code executed Successfully..");
sc.close();
}
}
}