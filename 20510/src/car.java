
public class car {
	car(){
		System.out.println("부모 car 생성자 기본형");
		System.out.println("Test");
	}
	car(String name){
		System.out.println("부모 car 생성자"+name);
	}
	
	String carname;
	String color = "검정색";
	int velocity;
	
	void speedUp() {
		velocity += 5;
		System.out.println(carname+" 현재속도: "+velocity);
	}
	
	void speedDown() {
		velocity -= 5;
		System.out.println(carname+" 현재속도: "+velocity);
	}
	
	void print() {
		System.out.println(carname + color);
	}
}
