public class main {
    
    public static void main(String[] args) {
        // Membuat objek dari kelas anak
        ahmad ahmad = new ahmad("ahmad", 20);
        alex alex = new alex("alex", 18);
        maura maura = new maura("maura", 17);

        // Menampilkan suara masing-masing hewan
        ahmad.suara();
        alex.suara();
        maura.suara();

        // Menggunakan setter dan getter
        ahmad.setUmur(20);
        System.out.println(ahmad.getNama() + " sekarang berumur " + ahmad.getUmur() + " tahun.");
        
        // Overloading constructor (contoh)
        alex alex2 = new alex("alex", 18);
        
        System.out.println(alex2.getNama() + " berumur " + alex2.getUmur() + " tahun.");
        
        // Mengubah nama menggunakan setter
        alex2.setNama("buaya darat");
        System.out.println("Nama baru anjing adalah: " + alex2.getNama());
        
        // Demonstrasi polymorphism
        ortu[] hewanArray = {ahmad, alex, maura};
        
        for (ortu hewan : hewanArray) {
            hewan.suara(); // Memanggil metode suara yang sesuai berdasarkan objeknya
        }
    }
}