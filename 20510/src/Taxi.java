
public class Taxi extends car {
	int pay = 3000;
	
	void payUp() {
		pay+=100;
		System.out.println("현재 요금: "+pay);
	}
}
