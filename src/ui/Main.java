package ui;

/**
 * @author Br14n
 */

import java.util.Scanner;

import model.Controller;

/**
 * This is the main class of the application.
 */

public class Main {

	/**
	 * This is the scanner used to read the user input.
	 */
	private Scanner sc;

	/**
	 * This is the controller used to interact with the model.
	 */
	private Controller controller;

	
	/**
	 * This is the constructor of the main class. It initializes the scanner and the controller.
	 */
	public Main() {
		sc = new Scanner(System.in);
		controller = new Controller();
	}

	public static void main(String[] args) {

		Main app = new Main();
		int option = 0;
		
		System.out.println("Welcome to the Wetland Information System!");

		// This is the main loop of the application. It will continue until the user chooses to exit.
		do {
			app.showMenu();

			option = app.readOption();

			app.executeOperation(option);
			
		} while (option != 0);

	}

	/**
	 * This method shows the menu to the user.
	 */
	public void showMenu() {
		System.out.println(	"1. Register Wetland\n" + 
							"2. Register Species\n" +
							"3. Register Event\n" +
							"4. Report the number of maintenances in a given year\n" +
							"5. Show the wetland name with the least flora\n" +
							"6. Show the name of the wetlands that have a given species\n" +
							"7. Show wetlands information\n" +
							"8. Show the wetland name with the highest number of animals\n" + 
							"0. Exit\n");
	}

	/**
	 * This method reads the option selected by the user.<br>
	 * @return option int, the option selected by the user.<br>
	 */
	public int readOption() {
		
		int option = sc.nextInt();
		sc.nextLine();

		return option;
	}

	/**
	 * This method executes the operation selected by the user
	 * @param option int, the option selected by the user.
	 */
	public void executeOperation(int option) {
		
		switch(option){

			case 1:
				registerWetland();
				break;
			case 2:
				registerSpecies();
				break;
			case 3:
				registerEvent();
				break;
			case 4:
				maintenancesNumberIn();
				break;
			case 5:	
				showWetlandLeastFlora();
				break;
			case 6:
				wetlandsThatHave();
				break;
			case 7:
				showWetlandsInfo();
				break;
			case 8:
				showWetlandMostAnimals();
				break;
			case 0:
				System.out.println("Bye!");
				break;

		}
	}

	/**
	 *  This method requests the information to register a new wetland.
	 */
	public void registerWetland() {

		String response;
		int option;

		String name = "", locationName = "", photoUrl = "";
		boolean isInUrbanArea = false, isPublic = false, isProtected = false;
		double km2;

		System.out.println("Register Wetland\n");

		do {
			System.out.println("Enter the name of the wetland: ");
			name = sc.nextLine();
		} while (name.equals(""));

		System.out.println("Location:");
		do{
			System.out.println("(1) Urban Area (2) Rural Area");
			option = sc.nextInt();
			sc.nextLine();
		} while(option != 1 && option != 2);
		
		isInUrbanArea = option == 1;

		System.out.println("Type:");
		do{
			System.out.println("(1) Public (2) Private");
			option = sc.nextInt();
			sc.nextLine();
		}while(option != 1 && option != 2);

		isPublic = option == 1;

		do{
			System.out.println("Enter the location name: ");
			locationName = sc.nextLine();
		}while(locationName.equals(""));

		System.out.println("Is it protected?");
		do{
			System.out.println("(1) Yes (2) No");
			option = sc.nextInt();
			sc.nextLine();
		}while(option != 1 && option != 2);

		isProtected = option == 1;

		do{
			System.out.println("Number of square kilometers");
			km2 = sc.nextDouble();
			sc.nextLine();
		}while(km2 <= 0);
		
		do{
			System.out.println("Enter the photo URL: ");
			photoUrl = sc.nextLine();
		}while(photoUrl.equals(""));

		response = controller.registerWetland(name, isInUrbanArea, isPublic, isProtected, km2, locationName, photoUrl);

		System.out.println(response);

	}

