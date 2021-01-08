import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int sizeOfArray = scanner.nextInt();
        int[] myArray = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            myArray[i] = scanner.nextInt();
        }
        int numberToVerify = scanner.nextInt();
        int counter = 0;
        for (int number : myArray) {
            if (number == numberToVerify) {
                counter++;
            }
        }
        System.out.printf("%d", counter);
    }
}