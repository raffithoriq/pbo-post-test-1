/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package project.posttest1;

/**
 *
 * @author username
 */

public class Posttest1 {
    public static void main(String[] args) {
        DealerMobil dealer = new DealerMobil("Dealer ABC");

        dealer.tambahMobil("Nissan Sentra");
        dealer.tambahMobil("Chevrolet Cruze");
        dealer.tambahMobil("Hyundai Elantra");
        dealer.tambahMobil("Toyota Supra MK14");
        dealer.tambahMobil("Honda Brio");
        
        dealer.tampilkanDaftarMobil();
    }
}
