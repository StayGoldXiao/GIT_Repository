import java.util.Random;

public class Array_2 {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = random.nextInt(90) + 10;
            }
        }

        System.out.println("二维数组的内容为：");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int max = arr[0][0];
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++)
                if (arr[i][j] > max)
                    max = arr[i][j];

        System.out.println("最大值为: " + max);
    }
}
