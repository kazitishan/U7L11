import java.util.ArrayList;
import java.util.Scanner;

public class PackageSimulator {
    private ArrayList<Package> packages;
    private boolean continueGame;

    public PackageSimulator(){
        packages = new ArrayList<Package>();
        continueGame = true;
    }

    public boolean isContinueGame() {
        return continueGame;
    }

    public void generatePackages(int num){

    }

    public void getSimulationInfo(){

    }

    public void resetSimulation(){
        packages = new ArrayList<Package>();
    }

    public void menu(){
        System.out.println("-------------------------");
        System.out.println("What would you like to do?");
        System.out.println("1. Calculate cost of one package");
        System.out.println("2. Simulate packages");
        System.out.println("3. How package costs are calculated");
        System.out.println("4. Exit");
        System.out.print("Input: ");
    }

    public void choice(int choice){
        Scanner s = new Scanner(System.in);
        if (choice == 1){
            System.out.print("Enter the zip code of the origin package: ");
            String origin = s.nextLine();
            System.out.print("Enter the zip code of the destination package: ");
            String destination = s.nextLine();
            System.out.print("Enter the weight of the package: ");
            double weight = s.nextDouble();
            System.out.print("Enter the length of the package: ");
            double length = s.nextDouble();
            System.out.print("Enter the width of the package: ");
            double width = s.nextDouble();
            System.out.print("Enter the height of the package: ");
            double height = s.nextDouble();
            System.out.println("Cost: " + PostageCalculator.calculatePostage(origin, destination, weight, length, width, height));
        }
        else if (choice == 2){
            System.out.println("Feature not added.");
        }
        else if (choice == 3){
            System.out.println("The base cost is $3.75 and the cost increases based on zip codes, weight, and dimensions");
            System.out.println("- For zip codes, we divide the difference in county codes (first three digits of a zip code) \nby 100 and add that to calculate the final total");
            System.out.println("- For weight, 5 cents is added for every tenth (1/10 th) of a pound to the final total");
            System.out.println("However, if the total weight is greater than 40 pounds, everything over the 40 pound limit will be charged 10 cents for every tenth (1/10 th) of a pound");
            System.out.println("- For the dimensions, if length + width + height > 36, every additional inch will cost 10 cents");
        }
        else if (choice == 4){
            continueGame = false;
        }
    }

}
