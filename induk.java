class ortu {
    private String nama;
    private int umur;

    // Constructor
    public ortu(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    // Metode untuk menampilkan suara hewan
    public void suara() {
        System.out.println("Suara hewan");
    }
}
