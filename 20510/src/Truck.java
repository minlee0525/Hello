
public class Truck extends car {
	Truck(){
		System.out.println("자식 Truck 생성자");
	}
	Truck(String name){
		System.out.println("자식 Truck 생성자 "+name);
	}
	
	int ton;
	
	void print() {
		System.out.println(carname + color + ":"+ton+"톤");
	}
	
	public static void main(String[] args) {
		Truck 봉고 = new Truck("봉고");
	}
}
