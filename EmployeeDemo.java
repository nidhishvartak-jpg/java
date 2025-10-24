class Person{
String name;
int age ;
void display(){
System.out.println("Name:"+this.name);
System.out.println("Age:"+this.age);
}
}

class Employee extends Person{
String role;
int Id;
double salary;
void display(){
super.display();
System.out.println("Role:"+this.role);
System.out.println("Employee ID:"+this.Id);
System.out.println("Salary:"+this.salary);
}
}

class Manager extends Employee{
String project;
void display(){
super.display();
System.out.println("Project:"+this.project);
}
}

public class EmployeeDemo{
public static void main(String args[]){
System.out.println("---Person class---");
Person P1 = new Person();
P1.name = "parth";
P1.age = 25;
P1.display();

System.out.println("---Employee class---");
Employee E1 = new Employee();
E1.name = "prajwal";
E1.role = "Software Engineer";
E1.age = 35;
E1.Id = 101;
E1.salary = 75000;
E1.display();

System.out.println("---Manager class---");
Manager M1 = new Manager();
M1.name = "Nidhish";
M1.age = 20;
M1.Id = 501;
M1.salary = 100000;
M1.role = "Manager";
M1.project = "AI development";
M1.display();
}
}