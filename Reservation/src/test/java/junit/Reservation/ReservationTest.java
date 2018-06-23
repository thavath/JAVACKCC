package junit.Reservation;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class ReservationTest {

	@Test
	public void testCanBeCancellByAdmin() {
		Reservation obj = new Reservation();
		User usr = new User();
		usr.setAdmin(true);
		boolean result = obj.canBeCancellBy(usr);
		assertEquals(true, result);
	}
	@Test
	public void testCanBeCancellByMadeByUser() {
		Reservation obj = new Reservation();
		User usr = new User();
		boolean result = obj.canBeCancellBy(usr);
		assertEquals(true, result);
	}
	@Ignore
	public void testCanBeCancellByOther() {
		Reservation obj = new Reservation();
		User usr = new User();
		usr.setAdmin(true);
		boolean result = obj.canBeCancellBy(usr);
		assertEquals(true, result);
	}

}
