/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo02.pkg10117043.latihan54.koordinat;

/**
 *NAMA       : Yusrizal Falahan
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117043
 * @author Acer
 */
public class PBO0210117043Latihan54Koordinat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        warnakoordinat Warnakoordinat = new warnakoordinat("Jingga", 10, 4);
        System.out.println("Warna Koordinat : " + Warnakoordinat.getNamawarna());
        System.out.println("Koordinat Sumbu : " + Warnakoordinat.getX() + ", y : " + Warnakoordinat.getY());
    }
    
}
