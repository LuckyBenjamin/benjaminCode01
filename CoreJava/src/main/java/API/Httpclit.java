package API;

import org.apache.http.Consts;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.StatusLine;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName Httpclit
 * @Description: {}
 * @Author Benjamin
 * @Date 2020/1/3
 **/
public class Httpclit {
    // get
    public static String get(String url){
        String result = "";
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet get = new HttpGet(url);
        CloseableHttpResponse response = null;
        try{
            // 执行get请求
            response = httpClient.execute(get);
            StatusLine statusLine = response.getStatusLine();
            System.out.println("status code:"+statusLine.getStatusCode());

            // 将返回的结果转成字符串
            result = EntityUtils.toString(response.getEntity());
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            if(response!=null){
                try {
                    response.close();
                } catch (IOException e) {

                }
            }
        }
        return result;
    }

    // post - contentType:x-www-form-urlencoded  (k=v)
    public static String postKV(String url, Map<String,String> map){
        // 返回结果
        String result = "";

        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost post = new HttpPost(url);

        // 封装参数
        List<NameValuePair> param = new ArrayList<NameValuePair>();
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for (Map.Entry<String, String> entry:entrySet){
            param.add(new BasicNameValuePair(entry.getKey(),entry.getValue()));
        }
        CloseableHttpResponse response = null;
        try{
            // 执行post请求
            UrlEncodedFormEntity entity = new UrlEncodedFormEntity(param, Consts.UTF_8);
            post.setEntity(entity);
            response = httpClient.execute(post);
            int statusCode = response.getStatusLine().getStatusCode();
            System.out.println("post code status:  "+statusCode);

            // 获取结果
            result = EntityUtils.toString(response.getEntity());
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            if(response!=null){
                try {
                    response.close();
                } catch (IOException e) {

                }
            }
        }
        return result;
    }

    // post - contentType:application/json "{\"id\":1}"
    public static String postJson(String url, String json) throws Exception {
        String result = "";
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost(url);

        // 设置json请求
        httpPost.setEntity(new StringEntity(json,
                ContentType.create("application/json", "UTF-8")));

        CloseableHttpResponse response = httpClient.execute(httpPost);
        int statusCode = response.getStatusLine().getStatusCode();
        if (statusCode == HttpStatus.SC_OK) {
            result = EntityUtils.toString(response.getEntity(), "UTF-8");
        }
        return result;
    }
}

