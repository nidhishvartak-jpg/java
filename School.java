class Person{
String name;
int age ;
void display(){
System.out.println("Name:"+this.name);
System.out.println("Age:"+this.age);
}
}

class Student extends Person{
int roll_no ;
String course;
void display(){
super.display();
System.out.println("Roll no:"+this.roll_no);
System.out.println("Course:"+this.course);
}}

class GraduateStudent extends Student{
int graduation_year;
double CGPA;
void display(){
super.display();
System.out.println("Graduation Year:"+this.graduation_year);
System.out.println("CGPA:"+this.CGPA);
}
}

class Teacher extends Person{
String subject;
double salary;
void display(){
super.display();
System.out.println("Subject:"+this.subject);
System.out.println("Salary:"+this.salary);
}

}

public class School{
public static void main(String args[]){
System.out.println("---Single Inheritance---");
Student S1 = new Student();
S1.name = "Nidhish";
S1.age = 20;
S1.roll_no = 6;
S1.course = "Computer Engineering";
S1.display();
System.out.println("---Multilevel Inheritance---");
GraduateStudent G1 = new GraduateStudent();
G1.name = "aditya";
G1.age = 21;
G1.roll_no = 90;
G1.course = "Chemical Engineering";
G1.graduation_year = 2025 ;
G1.CGPA = 9.4 ;
G1.display();

System.out.println("---Hierarchical Inheritance---");
Student S2 = new Student();
S2.name = "prajwal";
S2.age = 21;
S2.roll_no = 60;
S2.course = "Aerospace Engineering";
S2.display();

Teacher T1 = new Teacher();
T1.name = "Parth";
T1.age = 35;
T1.subject = "Engineering Physics";
T1.salary = 100000;
T1.display();
}
}