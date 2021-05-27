package labbook1;

public class Exercise6 {
static int n=5;
	
	public static int sumOfSqaresOfN() {
		
		int sum =0, square;	
		for(int i=0;i<=n;i++) {
			square=i*i;
			sum=sum+square;
		}
		
		return sum;
	}
	
	public static int squareOfSum() {
		int add=0,square2;
		
		for(int j=0;j<=n;j++) {
		add=add+j;	
		}
		
		square2=add*add;
		System.out.println(square2);
		//return square2;
		int diff;
		diff = sumOfSqaresOfN()-square2;
		
		return diff;

	}
	
	//public static int calculateDifference() {
		
		//	}
	
	public static void main(String[] args) {
		
		System.out.println(sumOfSqaresOfN());
		System.out.println(squareOfSum());
	
	}





}
