public class Kapal extends TransportasiAir{
    protected String mesin;

    public Kapal(int jumlahKursi, int biaya, String mesin){
        super(jumlahKursi,biaya);
        this.mesin=mesin;
    }

    public void informasi() {
        System.out.println();
        
    }

    public void berlayar() {
        System.out.println("Transportasi Air jenis");
    }

    public void berlayar(int kecepatan) {
        System.out.println();
    }

    public void berlabuh() {
        System.out.println();
    }
}
