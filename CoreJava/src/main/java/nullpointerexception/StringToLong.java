package nullpointerexception;

import org.junit.Test;

/**
 * @ClassName StringToLong
 * @Description: 测试是否会发生空指针异常
 * @Author Benjamin
 * @Date 2019/12/20
 **/
public class StringToLong {

    /**
     * @MethodName: test01
     * @Description: null时String装Long会出异常
     * @Param: []
     * @Return: void
    **/
    @Test
    public void test01(){

        long l = Long.parseLong(null);
        System.out.println(l);
    }
}
