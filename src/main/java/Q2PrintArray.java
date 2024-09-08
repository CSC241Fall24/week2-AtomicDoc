public class Q2PrintArray {
    private static int[] array = {1, 2, 3, 4, 5, 6, 7};

    public static void main(String[] args) {
        printRecursion(array.length);
    }

    private static void printRecursion(int i) {
        // TODO: Implement the recursive method to print array elements
        // Hint: The base case is when i <= 0
        // Hint: Print the element before the recursive call

        if (i<=0){
            return;
        }

        printRecursion(i-1);
        System.out.println(array[i-1]);

    }
}