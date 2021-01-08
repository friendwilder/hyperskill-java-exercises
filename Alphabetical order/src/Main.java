import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String myInput = scanner.nextLine();
        String[] inputSplitted = myInput.split(" ");
        boolean ordered = true;
        for (int i = 1; i < inputSplitted.length; i++) {
            if (inputSplitted[i].compareTo(inputSplitted[i - 1]) >= 0) {
                ordered = true;
            } else {
                ordered = false;
            }
        }
        System.out.println(ordered);
        /*
        for (String currentString : inputSplitted) {
            System.out.println(currentString);
        }
         */
    }
}