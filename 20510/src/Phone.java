
public class Phone {
	Phone(){
		total++;
	}
	Phone(String model, int price){
		this.model = model;
		this.price = price;
		total++;
	}
	
	String model;
	int price;
	static int total;
	
	void toPrint() {
		System.out.println(price/10000+"����¥�� "+model+"����Ʈ��");
	}
	
	void printTotal() {
		System.out.println("�� "+total+"���� ����Ʈ���� ������ �ֽ��ϴ�.");
	}
}
