package co.com.sofka.Billetera.Values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Value implements ValueObject<Integer> {
    private final String value;

    public Value(String value) {
        this.value = Objects.requireNonNull(value);

        if(this.value.length() <= 0 && this.value.length() >= 100){
            throw new IllegalArgumentException("Necesita descripcion de al menos 50 char");
        }
    }

    public Integer value() {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Value value1 = (Value) o;
        return Objects.equals(value, value1.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
