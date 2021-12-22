package co.com.sofka.Billetera.Values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class LlavePublica implements ValueObject<String> {
    private final String llavePublica;

    public LlavePublica(String llavePublica) {
        this.llavePublica = Objects.requireNonNull(llavePublica);

        if(this.llavePublica.length() <= 20){
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
        LlavePublica that = (LlavePublica) o;
        return Objects.equals(llavePublica, that.llavePublica);
    }

    @Override
    public int hashCode() {
        return Objects.hash(llavePublica);
    }
}
