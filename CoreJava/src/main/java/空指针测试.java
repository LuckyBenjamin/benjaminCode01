import getClassName.RetryUtil;

/**
 * @ClassName 空指针测试
 * @Description: {}
 * @Author Benjamin
 * @Date 2020/1/14
 **/
public class 空指针测试 {

    public static void main(String[] args) {
        String className = RetryUtil.getClassName();
        String methodName = RetryUtil.getMethodName();
        System.out.println(className);
        System.out.println(methodName);
    }
}
