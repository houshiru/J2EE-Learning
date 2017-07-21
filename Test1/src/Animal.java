
public abstract class Animal extends Object{
	String name;
	int age;
	String sex;
	
	Animal(){
		
	}
	
	public Animal(String name){
		this.name = name;
	}
	
	public abstract void eat();
	public abstract void run();
	
}
