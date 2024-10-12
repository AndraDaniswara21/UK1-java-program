class ahmad extends ortu {
    
    public ahmad(String nama, int umur) {
        super(nama, umur);
    }

    // Overriding metode suara
    @Override
    public void suara() {
        System.out.println(getNama() + " berkata: ahlan wa sahlan");
    }
}