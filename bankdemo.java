class BankAccount{
String name;
private double balance ;

void setBalance(double newbalance)
{
   this.balance = newbalance;
}

double getBalance(){
return this.balance;
}

}

public class bankdemo{
public static void main(String args[]){

BankAccount B1 = new BankAccount();
B1.name = "Nidhish";
B1.setBalance(100000);
System.out.println("Account Holder Name:"+B1.name);
System.out.println("Account Balance:"+B1.getBalance());
}
}