import java.util.*;

//Section 4 Group 1 ( Arif, Junesh, Irfan & Syukri )

public class Hostel {
	// Declaration of name, roomType & sc 
	String name;
	char roomType;
	Scanner sc = new Scanner(System.in);

	// Default constructor
	public Hostel() {
		// Display welcome menu and price of room types
		System.out.println("+---------------------------------------------------+");
		System.out.println("|\tWelcome to UTHM Wisdom Inn Hostel Fee\t    |");
		System.out.println("+---------------------------------------------------+");
		System.out.println("|\t\tRoom types available:- \t\t    |");
		System.out.println("|\t\tA - RM 450 per semester\t\t    |");
		System.out.println("|\t\tB - RM 400 per semester\t\t    |");
		System.out.println("|\t\tC - RM 350 per semester\t\t    |");
		System.out.println("+---------------------------------------------------+");

		// Call setDetails() function to get student details
		setDetails();

		// Call setRoom() function to get student's Room type details
		setRoom();

		// Calculate pay rate using selectRoom() function
		double payRate = 2 * selectRoom(); // multiply by 2 to calculate for two semesters

		// Display student details and fees
		displayReport(payRate);
	}

	// Parameterized constructor
	public Hostel(String name, char roomType) {
		// set student name and room type
		this.name = name;
		this.roomType = roomType;

		// Calculate pay rate using selectRoom() function
		double payRate = 2 * selectRoom(); // Multiply by 2 to calculate for two semesters

		// Display student details and fees
		displayReport(payRate);
	}

	// Method to get name from user
	public void setDetails() {
		// Input student name from the user
		System.out.print("Enter student name (e.g : Arif) : ");
		do {
			name = sc.nextLine();
			if (name.isEmpty()) {
				System.out.print("Invalid input. Please enter a non-empty name : (e.g : Arif) : ");// Re-prompt if wrong input
			}
		} while (name.isEmpty());
	}

	// Method to get room type from user
	public void setRoom() {

		boolean validRoomType = false;
		while (!validRoomType) {
			// Input room type from the user
			System.out.print("Enter Room Type (A, B, or C): ");
			roomType = sc.next().charAt(0);

			// Check if the room type is valid
			if (roomType == 'A' || roomType == 'a' || roomType == 'B' || roomType == 'b' || roomType == 'C'|| roomType == 'c') {
				validRoomType = true;
			} else {
				System.out.println("Invalid room type. Please enter a valid room type (A, B, or C).");// Re-prompt if wrong input
			}
			sc.nextLine();
		}
	}

	// Method to calculates room rates of roomType
	public double selectRoom() {
		double rate;
		// If roomType is 'A' & 'a', then rate charge is RM450
		if (roomType == ('A' & 'a')) 
			rate = 450; 
		// If roomType is 'B' & 'b', then rate charge is RM400
		else if (roomType == ('B' & 'b')) 
			rate = 400; 
		// If roomType is 'C' & 'c', then rate charge is RM350
		else
			rate = 350;

		// Return semester room charges
		return rate;
	}

	// Method to displays the student details and fees
	public void displayReport(double payRate) {
		System.out.println("\n\t-------- Fee Statement --------");
		System.out.println("Student name : " + name);
		System.out.println("Room type selected : " + roomType);
		System.out.printf("Charges for selected room (per semester) : RM %.2f\n", selectRoom());
		System.out.printf("Charges for selected room (Charges for selected room (per year): RM %.2f\n", payRate);
	}

	// Main method 
	public static void main(String[] args) {

		// Create first student object using default constructor
		Hostel person1 = new Hostel();

		// Create second student object using parameterized constructor
		Hostel person2 = new Hostel("Junesh", 'B');

		// Create third student object using parameterized constructor
		Hostel person3 = new Hostel("Irfan", 'C');

		// Create forth student object using parameterized constructor
		Hostel person4 = new Hostel("Syukri", 'C');

		// Create fifth student object using parameterized constructor as the question requested
		Hostel person5 = new Hostel("Sophie", 'A');
	}
}

