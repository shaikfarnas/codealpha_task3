package task3;

public class Rooms {
	private String SingleRoom;
	private String DoubleRoom;
	private String TripleRoom;
	
	Rooms(String SingleRoom,String DoubleRoom,String TripleRoom) {
		this.SingleRoom = SingleRoom;
		this.DoubleRoom = DoubleRoom;
		this.TripleRoom = TripleRoom;
	}
	@Override
	public String toString() {
		return "****"+SingleRoom+","+DoubleRoom+","+TripleRoom+"****";
	}
	
	void singleRoom(){
		System.out.println("10 singlerooms are available");
		
	}
	
	void doubleRoom(){
		System.out.println("20 Doublerooms are available");
		
	}
	
	void tripleRoom(){
		System.out.println("20 Triplerooms are available");
		
	}
}
