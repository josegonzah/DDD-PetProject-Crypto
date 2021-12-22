package co.com.sofka.Transaccion.Values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Direccion implements ValueObject<String> {
    private final String direccion;


    public Direccion(String direccion) {
        this.direccion = Objects.requireNonNull(direccion);

        if(this.direccion.length() >= 1){
            throw new IllegalArgumentException("Ingrese caracter de direccion");
        }
    }

    public String value(){ return null; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Direccion direccion1 = (Direccion) o;
        return Objects.equals(direccion, direccion1.direccion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(direccion);
    }
}
