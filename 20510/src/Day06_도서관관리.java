import java.util.Scanner;

public class Day06_���������� {

	public static void main(String[] args) {
		Book b1 = new Book("JAVA ������", 10);
		b1.printBookCount();
		
		Book b2 = new Book("���̽� ����", 20);
		b2.printBookCount();
		
		Book b3 = new Book("�ѱ���", 100);
		b3.printBookCount();
		
		/*b3.rentalBook(10);
		b3.rentalBook(20);
		b3.returnBook(5);*/
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("���Ͻô� �۾��� �������ּ���.[1:���� 2:�ݳ�]");
			int job = sc.nextInt();
			
			if(job==1) {
				System.out.print("���Ͻô� ������ �Է����ּ���.");
				int count = sc.nextInt();
				b3.rentalBook(count);
			} else if(job==2) {
				System.out.print("�ݳ��Ͻ� ������ �Է����ּ���.");
				int count = sc.nextInt();
				b3.returnBook(count);
			} else {
				System.out.println("�Ұ����� �۾��Դϴ�.");
				break;
			}
		}
	}

}
