package GettersNsetters;

import com.sun.xml.internal.ws.dump.LoggingDumpTube.Position;

public class test {
	
	
	
public static void main(String[]args) {
	EmpBio e = new EmpBio();
	
	System.out.println(e.getName());
	
	e.setName("John");
	e.setAge(24);
	e.setPosition("teacher");
	
	
	
	System.out.println("This is " + e.getName());
	System.out.println(e.getName() +" is " +e.getAge() +" years old");
	System.out.println("He works as a " +e.getPosition());
	
	if (String .valueOf(e.getPosition()).contains("clerk")) {
		e.setEmployed(true);
		System.out.println("tihs is "+e.isEmployed()+ " that he is working as a clerk");
		
	}else {
		System.out.println("Did i say he is a " + e.getPosition());
	}
}
	
	

}
