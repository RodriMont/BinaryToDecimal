import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci una stringa: ");

        String binaryString = scanner.nextLine();

        int valoreDecimale = 0;

        System.out.println("Valore decimale: " + valoreDecimale);

        scanner.close();
    }
}
