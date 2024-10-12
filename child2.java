class alex extends ortu {

    public alex(String nama, int umur) {
        super(nama, umur);
    }

    // Overriding metode suara
    @Override
    public void suara() {
        System.out.println(getNama() + " berkata: halo cantik");
    }
}
