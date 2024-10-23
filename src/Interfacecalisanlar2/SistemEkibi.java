/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfacecalisanlar2;

/**
 *
 * @author cembaydogan
 */
public abstract class SistemEkibi extends  Calisanlar{
    public String alani;

    public SistemEkibi() {
    }
    public SistemEkibi( String isimSoyisim, String unvan, 
            String pozisyon, String birimi, int tecrubeYili, double maas,String alani) {
        super(isimSoyisim, unvan, pozisyon, birimi, tecrubeYili, maas);
        this.alani = alani;
    }
    public abstract void arastir();
    public abstract void bul();
    public abstract void coz();
    
}
