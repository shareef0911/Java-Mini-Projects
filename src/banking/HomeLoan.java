package banking;

public class HomeLoan extends Loan {

	void getDocInfo() {
		System.out.println("Successfully Submitted All Are Documents For Home Loan !!");
	}
	
	double getROI() {
		return 12.5;
	}
	public static void main(String[] args) {
		System.out.println("Welcome to Home Loan Banking !!");
		HomeLoan hl = new HomeLoan();
		
		int cibil = hl.getCibil();
		double salary = hl.getSalary();
		byte age = hl.getAge();
		
		if(cibil >700 && salary >= 600000 && age > 25 && age < 55 && hl.isValidPhone() && hl.isValidPan() && hl.isValidAadhaar()) {
			System.out.println("Congratulations Your Home Loan is Approved !!");
			System.out.println("Your Loan RoI is "+hl.getROI());
			System.out.println("Confirm your Address Details : ");
//			pl.customerAddressDetails();
			System.out.println(hl.customerAddressDetails());
			hl.getDocInfo();
		}else {
			System.out.println("Sorry ! , Your Personal Loan is Rejected.");
		}
	}

}
