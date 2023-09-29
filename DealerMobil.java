/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.posttest1;
import java.util.ArrayList;
/**
 *
 * @author username
 */


public class DealerMobil {
    private final String namaDealer;
    private final ArrayList<String> daftarMobil;

    public DealerMobil(String namaDealer) {
        this.namaDealer = namaDealer;
        this.daftarMobil = new ArrayList<>();
    }

    public void tambahMobil(String mobil) {
        daftarMobil.add(mobil);
    }

    public void tampilkanDaftarMobil() {
        System.out.println("Daftar Mobil di " + namaDealer + ":");
        for (String mobil : daftarMobil) {
            System.out.println(mobil);
        }
    }
}

