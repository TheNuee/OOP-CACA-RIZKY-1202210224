public class Laptop extends Perangkat {
    protected boolean webcam;

    public Laptop(String drive, int ram, float processor, boolean webcam){
        super(drive, ram, processor);
        this.webcam=webcam;
    }

    public void informasi(){
        if(webcam == true){
            System.out.println("Handphone ini memiliki drive tipe "+ drive + " dengan ram sebesar " +ram +" dan processor " + "secepat " +processor+" Ghz. Selain itu juga laptop ini memiliki Fingerprint");
        }
        else {
            System.out.println("Handphone ini  memiliki drive tipe "+ drive + " dengan ram sebesar " +ram +" dan processor " + "secepat " +processor+" Ghz. Selain itu juga laptop ini tidak memiliki Fingerprint");

        }
    }

    public void bukaGame(String nama_game) {
        System.out.println("laptop buka game"+nama_game);
    }

    public void kirimEmail(String email) {
        System.out.println("laptop berhasil kirim email"+email);
    }

    public void kirimEmail(String email1, String email2) {
        System.out.println("laptop berhasil kirim email ke"+email1+"dan"+email2);
    }

}
