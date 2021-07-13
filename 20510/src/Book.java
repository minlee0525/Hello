
public class Book {
	Book(String name, int count) {
		bookName = name;
		this.count = count;
	}
	
	String bookName;
	private int count;
	
	void printBookCount() {
		System.out.println(bookName+" : "+count+"권 재고있음");
	}
	
	void rentalBook(int count) {
		if(this.count < count) {
			System.out.println(bookName + "재고량이 부족합니다. 현재재고량: " + this.count);
		} else {
			this.count -= count;
			System.out.println(bookName + " : " + count + "권 대출");
			printBookCount();
		}
	}
	
	void returnBook(int count) {
		this.count += count;
		System.out.println(bookName + " : " + count + "권 반납");
		printBookCount();
	}
}
