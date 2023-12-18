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

    public static int BinaryToDecimal( String binaryString){
        int decimalValue = 0;
 
        int len = binaryString.length();

        for(int i=0; i< len; i++){
            int digit = Character.getNumericValue(binaryString.charAt(i));
            int power = len - i -1;

            decimalValue = decimalValue * (int) (digit * Math.pow(2, power));
        }

        return decimalValue;
    }
}
