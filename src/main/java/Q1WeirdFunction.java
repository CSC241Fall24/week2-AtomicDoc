// src/main/java/Q1WeirdFunction.java

public class Q1WeirdFunction {

    /*

    Recursion Function. Dr. Chen created a ”weird” function f (n), based on the following
rules:
1). If n < 3, then f (n) = n
2). If n ≥ 3, then f (n) = f (n − 1) + 2f (n − 2) + 3f (n − 3).
• Please create a recursive method to implement this function f (n)
• Please create an iterative method to implement this function.
Implement your solution in the provided Q1WeirdFunction.java file


        if (n < 3){
            n=n;
        } else if ( n >= 3){

            n = (n-1) + 2*(n-2) + 3*(n-3);

        } else {
            return 0;
        }


    */

    public static int fRecursive(int n) {
        // TODO: Implement the recursive function

        if (n < 3){
            return n;
        } else if (n >= 3) {
            return fRecursive(n-1) + 2*fIterative(n-2) + 3*fRecursive(n-3);
        } else {
            return 0;
        }
    }

    public static int fIterative(int n) {
        // TODO: Implement the iterative function
        if (n < 3) {
            return n;
        }

        // Initialize f(0), f(1), and f(2)
        int f0 = 0;
        int f1 = 1;
        int f2 = 2;

        int current = 0;


        for (int i = 3; i <= n; i++) {


            // Calculate the function from the previous three values
            current = f2 + 2 * f1 + 3 * f0;

            // Shift the valuesso f(n-3) becomes f(n-2), f(n-2) becomes f(n-1), and f(n-1) becomes current
            f0 = f1;
            f1 = f2;
            f2 = current;
        }

        return current;
    }
}