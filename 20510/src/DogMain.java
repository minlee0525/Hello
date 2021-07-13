
public class DogMain {

	public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.breed = "진돗개";
		dog1.age = 3;
		dog1.color = "누런색";
		
		Dog dog2 = new Dog("포메라니안",1,"흰색");
		
		dog1.hungry();
		dog2.barking();
		
		dog2.toPrint("똥강아지", 2, "갈색");
		System.out.println("str");
	}

}
