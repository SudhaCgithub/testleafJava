package samplepackage;

public class PositiveNumberCheck2 {
	public static void main(String[] args) {
		int negativeNumber = 40;
		if (negativeNumber < 0) {
			int positiveNumber = Math.abs(negativeNumber);
			System.out.println("Negative Number Converted to POsitive Number: "+positiveNumber);
		} else {
			System.out.println("its positive number: "+negativeNumber);
		}
	}
}
