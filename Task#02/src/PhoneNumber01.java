
public class PhoneNumber01 {

	private int digit;
	
	public PhoneNumber01(int digit) {
		try {
			setDigit(digit);
		} catch (IndividualDigitException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void setDigit(int digit) throws IndividualDigitException{
		this.digit = digit;
	}
	
	@Override
	public String toString() {
		String PhoneTxt = "The Phone number is : " + String.valueOf(digit);
		
		return PhoneTxt;
	}
}
