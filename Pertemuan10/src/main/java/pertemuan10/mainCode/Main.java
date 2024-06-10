/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan10.mainCode;

import pertemuan10.Mobil;
import pertemuan10.MobilMewah;

/**
 *
 * @author A-12
 */
public class Main {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil();
        Mobil mobil2 = new Mobil("Miracle White",200000,250,"Xiaomi");
        Mobil mobil3 = new Mobil("Ocean Blue","Lexus");
        Mobil mobil4 = new MobilMewah("Eropa");
        mobil4.getInfo();
        mobil4.setHarga(600000);
        mobil4.getMerk();
        
        Mobil mobilMewah1 = new MobilMewah(1500000.00, "Ferarri");
        mobilMewah1.getInfo();
        
        mobil4.gasPol();
    }
}
