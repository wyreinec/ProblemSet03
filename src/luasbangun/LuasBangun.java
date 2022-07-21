/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luasbangun;

import java.time.Year;
import javax.swing.JOptionPane;

/**
 *
 * @author FGA Yohana Sri Rejeki
 */
public class LuasBangun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JOptionPane.showMessageDialog(null, "Hai Aku Jakey!\nAku akan membantumu dalam menghitung bangun!\n"
                                     + "Lengkapi dulu yu biodata kamu, biar Jakey bisa kenal dekat denganmu!");
        
        String phi = "3.14";
        
        JOptionPane.showMessageDialog(null, "Biodata");
        String namaDepan = JOptionPane.showInputDialog("Siapa nama depan?");
        String namaBelakang =JOptionPane.showInputDialog("Siapa nama belakang?");
        int semester = Integer.parseInt(JOptionPane.showInputDialog("Semester berapa kamu sekarang?"));
        int tahunLahir = Integer.parseInt(JOptionPane.showInputDialog("Kamu lahir tahun berapa?"));
        double angkaKesukaan= Double.parseDouble(JOptionPane.showInputDialog("Berapa angka kesukaan kamu?"));
        
        int tahunSekarang = Year.now().getValue();
        int umurSekarang = tahunSekarang - tahunLahir;
        
        JOptionPane.showMessageDialog(null, "Wah " + namaDepan + " " + namaBelakang + " sudah berumur " + umurSekarang + " ya!\n"
                                      + "Ohh kamu udah semester " + semester + ".. Hebat hebat.. \nBtw, angka kesukaanmu bagus ya, " + angkaKesukaan + ". Sama kayak Jakey!\n" 
                                      + "Yuk ah kita lanjut ngitung Tabung dan Balok yang kamu punya!");
        
        JOptionPane.showMessageDialog(null, "Menghitung Tabung");
        
        double rusuk = Double.parseDouble(JOptionPane.showInputDialog("Masukkan rusuk (cm)"));
        double tinggiTabung = Double.parseDouble(JOptionPane.showInputDialog("Masukkan tinggi tabung (cm)"));
        int pangkat = 2;
        double kelilingTabung, luasSelimut, luasPermukaan, volumeTabung;
        
        kelilingTabung = 2 * Double.parseDouble(phi) * rusuk;
        luasSelimut = 2 * Double.parseDouble(phi) * rusuk * tinggiTabung;
        luasPermukaan = (2 * Double.parseDouble(phi) * rusuk * tinggiTabung) + (2 * Double.parseDouble(phi) * Math.pow(rusuk, pangkat));
        volumeTabung = Double.parseDouble(phi) * Math.pow(rusuk, pangkat) * tinggiTabung;
        
        JOptionPane.showMessageDialog(null, "Jakey sudah bantu kamu nih. \nTabung kamu memiliki \nkeliling " + String.format("%.2f", kelilingTabung) + "cm,\nluas selimut " + String.format("%.2f", luasSelimut)
                                      + "cm\u00B2,\nluas permukaan " + String.format("%.2f", luasPermukaan) + "cm2\u00B2,\nvolume " + volumeTabung + "cm\u00B3");
        
        JOptionPane.showMessageDialog(null, "Yuk ah kita menghitung balok");
        
        double panjang = Double.parseDouble(JOptionPane.showInputDialog("Masukkan panjang (cm)"));
        double lebar = Double.parseDouble(JOptionPane.showInputDialog("Masukkan lebar (cm)"));
        double tinggiBalok = Double.parseDouble(JOptionPane.showInputDialog("Masukkan tinggi (cm)"));
        double kelilingBalok, luasBalok, volumeBalok;
        
        kelilingBalok = 4 * (panjang + lebar + tinggiBalok);
        luasBalok = (2 * panjang * lebar) + (2 * panjang * tinggiBalok) + (2 * lebar * tinggiBalok);
        volumeBalok = panjang * lebar * tinggiBalok;
        
        JOptionPane.showMessageDialog(null, "Tadaa!! Balok kamu memiliki \nkeliling " + String.format("%.2f", kelilingBalok) + "cm,\nluas " + String.format("%.2f", luasBalok)
                                      + "cm2\u00B2,\nvolume " + volumeBalok + "cm\u00B3");
        
        String suka = JOptionPane.showInputDialog(null, "Jakey udah bantu kamu nih menghitung tabung dan balok yang kamu punya ^_^\nApakah kamu suka dengan program ini? (Ya/Tidak)");
        JOptionPane.showMessageDialog(null, "Kamu menjawab " + suka + "\nTerima kasih sudah mencoba program ini! \nSemoga harimu menyenangkan!");
        
    }
    
}
