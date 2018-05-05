package OOP;

public class Room {
	
	String roomType;
	String roomNumber;
	boolean Status;
	double Price;
	
	Room(){
		this.roomType = "Deluxe";
		this.roomNumber = "ABC";
		this.Status = true;
		this.Price = 90.00;
	}
	Room(String roomType, String roomNumber, boolean Status, double Price){
		this.roomType = roomType;
		this.roomNumber = roomNumber;
		this.Status = Status;
		this.Price = Price;
	}
	void CheckIn() {
		if (Status) {
			System.out.println("Customer can check in this room.");
		}else {
			System.out.println("This room  unavailable...!");
		}
	}
	void GetNumberOfBed() {
		if (this.roomType.toLowerCase().equals("vip")) {
			System.out.println("This room has 3 beds.");
		}else if(this.roomType.toLowerCase().equals("deluxe")){
			System.out.println("This room has 2 beds.");
		}else {
			System.out.println("This room has 1 bed.");
		}
	}
	void GetPrice() {
		if (this.roomType.toLowerCase().equals("vip")) {
			System.out.println("This room is $90 per night.");
		}else if(this.roomType.toLowerCase().equals("deluxe")){
			System.out.println("This room is $70 per night.");
		}else {
			System.out.println("This room is $50 per night.");
		}
	}
	void setRoomType(String roomType) {
		this.roomType = roomType;
	}

}
