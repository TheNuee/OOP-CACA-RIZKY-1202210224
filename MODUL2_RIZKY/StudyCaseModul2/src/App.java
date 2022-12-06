public class App {
    public static void main(String[] args) throws Exception {
        TransportasiAir tra = new TransportasiAir(1000, 80);
        tra.informasi();

        System.out.println();

        Sampan sam = new Sampan(1100, 70, 3);
        sam.informasi();
        sam.berlayar();
        sam.berlabuh();
        sam.berlabuh(9);

        System.out.println();

        Kapal kap = new Kapal(200, 340, "V12 McLaren");
        kap.informasi();
        kap.berlayar();
        kap.berlayar(120);
        kap.berlabuh();

    }
}
