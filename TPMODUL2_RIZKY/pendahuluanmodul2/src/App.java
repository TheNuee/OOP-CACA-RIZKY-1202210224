public class App {
    public static void main(String[] args) throws Exception {
        Perangkat per = new Perangkat("Ronaldo", 13, 16f);
        per.informasi();

        System.out.println();

        Laptop lap = new Laptop("asuh", 16, 30f, false);
        lap.informasi();
        lap.bukaGame("tekken");
        lap.kirimEmail("akugila@gila.com");
        lap.kirimEmail("soga@ama.com","amadiketu@gmail.com");

        System.out.println();

        Hanphone han = new Hanphone("apel", 8, 20f, true);
        han.informasi();
        han.telfon(123456);
        han.kirimSMS(654321);
        han.kirimSMS(198765, 567890);

    }
}
