
public class ShoppingMall {
	ShoppingMall(){}
	ShoppingMall(String code){
		this.code = code;
		this.total = total;
	}
	
	String code;
	static int total;
	
	void addtotal(int a) {
		this.total+=a;
		System.out.println("���� ���� : "+total);
	}
	
	void subtotal(int a) {
		this.total-=a;
		System.out.println("���� ���� : "+total);
	}
	public static void main(String[] args) {
		ShoppingMall a = new ShoppingMall("1");
		ShoppingMall b = new ShoppingMall("2");
		a.addtotal(2);
		b.addtotal(3);
		a.subtotal(4);
	}
}
