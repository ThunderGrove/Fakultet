import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FakultetTest {

    @Test
    void fakultet() {
        Fakultet fakultetX = new Fakultet();
        assertEquals(0, fakultetX.fakultet(0),"Det er forkert");
        assertEquals(0, fakultetX.fakultet(3),"Det er forkert");
        assertEquals(-1, fakultetX.fakultet(-10),"Det er forkert");



    }
}