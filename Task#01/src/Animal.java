
public class Animal {

	private int serialNumber = 1001;
	private static int numberOfAnimal = 0;
	
	
	public Animal() {
		numberOfAnimal++;
	}


	public int getSerialNumber() {
		return serialNumber;
	}


	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}


	public static int getNumberOfAnimal() {
		return numberOfAnimal;
	}


		
	
}
