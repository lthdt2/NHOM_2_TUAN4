/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg4;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class B4(tuan4)
{
    public static void main(String[] args) 
    {
      Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n (nguyen duong): ");
        int n = sc.nextInt();

        if (n <= 0) 
        {
            System.out.println("n phai > 0");
        } 
        else 
        {
            int tong = n * (n + 1) / 2; 
            System.out.println("Tong tu 1 den " + n + " = " + tong);
        }
    }
    
}
