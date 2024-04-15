import java.util.ArrayList;
import java.util.List;

class Kit extends Componente {
    private List<Componente> componentes = new ArrayList<>();

    public Kit(int codigo) {
        super(codigo);
    }

    public void agregar(Componente componente) {
        componentes.add(componente);
    }

    public void remover(Componente componente) {
        componentes.remove(componente);
    }

    @Override
    public double getPrecio() {
        double precioTotal = 0;
        for (Componente componente : componentes) {
            precioTotal += componente.getPrecio();
        }
        return precioTotal * 0.9; // Aplicar descuento del 10%
    }
}
