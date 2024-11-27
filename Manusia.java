public class Manusia extends MakhlukHidup {
    @Override
    public void bernafas() {
        System.out.println("Manusia bernafas dengan paru-paru.");
    }

    @Override
    public void makan() {
        System.out.println("Manusia makan menggunakan tangan.");
    }

    // Method spesifik untuk Manusia
    public void berbicara() {
        System.out.println("Manusia dapat berbicara.");
    }
}
