/**
 * The colour class will be used to represent a colour using values between 0.0 and 1.0 for red, green and blue.
 */

public class Colour {

    private float red;
    private float green;
    private float blue;

    /**
     * Constructor for the Colour class.
     * @param red The red value of the colour.
     * @param green The green value of the colour.
     * @param blue The blue value of the colour.
     */

    public Colour(float red, float green, float blue) {

        this.red = red;
        this.green = green;
        this.blue = blue;

        if (red < 0 || green < 0 || blue < 0) {
            throw new IllegalArgumentException("RGB values must equal to or greater than 0.0");
        }
        if (red > 1 || green > 1|| blue > 1) {
            throw new IllegalArgumentException("RGB values must be equal to or less than 1.0");
        }
    }

    /**
     * Constructor for the hex colour class.
     * @param hex The hex value of the colour, where the first two characters are the red value, the
     * second two characters are the green value and the last two characters are the blue value.
     */
    public Colour(String hex) {

        if (hex.length() != 6) {
            throw new IllegalArgumentException("Invalid hex value");
        }

        try {
            this.red = Integer.parseInt(hex.substring(0, 2), 16) / 255f;
            this.green = Integer.parseInt(hex.substring(2, 4), 16) / 255f;
            this.blue = Integer.parseInt(hex.substring(4, 6), 16) / 255f;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid hex value");
        }
    }
}
