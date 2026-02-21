package stage1f_patterns;

public class pattern_4 {
    public static void main(String[] args) {
        // Write your solution here
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
