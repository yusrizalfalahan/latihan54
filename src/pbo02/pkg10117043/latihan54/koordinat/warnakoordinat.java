/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo02.pkg10117043.latihan54.koordinat;

/**
 *
 * @author Acer
 */
public class warnakoordinat extends koordinat {
    public String namawarna;
    public warnakoordinat(String namaWarna, int x, int y) {
        super(x, y);
        this.namawarna = namaWarna;
    }

    public String getNamawarna() {
        return namawarna;
    }

    public void setNamawarna(String namawarna) {
        this.namawarna = namawarna;
    }
    
    
}
