public class DegreeAdapter implements Degree {
    private LegacyDegree legacyDegree;

    public DegreeAdapter(LegacyDegree legacyDegree) {
        this.legacyDegree = legacyDegree;
    }

    public int getCelsius() {
        return (int) ((legacyDegree.getFahrenheit() - 32) / 1.8);
    }
}
