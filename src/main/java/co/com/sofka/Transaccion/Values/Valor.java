package co.com.sofka.Transaccion.Values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Valor implements ValueObject<String> {
    private final String valor;

    public Valor(String valor){
        this.valor = Objects.requireNonNull(valor);

        if(this.valor.length() >= 20){
            throw new IllegalArgumentException("Maximo de creditos manejado");
        }
    }

    public String value(){return null;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Valor valor1 = (Valor) o;
        return Objects.equals(valor, valor1.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }
}
