public class ArrayPractice {
    public static void main(String[] args) {
        printNames();
        modifyAndPrintArray();
        findAndPrintMax();
    }

    // Print 5 names from array
    public static void printNames() {
        System.out.println("Print names from array:");
        String[] names = {"Nana", "Ball", "Charlie", "Carlos", "Kevin"};

        for (String name : names) {
            System.out.println(name);
        }
        System.out.println();
    }

    //  Modify second element of integer array and print
    public static void modifyAndPrintArray() {
        System.out.println("Modify second element and print array:");
        int[] numbers = {10, 20, 30, 40, 50};
        numbers[1] = 99;  // Modify second element

        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("\n");
    }

    // Find and print max value in array
    public static void findAndPrintMax() {
        System.out.println("Find maximum in array:");
        int[] numbers = {23, 67, 12, 89, 45};
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Maximum value is: " + max);
    }
}
