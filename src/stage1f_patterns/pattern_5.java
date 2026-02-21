package stage1f_patterns;

public class pattern_5 {
    public static void main(String[] args) {
        // Write your solution here
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
