/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b3;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class B3 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
   {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen thu nhat: ");
        int a = sc.nextInt();
        System.out.print("Nhap so nguyen thu hai: ");
        int b = sc.nextInt();
        int tong = a + b;
        int hieu = a - b;
        int tich = a * b;
        if (b != 0) 
        {
            int thuong = a / b;  
            int du = a % b;       
            System.out.println("Tong: " + tong);
            System.out.println("Hieu: " + hieu);
            System.out.println("Tich: " + tich);
            System.out.println("Thuong: " + thuong);
            System.out.println("Phan du: " + du);
        } 
        else 
        {
            System.out.println("Khong the chia cho 0.");
            System.out.println("Tong: " + tong);
            System.out.println("Hieu: " + hieu);
            System.out.println("Tich: " + tich);
        }

        sc.close();
    }
}
