import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;

        // put your code here
        int theInput = scanner.nextInt();
        int remnant = theInput;
        theInput = theInput / 100;
        remnant = remnant % 100;
        suma += theInput;
        theInput = remnant;
        theInput = theInput / 10;
        remnant = remnant % 10;
        suma += theInput;
        suma += remnant;


        System.out.printf("%d", suma);
    }
}