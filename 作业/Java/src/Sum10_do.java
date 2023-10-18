public class Sum10_do {
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;
        int i = 1;

        do {
            sum += i;
            i++;
        } while (i <= n);

        System.out.println("1+2+3+……10的和是：：" + sum);
    }
}
