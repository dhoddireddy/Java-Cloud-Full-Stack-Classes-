package day2Abstraction;

public class Bankingrbi {
	public static void main(String[]args) {
		
		
		HdfcBank bank1 = new HdfcBank();
		bank1.dokyc();
		
		IciciBank bank2= new IciciBank();
		bank2.dokyc();
	}

}


