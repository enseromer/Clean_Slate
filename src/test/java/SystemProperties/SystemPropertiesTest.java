package SystemProperties;

import org.testng.annotations.Test;

import java.util.Map;
import java.util.Properties;

public class SystemPropertiesTest {

    @Test
    public void systemPropertiesTest1(){
        String os = System.getProperty("os.name");
        String user = System.getProperty("user.name");
        String javaVersion = System.getProperty("java.specification.version");
        String homeDirectory = System.getProperty("user.home");
        System.out.println(os);
        System.out.println(user);
        System.out.println(javaVersion);
        System.out.println(homeDirectory);
        Properties properties=System.getProperties();
        for (Map.Entry<Object, Object> property: properties.entrySet()){
            //get key of every item (os.name)   value of every property (mac os x)
            System.out.println("Key: "+property.getKey()+" , Value: "+property.getValue());
        }

//in that file (config, prop.) we will have information regarding:
        //browser (chrome, ie, firefox)
        //environment (dev, qa, preprod, prod.)
        //urls
        //db urls()
        //credentials (admin/admin)
        //selenium grid config: vm info/ path to config file



    }
}
