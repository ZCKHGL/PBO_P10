/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan10;

/**
 *
 * @author A-12
 */
public class MobilMewah extends Mobil implements KendaraanBermotor{
    private double pajakBarangMewah = 200.0;
    private String asalNegara;

    public MobilMewah(String asalNegara) {
        this.asalNegara = asalNegara;
    }

    public MobilMewah(double harga, String merk) {
        super("Merah", 300, 1500000.00, "Ferarri");
        this.asalNegara = asalNegara;
    }

    @Override
    public void gasPol() {
        System.out.println("Gas sampai kecepatan MAX");
    }

    @Override
    public void remSir() {
        System.out.println("Sampai Kendaraan Berhenti!");
    }

    

    
}
