package ck.com.interfaces;

//实现多个接口时，多个接口最好不要定义相同的方法
//使用多个专门的接口比使用一个总接口好
public class phone implements I01, I02 {
	public void method(){
		System.out.print("asd");
	}
	public void method(int a){
		System.out.println(a);
	}
}
