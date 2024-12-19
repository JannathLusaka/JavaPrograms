public class MyPattern {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(j);
            }
            if (i < 5) {
                System.out.println();
            }
        }

        for (int i = 2; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}





