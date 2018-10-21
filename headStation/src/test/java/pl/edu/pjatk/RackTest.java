package pl.edu.pjatk;

import org.junit.Test;
import pl.edu.pjatk.tau.Rack;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class RackTest {

    @Test
    public void testDefaultRackSizeEquals42() {
        Rack rack = new Rack();
        Integer rackSize = rack.size;
        assertThat("Rack size is equal 42", rackSize, is(42));
    }
}
