package learnJava;

public class ThingsWCDWConstructor {
String fName ;
String Lname ;
int age ;

String a = "This is how we use constructor";

public ThingsWCDWConstructor(String enterfirstName,String enterlastName, int enterage  ) {

	fName = enterfirstName ;
	Lname=enterlastName;
	age=enterage;
	
}

public static void main(String[]args) {
	
	ThingsWCDWConstructor myProg = new ThingsWCDWConstructor("John", "Gul", 40);
	
	System.out.println("FirstName	LastName 	Age");
	
	System.out.println(myProg.fName +" 		" +myProg.Lname + " 		" +myProg.age);
}

}
