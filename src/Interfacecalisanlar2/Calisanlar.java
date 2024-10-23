package Interfacecalisanlar2;
public abstract class Calisanlar {
    public String isimSoyisim;
    public String unvan;
    public String pozisyon;
    public String birimi;
    public int tecrubeYili;
    public double maas;
    public Calisanlar() {
    }
    public Calisanlar(String isimSoyisim, String unvan, String pozisyon, String birimi, int tecrubeYili, double maas) {
        this.isimSoyisim = isimSoyisim;
        this.unvan = unvan;
        this.pozisyon = pozisyon;
        this.birimi = birimi;
        this.tecrubeYili = tecrubeYili;
        this.maas = maas;
    }
    public abstract void zamYap();
    public abstract void zamYap(double netTutar);
    public abstract void terfiYap();
    public abstract void terfiYap(String unvan);
    public abstract void maasHesapla();
}
