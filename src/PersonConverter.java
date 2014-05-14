import org.apache.struts2.util.StrutsTypeConverter;
import java.util.*;

/**
 * Created by el1ven on 14-5-14.
 */
public class PersonConverter extends StrutsTypeConverter {

    //从字符串转化为对象的方法
    public Object convertFromString (Map map, String[] strings, Class aClass){
        if(strings.length > 0){
            String strs = strings[0];
            //对输入的信息进行字符串操作
            String[] personArr = strs.split(",");
            if(personArr.length == 2){
                //输入格式正确,则创建person对象
                Person p = new Person();
                p.setId(Integer.parseInt(personArr[0]));
                p.setName(personArr[1]);
                return p;
            }else{
                return null;
            }


        }else{
            return null;
        }
    }


    //从对象转化为字符串的方法
    public String convertToString(Map map, Object o){
        if(o instanceof Person){
            return o.toString();
        }else{
            return "";
        }

    }

}
