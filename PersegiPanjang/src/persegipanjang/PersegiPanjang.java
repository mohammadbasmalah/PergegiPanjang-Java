/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persegipanjang;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class PersegiPanjang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner baca = new Scanner(System.in);
        int p,l,K,L;
        System.out.print("Panjang = ");p=baca.nextInt();
        System.out.print("Lebar = ");l=baca.nextInt();
        
        L=p*l;K=2*(p+l);
        
        System.out.println("Luas = "+L);
        System.out.println("Keliling = "+K);
    }
    
}
