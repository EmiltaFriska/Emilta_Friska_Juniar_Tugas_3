/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Personal
 */
public class SepedaMotor extends Kendaraan {
    private String namaKendaraan;
    private String tipeKendaraan;
    private float bahanBakar;  

    public SepedaMotor() {
        this.namaKendaraan = "Sepeda Motor";
        this.tipeKendaraan = "Matic";
        this.bahanBakar = 5;
    }

    public String getNamaKendaraan() {
        return namaKendaraan;
    }

    public void setNamaKendaraan(String namaKendaraan) {
        this.namaKendaraan = namaKendaraan;
    }

    public String getTipeKendaraan() {
        return tipeKendaraan;
    }

    public void setTipeKendaraan(String tipeKendaraan) {
        this.tipeKendaraan = tipeKendaraan;
    }

    public float getBahanBakar() {
        return bahanBakar;
    }

    public void setBahanBakar(float bahanBakar) {
        this.bahanBakar = bahanBakar;
        setbahanBakar(bahanBakar);
    }

    public void infoKendaraan(){
        System.out.println("Nama Kendaraan \t\t\t : " +getNamaKendaraan());  
        System.out.println("Tipe Kendaraan \t\t\t : " +getTipeKendaraan());  
        System.out.println("Bahan Bakar  \t\t\t : "+getBahanBakar()+ " mL ");  
        super.infoKendaraan();
    } 
}
