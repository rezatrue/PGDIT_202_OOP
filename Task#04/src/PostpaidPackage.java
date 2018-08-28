
public class PostpaidPackage extends MobilePackage {

	public PostpaidPackage(String operatorName) {
		super(operatorName);
	}

	private double perMinuteRate;
	private double totalMinute;
	
	@Override
	public double calculateTotalBill() {
		// TODO Auto-generated method stub
		return 0;
	}

}
