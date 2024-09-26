public class accenture60 {
    public static int table(int n) {
        if (n == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print(n * i + " ");

            sum += n * i;
        }
        System.out.println();
        return sum;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(table(n));
    }
}
