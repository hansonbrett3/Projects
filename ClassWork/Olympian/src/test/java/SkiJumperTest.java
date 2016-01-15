
import com.thesoftwareguild.olympian.SkiJumper;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bretthanson
 */
public class SkiJumperTest {

    @Test
    public void SkiJumperTest() {
        
        SkiJumper jumper = new SkiJumper();
        assertEquals(jumper.competeInEvent(), "SkiJump");
    }
}
