package Package1;

public class Mobil3 {
    public static void main(String[] args) {
        // Membuat objek Mobil
        Mobil2 mobilSaya = new Mobil2("Honda", 10);

        // Menampilkan data awal
        System.out.println("Mobil: " + mobilSaya.getMerk());
        System.out.println("Jumlah: " + mobilSaya.getJumlah());

        // Mengubah merk mobil
        mobilSaya.setMerk("Toyota");

        // Menampilkan data setelah perubahan
        System.out.println("Merk mobil: " + mobilSaya.getMerk());
        System.out.println("Jumlah mobil: " + mobilSaya.getJumlah());
    }
}
