import java.util.ArrayList;
import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Nhập số phần tử của danh sách: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            int x = sc.nextInt();
            list.add(x);
        }

        System.out.println("Các phần tử trong danh sách là:");
        for (int num : list) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}