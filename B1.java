/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b1;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class B1 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vui long nhap ten cua ban: ");
        String ten = scanner.nextLine();

        System.out.println("Hello " + ten);

        scanner.close();
    }
}
