import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] elements = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            elements[i] = scanner.nextInt();
        }
        int maximumProduct = 1;
        int currentProduct = 1;
        for (int i = 1; i < arrayLength; i++) {
            currentProduct = elements[i] * elements[i - 1];
            if (currentProduct > maximumProduct) {
                maximumProduct = currentProduct;
            }
        }
        System.out.printf("%d", maximumProduct);
    }
}