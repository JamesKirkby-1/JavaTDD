/**
 * The colour class will be used to represent a colour using values between 0.0 and 1.0 for red, green and blue.
 */

public class Colour {

    private float red;
    private float green;
    private float blue;

    /**
     * Constructor for the Colour class.
     */

    public Colour(float red, float green, float blue) {

        this.red = red;
        this.green = green;
        this.blue = blue;

        if (red < 0.F || green < 0.F || blue < 0.F) {
            throw new IllegalArgumentException("RGB values must equal to or greater than 0.0");
        }
        if (red > 1.0F || green > 1.0F || blue > 1.0F) {
            throw new IllegalArgumentException("RGB values must be equal to or less than 1.0");
        }
    }
}
