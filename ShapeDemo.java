class Shape{

void calculateArea(float radius){
double area = 3.14 * radius * radius ;
System.out.println("Area of Circle : "+area);
}
void calculateArea(int length , int breadth){
double area = length * breadth ;
System.out.println("Area of Rectangle : "+area);
}

void calculateArea(float base , float height){
double area = 0.5 * base * height ;
System.out.println("Area of Triangle : "+area);
}
void calculateArea(int side){
double area = side * side;
System.out.println("Area of Square : "+area);
}

}

public class ShapeDemo{
public static void main(String args[]){
Shape S1 = new Shape();
S1.calculateArea(25f);
S1.calculateArea(30,20);
S1.calculateArea(10f,15f);
S1.calculateArea(20);

} }