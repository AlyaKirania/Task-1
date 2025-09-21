/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tipedata;

/**
 *
 * @author Lenovo
 */
public class LuasLingkaran {
    public static void main(String[] args) {
        double r = 11.78;
        final double PI = 3.141592;//final double artinya bilangan pasti yanng dideklarasikan
        
        double luas = PI*r*r;
        int bilanganBulat = (int)(luas);//use type casting dari pecahan(double) ke bilangan bulat(int)
        double pembulatan = Math.round(luas);//pembulatan(rouunding)
        
        System.out.println("Luas Lingkaran adalah");// use \t for blankflash use \n for enter
        System.out.println("dalam pecahan\t\t : " + luas);
        System.out.println("dalam bilangan bulat\t : " + bilanganBulat);
        System.out.println("dalam pembulatan\t : " + pembulatan);
        
        
       
        
      
    }
}
