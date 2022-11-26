import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertThrows;
import java.util.Arrays;
import java.util.List;



/**
 * The TestColour class will be used for test-driven development of the Colour class.
 */

public class TestColour {

    /**
     * Test method to check that an IllegalArgumentException is thrown when any RGB value is less than 0.
     */
    @Test
    void RGBLessThanZero() {

        Exception RGBLessThanZero = assertThrows(IllegalArgumentException.class, () -> {
            Colour colour = new Colour(-1, 0, 0);
        });
        Assertions.assertEquals("RGB values must be between 0.0 and 1.0", RGBLessThanZero.getMessage());
    }

    /**
     * Test method to check that an IllegalArgumentException is thrown when any RGB value is greater than 1.
     */
    @Test
    void RGBGreaterThanOne() {

        Exception RGBGreaterThanOne = assertThrows(IllegalArgumentException.class, () -> {
            Colour colour = new Colour(2, 0, 0);
        });
        Assertions.assertEquals("RGB values must be between 0.0 and 1.0", RGBGreaterThanOne.getMessage());
    }
}
