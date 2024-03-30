package Question1;

import java.util.Scanner;

public class Hostel {

    // declare class variables.
    String name;
    char roomType;
    Scanner sc = new Scanner(System.in);

    // default constructor
    public Hostel() {
        // display welcome menu and available room types
        System.out.println("+---------------------------------------------------+");
        System.out.println("|\tWelcome to UTHM Wisdom Inn Hostel Fee\t    |");
        System.out.println("+---------------------------------------------------+");
        System.out.println("|\t\tRoom types available:- \t\t    |");
        System.out.println("|\t\tA - RM 450 per semester\t\t    |");
        System.out.println("|\t\tB - RM 400 per semester\t\t    |");
        System.out.println("|\t\tC - RM 350 per semester\t\t    |");
        System.out.println("+---------------------------------------------------+");

        // create instances of other classes and call their methods
        Student student = new Student();
        student.setDetails();

        Room room = new Room();
        room.setRoom();

        // calculate pay rate using selectRoom() function
        double payRate = 2 * room.selectRoom(); // multiply by 2 to calculate for two semesters

        // display student details and fees
        Output.displayReport(name, roomType, payRate, payRate);
    }

    // parameterized constructor
    public Hostel(String name, char roomType) {
        // set student name and room type
        this.name = name;
        this.roomType = roomType;

        // calculate pay rate using selectRoom() function
        Room room = new Room();
        double payRate = 2 * room.selectRoom(); // multiply by 2 to calculate for two semesters

        // display student details and fees
        Output.displayReport(name, roomType, payRate, payRate);
    }
}
