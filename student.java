public class student{
String name;
int age;
String course;

student(){
System.out.println("This is Default Constructor ");
}
student(String name){
this.name = name;
System.out.println("student name:"+this.name);
}

student(String name , int age){
this.name = name;
this.age = age;
System.out.println("student name:"+this.name);
System.out.println("student Age:"+this.age);
}

student(String name , int age , String course){
this.name = name;
this.age = age;
this.course = course;
System.out.println("student name:"+this.name);
System.out.println("student Age:"+this.age);
System.out.println("student Course:"+this.course);
}

public static void main(String args[]){
student S1 = new student();
student S2 = new student("Nidhish");
student S3 = new student("parth",19);
student S4 = new student("prajwal",21,"Computer Engineering");

}
}