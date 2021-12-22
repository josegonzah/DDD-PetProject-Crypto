package co.com.sofka.Billetera.Values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class LlavePrivada implements ValueObject<String> {
    private final String llavePrivada;

    public LlavePrivada(String llavePrivada) {
        this.llavePrivada = Objects.requireNonNull(llavePrivada);

        if(this.llavePrivada.length() <= 20){
            throw new IllegalArgumentException("Necesita llave de al menos 20 char");
        }
    }

    public String value(){
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LlavePrivada that = (LlavePrivada) o;
        return Objects.equals(llavePrivada, that.llavePrivada);
    }

    @Override
    public int hashCode() {
        return Objects.hash(llavePrivada);
    }
}
