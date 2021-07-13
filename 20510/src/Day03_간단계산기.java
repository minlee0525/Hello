import java.util.Scanner;

public class Day03_간단계산기 {

	public static void main(String[] args) {
		int a,b;
		String op;
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.print("숫자:");
			a = sc.nextInt();
			
			System.out.print("숫자:");
			b = sc.nextInt();
			
			if(a==0 || b==0)
			{	
				System.out.println("프로그램 종료");
				break;
			}
			
			System.out.print("연산자:");
			op = sc.next();
			
			if(op.equals("+"))
				System.out.println(a + op + b + "=" + (a+b));
			
			else if(op.equals("-"))
				System.out.println(a + op + b + "=" + (a-b));
			
			else if(op.equals("*"))
				System.out.println(a + op + b + "=" + (a*b));
			
			else if(op.equals("/"))
				System.out.println(a + op + b + "=" + (a/b));
			
			char opp = op.charAt(0);
			
			switch (opp) {
			case '+': 
				System.out.println("더하기연산"); break;
			case '-': 
				System.out.println("빼기연산"); break;
			case '*': 
				System.out.println("곱하기연산"); break;
			case '/': 
				System.out.println("나누기연산"); break;
			default:
				break;
			}
		}
	}

}
