/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Personal
 */
public class Kendaraan {
    private int idKendaraan;
    private float jarakTempuhAwal,jarakTempuh, bahanBakar;
    
    public Kendaraan() {
        this.idKendaraan = 0;
        this.jarakTempuhAwal = 0;
        this.jarakTempuh = 0;
    }
    
    public Kendaraan(int idKendaraan, float jarakTempuhAwal, float jarakTempuh, float bahanBakar) {
        this.idKendaraan = idKendaraan;
        this.jarakTempuhAwal = jarakTempuhAwal;
        this.jarakTempuh = jarakTempuh;
        this.bahanBakar = bahanBakar;
    }
    
    public int getIdKendaraan() {
        return idKendaraan;
    }

    public void setIdKendaraan(int idKendaraan) {
        this.idKendaraan = idKendaraan;
    }

    public float getJarakTempuhAwal() {
        return jarakTempuhAwal;
    }

    public void setJarakTempuhAwal(float jarakTempuhAwal) {
        this.jarakTempuhAwal = jarakTempuhAwal;
    }

    public float getJarakTempuh() {
        return jarakTempuh;
    }

    public void setJarakTempuh(float jarakTempuh) {
        this.jarakTempuh = jarakTempuh;
    }
    
    public float getbahanBakar() {
        return bahanBakar;
    }

    public void setbahanBakar(float bahanBakar) {
        this.bahanBakar = bahanBakar;
    }

    public float totalJarak(){
        float totalJarak = getJarakTempuhAwal() + getJarakTempuh();
        return totalJarak;
    }
    
    public float Efektivitas(){
        float E, x, y;
        x = getJarakTempuh();
        y = (float) Math.floor(getbahanBakar());
        E = (float) Math.exp(x/y) * (float) Math.log10(2);
        return E;
    }
    
    public String CekEfektivitas(){
        if (Efektivitas() > 0 && Efektivitas() <= 0.5)
            return ("Efektif");
        else
            return ("Tidak Efektif");
   } 
    
    public void infoKendaraan(){
        System.out.println("ID Kendaraan \t\t\t : " +getIdKendaraan()); 
        System.out.println(""); 
        System.out.println("Total jarak yang ditempuh \t : "+totalJarak()+ " km ");
        System.out.println("Efektifitas \t\t\t : " +CekEfektivitas());
    }
}
