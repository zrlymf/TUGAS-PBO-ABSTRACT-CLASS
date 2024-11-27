public class Main {
    public static void main(String[] args) {
        // Membuat objek dari setiap subclass
        MakhlukHidup manusia = new Manusia();
        MakhlukHidup hewan = new Hewan();
        MakhlukHidup tumbuhan = new Tumbuhan();

        // Menjalankan metode pada masing-masing objek
        System.out.println("Manusia:");
        manusia.bernafas();
        manusia.makan();
        ((Manusia) manusia).berbicara(); // Casting untuk memanggil metode khusus Manusia

        System.out.println("\nHewan:");
        hewan.bernafas();
        hewan.makan();
        ((Hewan) hewan).berburu(); // Casting untuk memanggil metode khusus Hewan

        System.out.println("\nTumbuhan:");
        tumbuhan.bernafas();
        tumbuhan.makan();
        ((Tumbuhan) tumbuhan).fotosintesis(); // Casting untuk memanggil metode khusus Tumbuhan
    }
}
