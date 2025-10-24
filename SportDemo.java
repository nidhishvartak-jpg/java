interface Sports{
void getSportName();
}

class Cricket implements Sports{
String name = "Cricket";
public void getSportName(){
System.out.println("Sport Name:"+this.name) ;
}
}

class Football implements Sports{
String name = "Football";
public void getSportName(){
System.out.println("Sport Name:"+this.name) ;
}
}


public class SportDemo{
public static void main(String args[]){
Cricket C1 = new Cricket();
C1.getSportName();
Football F1 = new Football();
F1.getSportName();
}
}