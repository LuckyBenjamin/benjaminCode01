package API;

import com.alibaba.fastjson.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName APITest
 * @Description: {}
 * @Author Benjamin
 * @Date 2019/12/31
 **/
public class APITest {
    public static void main(String[] args) {

        System.out.println(result(""));//测试数据
    }

    public static String get_time() {//设置时间
        Date d = new Date();//创建日期对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");//创建格式化日期
        String s = sdf.format(d);//创建成字符串
        return s;
    }

    public static String result(String ISBN) {
        //接口地址
        String requestUrl = "http://58.33.21.20:9966/e3_lsy/e3_master/webopm/web";
        //params用于存储请求数据的参数
        Map params = new HashMap();
        //请求数据
        params.put("key", "test");
        params.put("app_act", "api/ec");
        params.put("app_mode", "func");
        //添加时间
        params.put("requestTime", get_time());
        //数字签名，###填你的数字签名，可以在你的个人中心看到
        params.put("sign","08afd6f9ae0c6017d105b4ce580de885");
        params.put("secret","1a2b3c4d5e6f7g8h9i10j11k12l");


        params.put("version","2.0");

        params.put("serviceType","goods.list.get");

        params.put("data",ISBN);



        //调用httpRequest方法，这个方法主要用于请求地址，并加上请求参数
        String s = httpRequest(requestUrl, params);
        return s;
    }

    private static String httpRequest(String requestUrl, Map params) {
        //buffer用于接受返回的json数据
        StringBuffer buffer = new StringBuffer();
        try {
            //建立URL，把请求地址给补全，其中urlencode（）方法用于把params里的参数给取出来
            URL url = new URL(requestUrl+"?"+urlencode(params));
            System.out.println(url);
            //打开http连接
            HttpURLConnection httpUrlConnection = (HttpURLConnection) url.openConnection();//连接
            httpUrlConnection.setDoInput(true);
            httpUrlConnection.setRequestMethod("GET");
            httpUrlConnection.connect();

            //获得输入
            InputStream inputStream = httpUrlConnection.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream,"utf-8");//编码
            BufferedReader bufferedReader =  new BufferedReader(inputStreamReader);


            //将bufferReader的值给放到str里
            String str = null;
            while((str = bufferedReader.readLine()) != null) {
                buffer.append(str);
            }


            //关闭bufferReader和输入流
            bufferedReader.close();
            inputStreamReader.close();
            inputStream.close();
            // inputStream = null;

            //断开连接
            httpUrlConnection.disconnect();

        } catch(Exception ex) {
            ex.printStackTrace();
        }
        //返回字符串
        return buffer.toString();
    }

    public static String urlencode(Map<String, Object>data) {

        //将map里的参数变成像 showapi_appid=###&showapi_sign=###&的样子
        StringBuilder sb = new StringBuilder();
        for(Map.Entry i : data.entrySet()) {
            try {
                sb.append(i.getKey()).append("=").append(URLEncoder.encode(i.getValue() + "", "UTF-8")).append("&");
            } catch (UnsupportedEncodingException ex) {
                ex.printStackTrace();
            }
        }
        System.out.println(sb.toString());
        return sb.toString();
    }
}
