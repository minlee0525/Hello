
public class Dog {
	Dog(){}
	
	Dog(String breed,int age,String color){
		this.breed = breed;
		this.age = age;
		this.color = color;
	}
	
	String breed;
	int age;
	String color;
	
	void barking() {
		System.out.println(breed + " is barking");
	}
	
	void hungry() {
		System.out.println(breed + " is hungry");
	}
	
	void sleeping() {
		System.out.println(breed + " is sleeping");
	}
	
	String toPrint(String breed,int age,String color) {
		String str = "("+breed+": "+age+"»ì "+color+")";
		return str;
	}
}
