interface Payment{
void payAmount();
void getReceipt();
}

class CreditCardPayment implements Payment{
double amount;
String cardNumber;
public void payAmount(){
System.out.println("Amount paid  :"+amount);
}

public void getReceipt(){
System.out.println("----- Credit Card Receipt -----");
System.out.println("Credit Card Number : "+cardNumber);
System.out.println("Amount :"+amount +" paid using Credit Card Payment method ");
}
}

class UPIPayment implements Payment{
double amount;
String upiId;
public void payAmount(){
System.out.println("Amount paid :"+amount);
}

public void getReceipt(){
System.out.println("----- UPI Receipt -----");
System.out.println("UPI ID : "+upiId);
System.out.println("Amount :"+amount +" paid using UPI Payment method ");
}
}

public class Receipt{
public static void main(String args[]){
CreditCardPayment C1 = new CreditCardPayment();
C1.amount = 110000;
C1.cardNumber = "332131124525";
C1.payAmount();
C1.getReceipt();
UPIPayment U1 = new UPIPayment();
U1.amount = 25000;
U1.upiId = "12345@oksbi";
U1.payAmount();
U1.getReceipt();
}
}