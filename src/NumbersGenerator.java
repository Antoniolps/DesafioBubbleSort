import java.util.Random;

public class NumbersGenerator {
	
	private boolean exists(int[] numbers, int number) {
		for(int i = 0; i < numbers.length; i++) {
			if(number == numbers[i])
				return true;
		}
		return false;
	}
	
	public int[] generateNumbers(int length) {
		Random random = new Random();
		int[] randomNumbers = new int[length];
		
		for(int i = 0; i < randomNumbers.length; i++) {
			boolean newNumber = true;
			int number = -1;
			
			while(newNumber) {
				number = random.nextInt(1000);
				newNumber = exists(randomNumbers, number);
			}
			randomNumbers[i] = number;
		}
		return randomNumbers;
	}
}
