package hw;

import static org.junit.Assert.*;

import java.util.Arrays;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestHelloWorld {

    private HelloWorld fixture;

    @Before
    public void setUp() throws Exception {
        fixture = new HelloWorld();
    }

    @After
    public void tearDown() throws Exception {
        fixture = null;
    }

    @Test
    public void initialization() {
        assertNotNull(fixture);
    }

    @Test
    public void getMessage() {
        assertNotNull(fixture);
        assertEquals("hello world", fixture.getMessage());
    }

    @Test
    public void getYear() {
        assertNotNull(fixture);
        assertEquals(2025, fixture.getYear());
    }

    @Test
    public void getMessageInList() {
        var list = Arrays.asList(fixture.getMessage());
        assertEquals("hello world", list.get(0));
    }

    @Test
    public void getYearInList() {
        var list = Arrays.asList(fixture.getYear());
        assertEquals(2025, list.get(0).intValue());
    }
}

