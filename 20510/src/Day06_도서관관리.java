import java.util.Scanner;

public class Day06_도서관관리 {

	public static void main(String[] args) {
		Book b1 = new Book("JAVA 교과서", 10);
		b1.printBookCount();
		
		Book b2 = new Book("파이썬 기초", 20);
		b2.printBookCount();
		
		Book b3 = new Book("한국사", 100);
		b3.printBookCount();
		
		/*b3.rentalBook(10);
		b3.rentalBook(20);
		b3.returnBook(5);*/
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("원하시는 작업을 선택해주세요.[1:대출 2:반납]");
			int job = sc.nextInt();
			
			if(job==1) {
				System.out.print("원하시는 수량을 입력해주세요.");
				int count = sc.nextInt();
				b3.rentalBook(count);
			} else if(job==2) {
				System.out.print("반납하실 수량을 입력해주세요.");
				int count = sc.nextInt();
				b3.returnBook(count);
			} else {
				System.out.println("불가능한 작업입니다.");
				break;
			}
		}
	}

}
