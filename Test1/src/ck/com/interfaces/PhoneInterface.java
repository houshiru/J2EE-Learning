package ck.com.interfaces;
/*
 * 手机充电器接口
 * @author shou2015@my.fit.edu
 */
//一个接口不能实现另一个接口，但它可以继承多个其他接口
//类只能单继承，使用接口可以实现多继承
//接口必须通过类来实现它的抽象方法
//接口与接口之间不能用实现，只能用继承，而且可以实现多继承
public interface PhoneInterface extends I01, I02 {
	int a = 2;
	//public static int a = 2;
	/*
	 * 接口服务
	 */
	void service();
	
	String speak();
}
