import java.util.Scanner;
public class BAI2{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap so nguyen a:");
        int a= sc.nextInt();
        System.out.print("Nhap so nguyen b:");
        int b= sc.nextInt();
        System.out.print("Ngap so nguyen c:");
        int c= sc.nextInt();
        int min =a;
        if(b<min)
          min = b;
        if(c<min)
        min = c;
        System.out.println("So nho nhat trong 3 so nguyen la " +min);

    }
}