public class Sampan extends TransportasiAir {
    protected int layar;

    public Sampan(int jumlahKursi, int biaya, int layar){
        super(jumlahKursi,biaya);
        this.layar=layar;
    }

    public void informasi() {
        System.out.println();
    }

    public void berlayar() {
        System.out.println("transportasi air jenis sampan berlabuh di pantai menggunakan"+layar+"layar");
    }

    public void berlabuh() {
        System.out.println("transportasi air jenis sampan berlabuh di pantai tanpa layar");
    }

    public void berlabuh(int jangkar) {
        System.out.println("transportasi air jenis sampan berlabuh di pantai menggunakan"+jangkar+"jangkar");
    }
}
