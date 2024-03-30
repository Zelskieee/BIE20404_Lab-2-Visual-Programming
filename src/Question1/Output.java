package Question1;

public class Output extends Hostel {
	
	  // displayReport() function displays the student details and fees
    public static void displayReport(String name,char roomType, double selectRoom, double payRate) {
    	System.out.println("\n\t-------- Fee Statement --------");
        System.out.println("Student name : " + name);
        System.out.println("Room type selected : " + roomType);
        System.out.printf("Charges for selected room (per semester) : RM %.2f\n", selectRoom);
        System.out.printf("Charges for selected room (Charges for selected room (per year): RM %.2f\n", payRate);
    }
    
 // main method to test the program
    public static void main(String[] args) {
    	
    	// create first student object using default constructor
        Hostel person1 = new Hostel();
        
        // create second student object using parameterized constructor
        Hostel person2 = new Hostel("Irfan", 'C');
    }
}

