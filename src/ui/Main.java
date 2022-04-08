package ui;

import java.util.Scanner;
import model.WetlandInformationSystem;

public class Main {

    /**
	 * sc is an object of the scanner class for reading input.
	 */
	
	static Scanner sc = new Scanner(System.in);

    static WetlandInformationSystem system = new WetlandInformationSystem();
    
    public static void main(String[] args) {

        String message = "";
		
		int option = 0;
		
		//1. addWetland();
		//2. addNewSpecies(...);
		//3. addEvent(...);
		//4. maintenancesQuantityIn(2022);
		//5. showWetlandLessFlora();
		//6. showSpeciesInWetland(...);
		//7. showWetlandInfo();
		//8. showWetlandMoreAnimals();
		
		system.addWetland(null, false, false, false, 0, null, null);
		
		system.addNewSpecies(null, null, null, null, false);
		
		system.addEvent(null, null, null, 0, null, null);
		
		system.maintenancesQuantityIn(2022);
		
		system.showWetlandLeastFlora();
		
		system.showSpeciesInWetland(null);
		
		system.showWetlandInfo();
		
		system.showWetlandMoreAnimals();
		
		
		do {
			
			printMainMenu();
			
			option = sc.nextInt();
			
			sc.nextLine();
			
			executeMainOption(option);
			
			System.out.println(message);
			
			
		}while(option != 0);
        

    }

    /**
     * This method prints the main menu.
     */

    public static void printMainMenu() {
	
		System.out.println("1) Add a new wetland.\n" 
                        + "2) Add a new species. \n" 
                        + "3) Add a new event. \n" 
                        + "4) Show the quantity of maintenances in a given year. \n" 
                        + "5) Show the wetland with less flora. \n" 
                        + "6) Show the species in a given wetland. \n" 
                        + "7) Show the wetland information. \n" 
                        + "8) Show the wetland with more animals. \n" 
                        + "0) Exit.");
		
	}
	
	
	public static void executeMainOption(int option) {
		
		switch (option) {
            case 1:
                break;
        
            default:
                break;
        }
		
	}

}
