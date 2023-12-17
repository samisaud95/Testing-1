import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private Main testing = new Main ();

    @Test
    void testDataOra() {
        String result = testing.testDataOra(true, true, false);
        assertEquals(true, true, String.valueOf(false));

    }
}