import java.util.Scanner;
public class Array{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int[] a = {10,11,12,13,14,15};
 
try{
System.out.println("Enter index :");
int n = sc.nextInt();
System.out.println("Element at Index "+ n +" is: "+a[n]);
 
}
catch(ArrayIndexOutOfBoundsException e){
System.out.println("Error: Index is out of Bounds..");
}
catch(Exception e){
System.out.println("Unexpected Error..");
}
finally{
System.out.println("Code executed Successfully..");
sc.close();
}
}   }
