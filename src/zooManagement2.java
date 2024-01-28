import java.util.Scanner;
public class zooManagement2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Veuillez entrer le nombre de cages : ");
        int nbrCages = scanner.nextInt();

        scanner.nextLine(); // Consommer la nouvelle ligne après le nombre de cages

        System.out.print("Veuillez entrer le nom du zoo : ");
        String zooName = scanner.nextLine();

        System.out.println("Le zoo " + zooName + " comporte " + nbrCages + " cages.");

        scanner.close();
    }
}

