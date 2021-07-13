
public class BaseBall extends Sports{

	BaseBall(){}
	BaseBall(String name,int player){
		super(name,player); 
	}
	
	public void rule() {
		System.out.println("공격과 수비로 이루어 진다.");
	}
	
	public static void main(String[] args) {
		
		BaseBall bb = new BaseBall("BaseBall",9);
		
		System.out.println("경기 종몽 : "+bb.getName());
		System.out.println("경기 인원 : "+bb.getPlayer());
		System.out.print("경기 규칙 : ");
		bb.rule();
		
	}

}
