import java.util.Scanner;

public class PackageShippingSimulator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        PackageSimulator packageSimulator = new PackageSimulator();
        while (packageSimulator.isContinueGame()){
            packageSimulator.menu();
            int choice = s.nextInt();
            packageSimulator.choice(choice);
        }
    }
}
