/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan10;

import javax.swing.plaf.basic.BasicTreeUI;

/**
 *
 * @author A-12
 */
public class Mobil implements KendaraanBermotor{
    private String warna;
    private int kecepatan;
    private double harga;
    private String merk;
    
    public Mobil(){
        System.out.println("This is a Constructor");
        this.harga = 300000.00;
        this.merk = "Tesla";
        this.kecepatan = 350;
        this.warna = "Phantom Black";
        
    }

    public Mobil(String warna, int kecepatan, double harga, String merk) {
        this.warna = warna;
        this.kecepatan = kecepatan;
        this.harga = harga;
        this.merk = merk;
    }

    public Mobil(String warna, String merk) {
        this.warna = warna;
        this.merk = merk;
    }
    
    

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    public String getMerk() {
        return merk;
    }
    
    public void getInfo(){
        System.out.println("Merk = "+ this.merk);
        System.out.println("Harga = "+ getHarga());
        System.out.println("Kecepatan Max = "+ this.kecepatan);
        System.out.println("Warna = "+ this.warna);
    }

    @Override
    public void gasPol() {
        System.out.println("Gas sampe Akhirat");
    }

    @Override
    public void remSir() {
        System.out.println("Berhenti Kawan!");
    }
}
