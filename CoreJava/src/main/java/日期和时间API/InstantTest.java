package 日期和时间API;

import org.junit.Test;

import java.time.Instant;

/**
 * @ClassName InstantTest
 * @Description: TODO
 * @Author Benjamin
 * @Date 2019/12/3
 **/

public class InstantTest {

    @Test
    public void testInsatant(){
        Instant now = Instant.now();
        System.out.println(now);

    }

}
