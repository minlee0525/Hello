
public class TV_Shopping extends ShoppingMall{
	String time;
	
	TV_Shopping(String code, int total, String time){
		this.code = code;
		this.time = time;
		addtotal(total);
	}

	public static void main(String[] args) {
		TV_Shopping tv = new TV_Shopping("123",10,"12½Ã 30ºÐ");
	}

}
