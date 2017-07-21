
public class Cat extends Animal implements ISpeak{
	public void eat(){
		System.out.println("aaaa");
	}
	public void run(){
		System.out.println("bbbb");
	}
	public void drink(){
		System.out.println("cccc");
	}
	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("Cat is spaking");
	}
}
