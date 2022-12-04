public class Hanphone extends Perangkat {
    protected boolean fingerprint;

    public Hanphone (String drive, int ram, float processor, boolean fingerprint){
        super(drive, ram, processor);
        this.fingerprint = fingerprint;

    }

    public void informasi(){
        if(fingerprint == true){
            System.out.println("Handphone ini memiliki drive tipe "+ drive + " dengan ram sebesar " +ram +" dan processor " + "secepat " +processor+" Ghz. Selain itu juga laptop ini memiliki Fingerprint");
        }
        else {
            System.out.println("Handphone ini  memiliki drive tipe "+ drive + " dengan ram sebesar " +ram +" dan processor " + "secepat " +processor+" Ghz. Selain itu juga laptop ini tidak memiliki Fingerprint");

        }
    }

    public void telfon(int no_hp){
        System.out.println("handpon berhasil menyamungkan telfon ke no" + no_hp);
    }

    public void kirimSMS(int no_hp){
        System.out.println("handpon berhasil mengirim SMS ke no" + no_hp);
    }

    public void kirimSMS(int no_hp1, int no_hp2) {
        System.out.println("hanpon berhasil mengirim SMS ke no" + no_hp1 +"dan ke" +no_hp2);
    }
}
