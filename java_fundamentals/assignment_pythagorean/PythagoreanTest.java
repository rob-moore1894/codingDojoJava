package assignment_pythagorean;

public class PythagoreanTest {
    public static void main(String[] args) {
        Pythagorean triangle = new Pythagorean();
        double triangleHypo = triangle.calculateHypotenuse(3, 4);
        System.out.println(triangleHypo);
    }
}
