package API;

import com.alibaba.fastjson.JSONObject;


/**
 * @ClassName test
 * @Description: {}
 * @Author Benjamin
 * @Date 2020/1/3
 **/
public class test {

    public static void main(String[] args) {
        JSONObject json = new JSONObject();
        JSONObject json2 = new JSONObject();
        json.put("id",1);
        json.put("name","李志斌");
        json.put("age",18);
        json.put("sex","男");
        System.out.println(json.toJSONString());
        json2.put("data",json.toJSONString());
        System.out.println(json2.toJSONString()+"ffffffffffffffffffffff");
        UerData uerData = JSONObject.parseObject(json2.toJSONString(), UerData.class);
        System.out.println(uerData+"=================uerData");
        UserClass userClass = JSONObject.parseObject(uerData.getData(), UserClass.class);
        System.out.println(userClass+"======================userClass");


    }


}
