
public abstract class MobilePackage {
	
	protected String operatorName;
	protected double totalBill;
	
	
	
	public MobilePackage(String operatorName) {
		this.operatorName = operatorName;
	}

	public abstract double calculateTotalBill();

	public String toString() {
		return this.operatorName;
	}
}
