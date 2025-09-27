public class Main {
    public static void main(String[] args) {
        Degree degree = new DegreeAdapter(new LegacyDegree());
        System.out.println("Today there's " + degree.getCelsius() + " degree Celsius.");
    }
}
