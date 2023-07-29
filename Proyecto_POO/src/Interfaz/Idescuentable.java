package Interfaz;

import java.util.function.BiFunction;

public interface Idescuentable {
    public double descuentoPordia(double precio, int cantidad);
    BiFunction<Double ,Integer ,Double> OperacionM=(t, u) -> t*u;

}
