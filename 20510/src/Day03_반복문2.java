import java.util.Scanner;

public class Day03_�ݺ���2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int even_sum=0,odd_sum=0,n;
		
		System.out.println("����� �Է��Ͻÿ�.");
		n = sc.nextInt();
		
		for(int i=1;i<=n;i++)
			if(i%2==0) even_sum+=i;
			else odd_sum+=i;
		System.out.println("1���� �Է��� �� ������ ¦���� ����" + even_sum + "�̰�, Ȧ���� ����" + odd_sum + "�Դϴ�.");
	}

}
