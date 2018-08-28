
public class PhoneNumber02 {

	private int digit;
	
	public PhoneNumber02(int digit) {
			setDigit(digit);
	}
	
	public void setDigit(int digit){
		try {
			assignValue(digit);
		}catch (IndividualDigitException e) {
			new IndividualDigitException();
		}
		
	}
	
	public void assignValue(int digit) throws IndividualDigitException{
		this.digit = digit;
		throw new IndividualDigitException();
	}
	
	
	@Override
	public String toString() {
		String PhoneTxt = "The Phone number is : " + String.valueOf(digit);
		
		return PhoneTxt;
	}
}
