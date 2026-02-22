package stage1f_patterns;

public class Pattern6 {
    public static void main(String[] args) {
        // Write your solution here
        int n = 5;
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n-i-1; j++){
                System.out.print(" ");
            }

            // Inner loop will print asterisks
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*");
            }
            /* As soon as stars for each iteration are printed,
             move to the next row and give a line break */
            System.out.println();
        }
    }
}
