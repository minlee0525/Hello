
public class Truck extends car {
	Truck(){
		System.out.println("�ڽ� Truck ������");
	}
	Truck(String name){
		System.out.println("�ڽ� Truck ������ "+name);
	}
	
	int ton;
	
	void print() {
		System.out.println(carname + color + ":"+ton+"��");
	}
	
	public static void main(String[] args) {
		Truck ���� = new Truck("����");
	}
}
