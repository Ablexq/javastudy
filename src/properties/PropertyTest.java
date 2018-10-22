package properties;

import java.io.*;
import java.util.Enumeration;
import java.util.Properties;

/*
* Java中Properties类的操作
*
* Java 读写Properties配置文件
* https://www.cnblogs.com/xudong-bupt/p/3758136.html
* */
public class PropertyTest {

    public static void main(String[] args) {

        String filePath1 = "src/properties/test1.properties";//注意路径要带src
        String filePath2 = "src/properties/test2.txt";//注意路径要带src

        try {
            writeProterty("phone", "10086", filePath1);

            readProperty(filePath1);
            System.out.println("---------");

            readProperty2(filePath1);
            System.out.println("=========");

            getValueByKey(filePath1, "name");
            System.out.println("---------");

            getValue(filePath2, "phone");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static void writeProterty(String key, String value, String filePath) throws IOException {
        Properties properties = new Properties();
        //保存属性到.properties文件
        FileOutputStream outputStream = new FileOutputStream(filePath, true);//true表示追加打开
        properties.setProperty(key, value);
        properties.store(outputStream, "\nThe New properties file");
        //将Properties类对象的属性列表保存到输出流中
        outputStream.close();
    }

    private static void readProperty(String filePath) throws IOException {
        Properties properties = new Properties();
        //读取属性文件.properties
        FileInputStream fileInputStream = new FileInputStream(filePath);
        InputStream inputStream = new BufferedInputStream(fileInputStream);
        properties.load(inputStream);
        //从.properties属性文件对应的文件输入流中，加载属性列表到Properties类对象。
        for (String key : properties.stringPropertyNames()) {
            System.out.println(key + ":" + properties.getProperty(key));
        }
        inputStream.close();
    }

    private static void readProperty2(String filePath) throws IOException {
        Properties properties = new Properties();
        //读取属性文件.properties
        properties.load(new FileInputStream(filePath));
        Enumeration enumeration = properties.propertyNames();//得到配置文件的名字
        while (enumeration.hasMoreElements()) {
            String strKey = (String) enumeration.nextElement();
            String strValue = properties.getProperty(strKey);
            System.out.println(strKey + "=" + strValue);
        }
    }

    //根据Key读取Value
    public static String getValueByKey(String filePath, String key) {
        Properties pps = new Properties();
        try {
            InputStream in = new BufferedInputStream(new FileInputStream(filePath));
            pps.load(in);
            String value = pps.getProperty(key);
            System.out.println(key + " = " + value);
            return value;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    //此方法接收一个key，在配置文件中获取相应的value
    public static String getValue(String filePath, String key) throws IOException {
        Properties pro = new Properties();//获取配置文件的对象
        FileReader in = new FileReader(filePath);//获取输入流
        pro.load(in);//将流加载到配置文件对象中
        in.close();
        System.out.println("key==" + key + " " + "value==" + pro.getProperty(key));
        return pro.getProperty(key);//返回根据key获取的value值
    }

}
