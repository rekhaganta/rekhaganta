package labbook1;

public class Exercise5 {
	int calculateSum(int n)
	{
		int Sum=0;
		for(int i=1; i<=n; i++) {
			if(i%3==0 || i%5==0) {
				Sum=Sum+i;
			}
		}
		return Sum;
		
	}
	public static void main(String[] args) {
		Exercise5  s=new  Exercise5();
int num=s.calculateSum(100);
System.out.println("sum is ="+num);

}}

