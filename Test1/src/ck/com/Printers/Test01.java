package ck.com.Printers;

public class Test01 {

	public static void main(String[] args) {
		IncBox incBox = new ColorIncbox();
		IPaper paper = new A4();
		
		
		Printer printer = new Printer();
		printer.print(incBox, paper);

	}

}
