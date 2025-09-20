/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bttuan4;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class bai6 {
    public static int UCLN(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static int BCNN(int a, int b) {
        return (a * b) / UCLN(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so nguyen thu nhat: ");
        int x = sc.nextInt();

        System.out.print("Nhap so nguyen thu hai: ");
        int y = sc.nextInt();

        int ucln = UCLN(x, y);
        int bcnn = BCNN(x, y);

        System.out.println("UCLN cua " + x + " va " + y + " la: " + ucln);
        System.out.println("BCNN cua " + x + " va " + y + " la: " + bcnn);

        sc.close();
    }
}
   