
public class DogMain {

	public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.breed = "������";
		dog1.age = 3;
		dog1.color = "������";
		
		Dog dog2 = new Dog("���޶�Ͼ�",1,"���");
		
		dog1.hungry();
		dog2.barking();
		
		dog2.toPrint("�˰�����", 2, "����");
		System.out.println("str");
	}

}
