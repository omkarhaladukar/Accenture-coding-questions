public class accenture55 {
    public static int decTobin(int n) {
        String bin = Integer.toBinaryString(n);

        int sum = 0;
        for (int i = 0; i < bin.length(); i++) {
            if (bin.charAt(i) == '1') {
                sum++;
            }
        }
        // for (char digit : bin.toCharArray()) { // advanced
        // sum += Character.getNumericValue(digit);
        // }
        return sum;
    }

    public static void main(String[] args) {
        int n = 15;
        System.out.println(decTobin(n));
    }
}
