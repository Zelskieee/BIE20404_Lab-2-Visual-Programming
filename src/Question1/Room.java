package Question1;

public class Room extends Hostel {

	// setRoom() function sets roomType details
	public void setRoom() {

		boolean validRoomType = false;
		while (!validRoomType) {
			// input room type from the user
			System.out.print("Enter Room Type (A, B, or C): ");
			roomType = sc.next().charAt(0);

			// check if the room type is valid
			if (roomType == 'A' || roomType == 'a' || roomType == 'B' || roomType == 'b' || roomType == 'C'|| roomType == 'c') {
				validRoomType = true;
			} else {
				System.out.println("Invalid room type. Please enter a valid room type (A, B, or C).");
			}
			sc.nextLine(); // consume the newline character from the input buffer
		}
	}

	// selectRoom() function calculates room rates on the basis of roomType
	public double selectRoom() {
		double rate;
		// if roomType is 'A', then rate charge is RM450
		if (roomType == ('A' & 'a')) 
			rate = 450; 
		// if roomType is 'B', then rate charge is RM400
		else if (roomType == ('B' & 'b')) 
			rate = 400; 
		// if roomType is 'C', then rate charge is RM350
		else
			rate = 350;

		// return semester room charges
		return rate;
	}

}
