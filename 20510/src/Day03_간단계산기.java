import java.util.Scanner;

public class Day03_���ܰ��� {

	public static void main(String[] args) {
		int a,b;
		String op;
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.print("����:");
			a = sc.nextInt();
			
			System.out.print("����:");
			b = sc.nextInt();
			
			if(a==0 || b==0)
			{	
				System.out.println("���α׷� ����");
				break;
			}
			
			System.out.print("������:");
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
				System.out.println("���ϱ⿬��"); break;
			case '-': 
				System.out.println("���⿬��"); break;
			case '*': 
				System.out.println("���ϱ⿬��"); break;
			case '/': 
				System.out.println("�����⿬��"); break;
			default:
				break;
			}
		}
	}

}
