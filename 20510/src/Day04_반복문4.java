import java.util.Scanner;

public class Day04_�ݺ���4 {

	public static void main(String[] args) {
		int i=1,n,sum=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է�: ");
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
