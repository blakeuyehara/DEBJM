//package dbUtil;
/**
 * This program is used to test the Utilities class
 */
 
// You need to import the java.sql package to use JDBC
import java.sql.*; 
 
import java.util.Scanner;

/**
 * @author DEBJM367
 */
public class projectTestUtilities 
{
	// Global variables
	static Utilities testObj = new Utilities(); 		// Utilities object for testing
    static Scanner keyboard = new Scanner(System.in); 	// standard input
    
    public static void main(String[] args) throws SQLException 
    {
		// Variables Needed For The Menu
		int choice;
		boolean done = false;

        while (!done) 
        {
			System.out.println();
			displaymenu();
			choice = getChoice();
            switch (choice) 
            {
			case 1: {
				openDB();
				break;
			}
			case 2: {
				addCourse();
				break;
			}
			case 3: {
				deleteStudent();
				break;
			}
			case 4: {
			    replace300Elective();
				break;
			}
			case 5: {
				availableCourses();
				break;
			}
			case 6: {
				getAdvisees();
				break;
			}
			case 7: {
				editReport();
				break;
			}
			case 8: {
				viewCourses();
				break;
			}
			case 9: {
				testObj.closeDB(); //Close the DB connection 
				break;
			}
			case 10: {
				done = true;
				System.out.println("Good bye");
				break;
            }
		}// switch
		}

	}// main

    // Display Menu! 
    static void displaymenu() 
    {
		System.out.println("1)  call openDB(String, String)");
		System.out.println("2)  call addCourse(String, String, String, String, String, String, String)");
		System.out.println("3)  call deleteStudent(String)");
		System.out.println("4)  call replace300Elective()");
		System.out.println("5)  call availableCourses(String)");
		System.out.println("6)  call getAdvisees(String)");
		System.out.println("7)  call editReport(String, String, String)");
		System.out.println("8)  call viewCourses()");
		System.out.println("9)  Close the DB");
		System.out.println("10) Quit");
    }

    // Retrieves which method the user would like to run. 
    static int getChoice() 
    {
		String input;
		int i = 0;
        while (i < 1 || i > 10) 
        {
			try {
				System.out.print("Please enter an integer between 1-12: ");
				input = keyboard.nextLine();
				i = Integer.parseInt(input);
				System.out.println();
			} catch (NumberFormatException e) {
				System.out.println("I SAID AN INTEGER!!!!");
			}
		}
		return i;
    }
    
    ////////////////
    // OUR TESTS //
    //////////////

    // Test openDB() Method 
	static void openDB() throws SQLException 
	{
		System.out.print("Please enter DB Username: ");
		String username = keyboard.nextLine();
		System.out.print("Please enter DB Password: ");
		String password = keyboard.nextLine();
        testObj.openDB(username, password);
    }
    
    // Test addCourse(String, String, String, String, String, String, String) Method 
    static void addCourse() throws SQLException
    {

    }

    // Test deleteStudent(String) Method
    static void deleteStudent() throws SQLException
    {

    }

    // Test replace300Elective() Method
    static void replace300Elective() throws SQLException
    {

    }

    // Test availableCourses(String) Method
    static void availableCourses() throws SQLException
    {

    }

    // Test getAdvisees(String) Method
    static void getAdvisees() throws SQLException
    {

    }

    // Test editReport(String, String, String) Method
    static void editReport() throws SQLException
    {

    }

    // Test viewCourses() Method
    static void viewCourses() throws SQLException
    {

    }
		
} // End of projectTestUtilities 
