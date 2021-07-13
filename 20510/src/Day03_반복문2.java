import java.util.Scanner;

public class Day03_반복문2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int even_sum=0,odd_sum=0,n;
		
		System.out.println("어떤수를 입력하시오.");
		n = sc.nextInt();
		
		for(int i=1;i<=n;i++)
			if(i%2==0) even_sum+=i;
			else odd_sum+=i;
		System.out.println("1부터 입력한 수 까지의 짝수의 합은" + even_sum + "이고, 홀수의 합은" + odd_sum + "입니다.");
	}

}
