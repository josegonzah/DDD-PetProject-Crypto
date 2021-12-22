package co.com.sofka.Transaccion.Values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Hash implements ValueObject<String> {
    private final String hash;


    public Hash(String hash) {
        this.hash = Objects.requireNonNull(hash);

        if(this.hash.length() <= 20){
            throw new IllegalArgumentException("Necesita un hash mas largo");
        }
    }

    public String value(){return null;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hash hash1 = (Hash) o;
        return Objects.equals(hash, hash1.hash);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hash);
    }
}
