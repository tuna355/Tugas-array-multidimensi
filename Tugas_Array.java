/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tuna
 */
import java.util.Scanner;
public class Tugas_Array {
    public static void main(String[] args) {
       // Membuat Array dan Scanner
        String[][] Array = new String[6][3];
        Scanner scan = new Scanner(System.in);

        // mengisi setiap Array
        for(int bar = 0; bar < Array.length; bar++){
            for(int kol = 0; kol < Array[bar].length; kol++){
                System.out.format("Masukkan data Array(%d,%d): ", bar, kol);
                Array[bar][kol] = scan.nextLine();
            }
        }

        // menampilkan isi Array
        System.out.println("-------------------------");
        for(int bar = 0; bar < Array.length; bar++){
            for(int kol = 0; kol < Array[bar].length; kol++){
                System.out.format("| %s | \t", Array[bar][kol]);
            }
            System.out.println("");
        }
        System.out.println("-------------------------");
    }
}

        
}
}