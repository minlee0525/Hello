
public class Animal {
	// 좋아하는 동물을 키우는 클래스

	//생성자 - 오버로딩---------------------------
	Animal(){}
	
	Animal(String kind, String name, int age , String toy){
		this(kind, name, age);
		System.out.println(name + toy + "를 좋아합니다.");		
	}
		
	Animal( String kind, String name, int age   ){
		this.kind = kind ;
		this.name = name ; 
		this.age = age;
		count++;
	}
	
	//멤버 변수-----------------------------------
	private String kind ; 	//개, 고양이, 햄스터
	String name ;   //뽀삐
	private int age ; 
	private static int count;  // 정적 변수 - 공유 
	private String toy;
	
	
	//메소드---------------------------------------
	//모두 몇마리 있는지 카운트
	static void printCount() {
		System.out.println("현재 총 " + count + "마리가 있습니다.");
	}
	
	//각자의 이름과 나이를 출력 - 오버로딩
	void print(String name, int age) {
		System.out.println(name  + age);
	}
	
	//각자의 품종과 나이와 이름을 출력 - 오버로딩
	void print(String name) {
		System.out.println(kind + name + age  );
	}
	
	void print() {
		System.out.println("이 동물의 이름은" + name );
	}
	//private 변수를 사용할 수 있는 통로가 되는 메소드
	// set : 어떤 값을 지정할때
	// get : 어떤 값을 불러올떄
	
	void setToy(String toy) {
		this.toy = toy;
	}
	
	String getToy() {
		return toy;		
	}
	
	//동물의 나이를 저장하는 메소드
	void setAge(int age) {
		this.age = age;
	}
	
	//동물의 나이를 알려주는 메소드
	int getAge() {
		return this.age;		
	}
	
	
}




















