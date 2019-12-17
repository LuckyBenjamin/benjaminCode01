package Java泛型;

import org.junit.Test;
import sun.rmi.runtime.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName JavaGenericity
 * @Description: {java中的泛型}
 * @Author Benjamin
 * @Date 2019/12/13
 **/
public class JavaGenericity {
    public static void main(String[] args) {
        //errorTest();
    }

    /**
     * @MethodName: errorTest
     * @Description: 错误使用实例
     * @Param: []
     * @Return: void
    **/
    public static void errorTest(){
        List arrayList = new ArrayList();
        arrayList.add("aaaa");
        arrayList.add(100);

        for(int i = 0; i< arrayList.size();i++){
            String item = (String)arrayList.get(i);
            System.out.println("泛型测试item = " + item);
        }
    }

    @Test
    public void test01(){
        System.out.println("测试");
    }


}
