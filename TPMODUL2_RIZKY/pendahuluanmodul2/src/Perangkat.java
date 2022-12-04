public class Perangkat {
    protected String drive;
    protected int ram;
    protected float processor;

    public Perangkat (String drive, int ram, float processor){
        this.drive = drive;
        this.ram = ram;
        this.processor = processor;
    }

    public void informasi(){
        System.out.println("perangkat tidak diketahui memiliki drive type "+drive+"dengan ram"+ram+"GB dengan processor secepat"+processor+"Ghz");
    }

}
