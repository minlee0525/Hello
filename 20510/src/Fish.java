
public class Fish extends Animal {
	
	void Swim() {
		System.out.println(this.name+"�� ���Ĩ�ϴ�.");
	}
	
	public static void main(String[] args) {
		Fish myfish = new Fish();
		myfish.name = "�˷���";
		myfish.setAge(3);
		
		myfish.Swim();
	}
}
