package Loop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int total = 0;

        // System.out.print("Masukkan nilai: ");
        // int nilai = sc.nextInt();

        // while(nilai >= 0){
        //     total += nilai;
        //     nilai = sc.nextInt();
        // }

        // System.out.println("Total semua nilai yang dimasukkan: " + total);

        // sc.close();

        Scanner input = new Scanner(System.in);
        int total = 0;
        
        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();
        
        while(nilai >= 0){
            total += nilai;
            nilai = input.nextInt();
        }
        System.out.println("Total Semua nilai yang dimasukkan: " + total);

        input.close();
    }
}
