package Question1;

public class Student extends Hostel {

	public void setDetails() {
		// input student name from the user
		System.out.print("Enter student name (e.g : Arif) : ");
		do {
			name = sc.nextLine();
			if (name.isEmpty()) {
				System.out.print("Invalid input. Please enter a non-empty name : (e.g : Arif) : ");
			}
		} while (name.isEmpty());
	}
}
