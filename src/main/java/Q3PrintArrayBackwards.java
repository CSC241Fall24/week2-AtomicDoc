public class Q3PrintArrayBackwards {
    private static int[] array = {1, 2, 3, 4, 5, 6, 7};

    public static void main(String[] args) {
        printRecursion(array.length);
    }

    private static void printRecursion(int i) {
        // TODO: Implement the recursive method to print array elements backwards
        // Hint: The base case is when i <= 0
        // Hint: Print the element after the recursive call


        if (i<=0){
            return;
        }


        System.out.println(array[i-1]);
        printRecursion(i-1);

        }
    }
