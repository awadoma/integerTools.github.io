package intigerstools;

public class integerTools {

	int numbers [];
	private int sum ;
	public int number1[];
	public int number2[];
	
	public integerTools(int numbers[]) {
		
		this.numbers = numbers;
		
	}
	
	public int getSumArray() {
		for(int i : numbers) {
			sum += i;	
		}
		return sum;
	}
   public integerTools(int number1[], int number2[]) {
		
		this.number1 = number1;
		this.number2 = number2;
		
	}
   public int[] getSumTowArray() {
	int numAdd[] = new int [number1.length];
	if (number1.length != number2.length) {
		System.out.println("the tow Array is not equel");
		return numAdd;
	}else{
		for(int i= 0; i<number1.length; i++) {
		numAdd [i] = number1[i] + number2[i];
		
		}
		return numAdd;
	}
	
	
	
   }
   
	
	
}
