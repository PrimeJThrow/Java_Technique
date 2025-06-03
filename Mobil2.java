package Package1;

public class Mobil2 {
    private String merk;
    private int jumlah;
	
	public Mobil2(String merk, int jumlah) {
        this.merk = merk;
        this.jumlah = jumlah;
    }

    // Setter untuk merk
    public void setMerk(String merk) {
        this.merk = merk;
    }

    // Getter untuk merk
    public String getMerk() {
        return this.merk;
    }

    // Getter untuk jumlah
    public int getJumlah() {
        return jumlah;
    }
}

