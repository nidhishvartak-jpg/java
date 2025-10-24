class Appliance{
String name;
String brand;
int power;
 
void display(){
System.out.println("Appliance Name:"+name);
System.out.println("Brand:"+brand);
System.out.println("Power Consumption : "+power+"kWh per year");
System.out.println("");
}
}
 
class WashingMachine extends Appliance{
WashingMachine(String brand,int power){
this.name = "Washing Machine";
this.brand = brand;
this.power = power;
}
}
 
class Refrigerator extends Appliance{
Refrigerator(String brand,int power){
this.name = "Refrigerator";
this.brand = brand;
this.power = power;
}
}
 
class Oven extends Appliance{
Oven(String brand,int power){
this.name = "Oven";
this.brand = brand;
this.power = power;
}
}
 
 
public class Machine{
public static void main(String args[]){
WashingMachine W1 = new WashingMachine("Godrej",300);
W1.display();
Refrigerator R1 = new Refrigerator("LG",800);
R1.display();
Oven O1 = new Oven("Panasonic",1000);
O1.display();
 
 
}
}
