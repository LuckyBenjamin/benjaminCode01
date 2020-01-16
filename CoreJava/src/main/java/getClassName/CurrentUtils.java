package getClassName;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @ClassName Test
 * @Description: {}
 * @Author Benjamin
 * @Date 2020/1/10
 **/
public class CurrentUtils {

    @Test
    public void getClassTest(){
        StringBuilder result = new StringBuilder();
        try{
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[1];
            String className = stackTraceElement.getClassName();
            String methodName = stackTraceElement.getMethodName();
            result.append(className);
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(result.toString());
    }

}
