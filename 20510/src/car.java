
public class car {
	car(){
		System.out.println("�θ� car ������ �⺻��");
	}
	car(String name){
		System.out.println("�θ� car ������"+name);
	}
	
	String carname;
	String color = "������";
	int velocity;
	
	void speedUp() {
		velocity += 5;
		System.out.println(carname+" ����ӵ�: "+velocity);
	}
	
	void speedDown() {
		velocity -= 5;
		System.out.println(carname+" ����ӵ�: "+velocity);
	}
	
	void print() {
		System.out.println(carname + color);
	}
}
