public class Hewan extends MakhlukHidup {
    @Override
    public void bernafas() {
        System.out.println("Hewan bernafas dengan paru-paru atau insang.");
    }

    @Override
    public void makan() {
        System.out.println("Hewan makan dengan mulut.");
    }

    // Method spesifik untuk Hewan
    public void berburu() {
        System.out.println("Beberapa hewan berburu untuk mencari makan.");
    }
}
