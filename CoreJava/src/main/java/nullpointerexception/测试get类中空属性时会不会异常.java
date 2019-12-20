package nullpointerexception;

import lombok.Data;
import org.junit.Test;

/**
 * @ClassName 测试get类中空属性时会不会异常
 * @Description: TODO
 * @Author Benjamin
 * @Date 2019/12/20
 **/
public class 测试get类中空属性时会不会异常 {

    /**
     * @MethodName: test01
     * @Description: 测试get类中空属性时会不会异常
     * @Param: []
     * @Return: void
    **/
    @Test
    public void test01(){
        stu stu = new stu();
        System.out.println(stu.getId());
        System.out.println(stu.getName());

    }
}

@Data
class stu{
    private Integer id;
    private String name;
}
