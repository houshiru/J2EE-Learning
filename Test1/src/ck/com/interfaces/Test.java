package ck.com.interfaces;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhoneInterface iphone = new Iphone();
		iphone.service();
		
		PhoneInterface andriod = new AndroidPhone();
		andriod.service();
		
		
		I01 p1 = new phone();
		p1.method();
		p1.method(3);
		
		I02 p2 = new phone();
		p2.method();
	}

}
