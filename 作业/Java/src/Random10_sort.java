import java.util.Arrays;
import java.util.Random;

public class Random10_sort {

    public static void main(String[] args) {

        Random random = new Random();
        int[] num10 = new int[10];
        int max = 0;
        int min = 100;
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            int num = random.nextInt(100);
            num10[i] = num;
            max = Math.max(max, num);
            min = Math.min(min, num);
            sum += num;
        }

        double aver = (double) sum / 10;

        System.out.print("10个随机数为：");
        for (int num : num10)
            System.out.print(num + " ");

        Arrays.sort(num10);

        for (int i = 0; i < num10.length / 2; i++) {
            int temp = num10[i];
            num10[i] = num10[num10.length - 1 - i];
            num10[num10.length - 1 - i] = temp;
        }

        System.out.println("\n从大到小排序后的数组为：");
        for (int num : num10)
            System.out.print(num + " ");

        //System.out.println("\n最大值：" + max);
        //System.out.println("最小值：" + min);
        //System.out.println("平均值：" + aver);

    }
}
