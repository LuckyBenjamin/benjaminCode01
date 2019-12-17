package 日期和时间API;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

/**
 * @ClassName GetTimestamp
 * @Description: {获取时间戳}
 * @Author Benjamin
 * @Date 2019/12/2
 **/

public class GetTimestamp {

    /**
     * @MethodName: getTimestamp
     * @Description: 获得当前时间戳
     * @Param: []
     * @Return: void
    **/
    @Test
    public void getTimestamp() {

        /**
         * 获取时间戳三种方法
         */
        //方法一
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println(currentTimeMillis);

        //方法二
        long time = new Date().getTime();
        System.out.println(time);

        //方法三
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        System.out.println(timeInMillis);

        /**
         * 获取时间戳三种方法执行效率比较
         *    Calendar.getInstance().getTimeInMillis() 这种方式速度最慢，
         *    这是因为Canlendar要处理时区问题会耗费较多的时间。
         *    其他两种差不多
         */
        //方法一执行100000次时间
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            long l = System.currentTimeMillis();
        }
        long t2 = System.currentTimeMillis();
        System.out.println(t2-t1);

        //方法二执行100000次时间
        long t3 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            long l = new Date().getTime();
        }
        long t4 = System.currentTimeMillis();
        System.out.println(t4-t3);

        //方法三执行100000次时间
        long t5 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            long l = Calendar.getInstance().getTimeInMillis();
        }
        long t6 = System.currentTimeMillis();
        System.out.println(t6-t5);
    }

}
