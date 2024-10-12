class maura extends ortu {

    public maura(String nama, int umur) {
        super(nama, umur);
    }

    // Overriding metode suara
    @Override
    public void suara() {
        System.out.println(getNama() + " berkata: aku cantik banget");
    }
}
