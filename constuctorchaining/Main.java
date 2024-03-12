package constuctorchaining;

class Citizen {
	int age;
	String name;
	Citizen(int age,String name){
			this.age= age;
			this.name=name;
		
	}

}
class Employee extends Citizen{
	int id;
	Employee(int id,int age,String name){
		super(age,name);
		this.id = id;
		
		
	}
	void displayinfo() {
		System.out.println("Name ="+name+" age="+age+"Employee id"+id);
	}
	
}
public class Main{
	public static void main(String args[]) {
		Employee obj = new Employee(1,20,"Kunj");
		obj.displayinfo();
	}
}
