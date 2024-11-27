public class Tumbuhan extends MakhlukHidup {
    @Override
    public void bernafas() {
        System.out.println("Tumbuhan bernafas melalui stomata.");
    }

    @Override
    public void makan() {
        System.out.println("Tumbuhan membuat makanan sendiri melalui fotosintesis.");
    }

    // Method spesifik untuk Tumbuhan
    public void fotosintesis() {
        System.out.println("Tumbuhan melakukan fotosintesis untuk menghasilkan energi.");
    }
}
