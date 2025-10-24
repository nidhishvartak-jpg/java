class Student{
String name;
int age;
String email;
String contact;
void Display(){
System.out.println("   "+this.name+" Details");
System.out.println("Name:"+this.name);
System.out.println("Age:"+this.age);
System.out.println("Email:"+this.email);
System.out.println("Contact:"+this.contact);

}
}
public class test{

public static void main(String args[]){

Student S1 = new Student();
Student S2 = new Student();
Student S3 = new Student();

S1.name = "Nilesh";
S2.name = "Vraj";
S3.name = "Aditya";

S1.age = 20;
S2.age = 18;
S3.age = 19;

S1.email = "nilesh112@gmail.com";
S2.email = "vraj998@gmail.com";
S3.email = "aditya232@gmail.com";

S1.contact = "1234567890";
S2.contact = "9876543210";
S3.contact = "3214567890";

S1.Display();
S2.Display();
S3.Display(); 
 }  }