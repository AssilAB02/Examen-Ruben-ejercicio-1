class Elementosimple extends Componente {
    private double precio;

    public Elementosimple(int codigo, double precio) {
        super(codigo);
        this.precio = precio;
    }

    @Override
    public double getPrecio() {
        return precio;
    }
}
