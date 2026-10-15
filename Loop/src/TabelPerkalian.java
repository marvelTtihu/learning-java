import java.util.Scanner;

public class TabelPerkalian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int angka = input.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(angka + " * " + i + " = " + (angka * i));
        } 

        input.close();
    }
}
