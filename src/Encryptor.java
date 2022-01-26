import java.util.Scanner;

public class Encryptor {

    Scanner sc = new Scanner(System.in);
    String text;
    char[] charText;
    int x;

    public void encryp() {
        System.out.print("Enter text here: ");
        text = sc.nextLine();
        System.out.print("Enter number from 1 to 9\n(if your choice is 1, the string will not to be encrypted): ");
        x = sc.nextInt();
        charText = text.toCharArray();

        for ( int i = 0; i <= text.length() - 1; i++ ) {
            charText[i] += Math.pow(x, 3) - 1;
        }
        System.out.println("\nEncrypted to: ");
        System.out.println(charText);
    }

    public void decryp() {
        for ( int i = 0; i <= text.length() - 1; i++ ) {
            charText[i] -= Math.pow(x, 3) - 1;
        }
        System.out.println("\nDecrypted to: ");
        System.out.println(charText);
    }

}
