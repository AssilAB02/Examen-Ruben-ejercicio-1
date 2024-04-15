abstract class Componente {
    protected int codigo;

    public Componente(int codigo) {
        this.codigo = codigo;
    }

    public abstract double getPrecio();
}
