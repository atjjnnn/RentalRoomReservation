package jp.co.rentalroom.model;

public class RentalSpaceService {

	public static RentalModel getRentalRoomById(String id) {
		
		RentalModel rentalRoom = new RentalModel(id, "name");
		
		return rentalRoom;
		
	}
	
}
