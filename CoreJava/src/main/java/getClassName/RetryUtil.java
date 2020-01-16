package getClassName;

/**
 * @ClassName RetryUtil
 * @Description: {重试工具类}
 * @Author Benjamin
 * @Date 2020/1/14
 **/
public class RetryUtil {

    /**
     *  得到当前线程全类名
     */
    public static String getClassName(){
        StringBuilder result = new StringBuilder();
        try{
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[2];
            String className = stackTraceElement.getClassName();
            result.append(className);
        }catch(Exception e){
            e.printStackTrace();
        }
        return result.toString();
    }

    /**
     *  得到当前线程方法名
     */
    public static String getMethodName(){
        StringBuilder result = new StringBuilder();
        try{
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[2];
            String methodName = stackTraceElement.getMethodName();
            result.append(methodName);
        }catch(Exception e){
            e.printStackTrace();
        }
        return result.toString();
    }

    
}
