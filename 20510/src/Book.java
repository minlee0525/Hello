
public class Book {
	Book(String name, int count) {
		bookName = name;
		this.count = count;
	}
	
	String bookName;
	private int count;
	
	void printBookCount() {
		System.out.println(bookName+" : "+count+"�� �������");
	}
	
	void rentalBook(int count) {
		if(this.count < count) {
			System.out.println(bookName + "����� �����մϴ�. �������: " + this.count);
		} else {
			this.count -= count;
			System.out.println(bookName + " : " + count + "�� ����");
			printBookCount();
		}
	}
	
	void returnBook(int count) {
		this.count += count;
		System.out.println(bookName + " : " + count + "�� �ݳ�");
		printBookCount();
	}
}