	/**
	 * This method requests the information to register a new species.
	 */
	public void registerSpecies() {
		
		String response;
		int option;

		String wetlandName = "", speciesName = "", scientificName = "";
		int type;
		boolean isMigratory = false;

		System.out.println("Register Species\n");

		do {
			System.out.println("Enter the name of the wetland: ");
			wetlandName = sc.nextLine();
		} while (wetlandName.equals(""));

		do {
			System.out.println("Enter the name of the species: ");
			speciesName = sc.nextLine();
		} while (speciesName.equals(""));

		do{
			System.out.println("Enter the scientific name: ");
			scientificName = sc.nextLine();
		}while(scientificName.equals(""));

		System.out.println("Type:");
		do{
			System.out.println("(1) Terrestrial flora \n" + 
								"(2) Aquatic flora \n" + 
								"(3) Bird \n" + 
								"(4) Mammal \n" +
								"(5) Aquatic \n");

			type = sc.nextInt();

		}while(type < 1 || type > 5);

		System.out.println("Is it migratory?");
		do{
			System.out.println("(1) Yes (2) No");
			option = sc.nextInt();
			sc.nextLine();
		}while(option != 1 && option != 2);

		isMigratory = option == 1;

		response = controller.registerSpecies(wetlandName, speciesName, scientificName, type, isMigratory);

		System.out.println(response);

	}

	/**
	 * This method requests the information to register a new event.
	 */	
	public void registerEvent() {
		
		String response;

		String wetlandName = "", eventId = "", eventDate = "", eventOrganizer = "", description = "";
		double value;
		int day, month, year;
		int type;

		System.out.println("Register Event\n");

		do {
			System.out.println("Enter the name of the wetland: ");
			wetlandName = sc.nextLine();
		} while (wetlandName.equals(""));
		
		do{
			System.out.println("Enter the event ID: ");
			eventId = sc.nextLine();
		}while(eventId.equals(""));

		do{
			System.out.println("Enter the day: ");
			day = sc.nextInt();
			sc.nextLine();
		}while(day < 1 || day > 31);

		do{
			System.out.println("Enter the month: ");
			month = sc.nextInt();
			sc.nextLine();
		}while(month < 1 || month > 12);

		do{
			System.out.println("Enter the year: ");
			year = sc.nextInt();
			sc.nextLine();

			String yearParsed = Integer.toString(year);
			if(yearParsed.length() != 4)
				year = 0;

		}while(year == 0);

		eventDate = day + "/" + month + "/" + year;


		System.out.println("Type:");
		do{
			System.out.println( "(1) Maintenance \n" + 
								"(2) School visit \n" + 
								"(3) Improvement activities \n" + 
								"(4) Celebration \n");

			type = sc.nextInt();
		}while(type < 1 || type > 4);

		do{
			System.out.println("Enter the event organizer: ");
			eventOrganizer = sc.nextLine();
			sc.nextLine();
		}while(eventOrganizer.equals(""));

		do{
			System.out.println("Enter the value: ");
			value = sc.nextDouble();
			sc.nextLine();
		}while(value <= 0);

		do{
			System.out.println("Enter a short description: ");
			description = sc.nextLine();
		}while(description.equals(""));

		response = controller.registerEvent(wetlandName, eventId, eventDate, type, eventOrganizer, value, description);

		System.out.println(response);
	}
	
	/**
	 * This method requests the year to show the number of maintenances of each wetland in that time period.
	 */
	public void maintenancesNumberIn() {
		
		String response;
		int year;

		System.out.println("Number of maintenances for each wetland in a given year:\n");

		do{
			System.out.println("Enter the year: ");
			year = sc.nextInt();
			sc.nextLine();

			String yearParsed = Integer.toString(year);
			if(yearParsed.length() != 4)
				year = 0;

		}while(year == 0);

		response = controller.maintenancesNumberIn(year);

		System.out.println(response);
		
	}

	/**
	 * This method shows the name of the wetland with the least number of flora species.
	 */
	public void showWetlandLeastFlora() {
		
		System.out.println("Wetland name with the least flora:\n");

		String response = controller.showWetlandLeastFlora();

		System.out.println(response);
	}

	/**
	 * This method request the species name to search the name of the wetlands where it is found.
	 */
	public void wetlandsThatHave() {
		
		String response;

		String speciesName = "";

		System.out.println("Name of the wetlands that have a given species:\n");

		do{
			System.out.println("Enter the species name: ");
			speciesName = sc.nextLine();
		}while(speciesName.equals(""));

		response = controller.wetlandsThatHave(speciesName);

		System.out.println(response);
		
	}

	/**
	 * This method shows the wetland information and the number of species by type.
	 */
	public void showWetlandsInfo() {

		System.out.println("Wetland information:\n");

		String response = controller.showWetlandsInfo();

		System.out.println(response);
	}

	/**
	 * This method shows the name of the wetland with the highest number of animals.
	 */
	public void showWetlandMostAnimals() {
		
		System.out.println("Name of the wetland with the highest number of animals:\n");

		String response = controller.showWetlandMostAnimals();

		System.out.println(response);

	}

}