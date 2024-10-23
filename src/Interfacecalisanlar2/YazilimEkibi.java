/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfacecalisanlar2;

/**
 *
 * @author cembaydogan
 */
public abstract class YazilimEkibi extends Calisanlar{
    public String yetenek;

    public YazilimEkibi() {
    }

    public YazilimEkibi(String isimSoyisim, String unvan, String pozisyon,
            String birimi, int tecrubeYili, double maas, String yetenek) {
        super(isimSoyisim, unvan, pozisyon, birimi, tecrubeYili, maas);
        this.yetenek = yetenek;
    }
    public abstract void calis();
    public abstract void ogren();
    public abstract void uygula();
}
