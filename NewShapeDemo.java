class Shape{
String name;
double area;

void display(){
System.out.println("Shape Name :"+name);
System.out.println("Area :"+area);
}
}

class Circle extends Shape{
Circle(int radius){
name = "Circle";
area = 3.14 * radius * radius;
}
}

class Square extends Shape{
Square(int side){
name = "Square";
area = side * side;
}
}


class Triangle extends Shape{
Triangle(int base, int height){
name = "Triangle";
area = 0.5 * base * height;
}
}

public class NewShapeDemo{
public static void main(String args[]){
Circle C1 = new Circle(25);
C1.display();
Square S1 = new Square(20);
S1.display();
Triangle T1 = new Triangle(20,30);
T1.display();
}
}