package day2Abstraction;

abstract class Rbi {
	abstract void dokyc();
	
}

class HdfcBank extends Rbi{

	@Override
	void dokyc() {
		System.out.println("KYC Cheysukora Aadhaar tho");
		// TODO Auto-generated method stub
	}
}

class IciciBank extends Rbi {

	@Override
	void dokyc() {
		// TODO Auto-generated method stub
		System.out.println("KYC chey ra PAN tho");
		
	}
	
}