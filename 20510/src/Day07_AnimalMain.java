import java.util.Scanner;

public class Day07_AnimalMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String kind;
		String name;
		String toy;
		int age;
		
		System.out.print("동물 종류: ");
		kind = sc.next();
		System.out.print("이름: ");
		name = sc.next();
		System.out.print("나이: ");
		age = sc.nextInt();
		
		Animal animal1 = new Animal(kind, name, age);
		animal1.printCount();
		animal1.print(name);
		animal1.print(name, age);
		
		System.out.println("==========================");
		System.out.print("동물 종류: ");
		kind = sc.next();
		System.out.print("이름: ");
		name = sc.next();
		System.out.print("나이: ");
		age = sc.nextInt();
		System.out.print("장난감: ");
		toy = sc.next();
		
		Animal animal2 = new Animal(kind,name,age,toy);
		animal2.printCount();
		animal2.setToy("빨간공");
		System.out.println(animal2.getToy()+"를 좋아합니다.");
		animal2.setAge(age);
		animal2.getAge();
	}

}
