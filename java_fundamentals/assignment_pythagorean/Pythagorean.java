package assignment_pythagorean;

public class Pythagorean {
    // Pythagorean Theorem where c = square root of a^2 + b^2
    // Will need to use the Math class from java.lang package
    public double calculateHypotenuse(int legA, int legB) {
        double aSqrd = (double) legA * legA;
        double bSqrd = (double) legB * legB;
        return Math.sqrt(aSqrd + bSqrd); 
    }
}
