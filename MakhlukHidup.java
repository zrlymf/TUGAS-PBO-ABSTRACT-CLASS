// Abstract Class
public abstract class MakhlukHidup {
    // Abstract methods (harus diimplementasikan di subclass)
    public abstract void bernafas();
    public abstract void makan();

    // Concrete method (opsional untuk dipakai oleh subclass)
    public void bergerak() {
        System.out.println("Makhluk hidup dapat bergerak.");
    }
}
