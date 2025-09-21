/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg1;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class B1(tuan4) {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mot so: ");
        double x = sc.nextDouble();

        if (x > 0) 
        {
            System.out.println(x + " la so duong");
        } 
        else 
            if (x < 0) 
        {
            System.out.println(x + " la so am");
        } 
            else 
        {
            System.out.println("So bang 0");
        }
    }
}
