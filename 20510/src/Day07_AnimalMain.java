import java.util.Scanner;

public class Day07_AnimalMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String kind;
		String name;
		String toy;
		int age;
		
		System.out.print("���� ����: ");
		kind = sc.next();
		System.out.print("�̸�: ");
		name = sc.next();
		System.out.print("����: ");
		age = sc.nextInt();
		
		Animal animal1 = new Animal(kind, name, age);
		animal1.printCount();
		animal1.print(name);
		animal1.print(name, age);
		
		System.out.println("==========================");
		System.out.print("���� ����: ");
		kind = sc.next();
		System.out.print("�̸�: ");
		name = sc.next();
		System.out.print("����: ");
		age = sc.nextInt();
		System.out.print("�峭��: ");
		toy = sc.next();
		
		Animal animal2 = new Animal(kind,name,age,toy);
		animal2.printCount();
		animal2.setToy("������");
		System.out.println(animal2.getToy()+"�� �����մϴ�.");
		animal2.setAge(age);
		animal2.getAge();
	}

}
