/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg10;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class B10(tuan4)
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
      Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); list.add(2); list.add(3); list.add(4); list.add(5);

        while (true) 
        {
            System.out.println("\nDanh sach hien tai: " + list);
            System.out.println("1. Them phan tu");
            System.out.println("2. Xoa phan tu");
            System.out.println("3. Thoat");
            System.out.print("Chon: ");
            int ch = sc.nextInt();

            if (ch == 1) 
            {
                System.out.print("Nhap gia tri can them: ");
                int val = sc.nextInt();
                System.out.print("Nhap vi tri (0.." + list.size() + ", nhap -1 de them cuoi): ");
                int pos = sc.nextInt();

                if (pos == -1 || pos >= list.size()) 
                {
                    list.add(val);
                } else 
                if (pos < 0) 
                {
                    System.out.println("Vi tri khong hop le");
                } else 
                {
                    list.add(pos, val);
                }
            } else 
                if (ch == 2) 
                {
                if (list.isEmpty()) 
                {
                    System.out.println("Danh sach rong!");
                    continue;
                }
                System.out.print("Nhap vi tri can xoa (0.." + (list.size() - 1) + "): ");
                int pos = sc.nextInt();
                if (pos >= 0 && pos < list.size()) 
                {
                    int removed = list.remove(pos);
                    System.out.println("Đa xoa phan tu " + removed);
                } else 
                    System.out.println("Vi tri khong hop le");
                } else 
                if (ch == 3) 
                {
                System.out.println("Ket thuc chuong trinh.");
                break;
                } else 
                {
                System.out.println("Chon sai, nhap lai!");
                }
        }
    }
    
}
