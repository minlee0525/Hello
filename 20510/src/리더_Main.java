
public class 리더_Main {

	public static void main(String[] args) {
		리더 leader1 = new 리더("홍길동","20500",true);
		leader1.isleader();
		리더 leader2 = new 리더("이강민","20510",false);
		leader2.isleader();
		
		leader1.printStudent();
		leader2.printStudent();
	}

}
