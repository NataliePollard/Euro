

public class Euro {
    private final int euros;

    public Euro(int euros) {
        this.euros = euros;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Euro euro = (Euro) o;

        return euros == euro.euros;

    }

    @Override
    public int hashCode() {
        return euros;
    }

    public Euro add(Euro euro) {
        return new Euro(this.euros + euro.euros);
    }
}
