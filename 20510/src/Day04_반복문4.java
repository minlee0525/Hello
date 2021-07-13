import java.util.Scanner;

public class Day04_반복문4 {

	public static void main(String[] args) {
		int i=1,n,sum=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력: ");
		n = sc.nextInt();
		
		while(i<=n)
		{
			if(i%2==0)
			{
				sum-=i; 
				System.out.print("-" + i);
			}
			else
			{
				sum+=i; 
				System.out.print("+" + i);
			}
			i++;
		}
		
		System.out.println("=" + sum);
	}

}
