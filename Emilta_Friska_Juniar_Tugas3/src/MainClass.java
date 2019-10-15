/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Personal
 */
public class MainClass {
    public static void main (String [] args){
    System.out.println ("\t\t DATA KENDARAAN");
    System.out.println ("--------------------------------------------------");
    
    Kendaraan P;
    Mobil m1 = new Mobil();
    m1.setIdKendaraan(611);
    m1.setJarakTempuhAwal(100);
    m1.setJarakTempuh(150);
    m1.setBahanBakar(350);
        
    Mobil m2 = new Mobil();
    m2.setIdKendaraan(612);
    m2.setJarakTempuhAwal(150);
    m2.setJarakTempuh(250);
    m2.setTipeKendaraan("Jeep");
    m2.setKapasitasMesin(2500);
    m2.setBahanBakar(400);
    
    SepedaMotor s1 = new SepedaMotor();
    s1.setIdKendaraan(713);
    s1.setJarakTempuhAwal(100);
    s1.setJarakTempuh(150);
    s1.setBahanBakar(300);
    
    SepedaMotor s2 = new SepedaMotor();
    s2.setIdKendaraan(714);
    s2.setJarakTempuhAwal(100);
    s2.setJarakTempuh(200);
    s2.setTipeKendaraan("Manual");
    s2.setBahanBakar(250);
    
    P = m1;
    P.infoKendaraan();
    System.out.println ("--------------------------------------------------");
    P = m2;
    P.infoKendaraan();
    System.out.println ("--------------------------------------------------");
    P = s1;
    P.infoKendaraan();
    System.out.println ("--------------------------------------------------");
    P = s2;
    P.infoKendaraan();
    }
}
