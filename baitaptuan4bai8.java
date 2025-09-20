/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class baitaptuan4bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập số phần tử của mảng
        System.out.print("nhap phan tu cua mang: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Nhập các phần tử
        System.out.println("nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int maxCount = 0;
        int mostFrequent = arr[0];

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mostFrequent = arr[i];
            }
        }
        System.out.println("phan tu xuat hien nhieu nhat la: " + mostFrequent + 
                           " (xuat hien" + maxCount + " lan)");

        sc.close();
    }
}

