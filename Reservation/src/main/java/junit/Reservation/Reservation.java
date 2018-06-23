package junit.Reservation;

public class Reservation {

	private User madeBy;

	public User isMadeBy() {
		return madeBy;
	}

	public void setMadeBy(User madeBy) {
		this.madeBy = madeBy;
	}
	
	public boolean canBeCancellBy(User usr) {
		if(usr.isAdmin() == true) {
			return true;
		}else if(usr == madeBy){
			return true;
		}else {
			return false;
		}
		
		// return usr.isAdmin() || usr == madeBy ? true : false ;
	}

}
