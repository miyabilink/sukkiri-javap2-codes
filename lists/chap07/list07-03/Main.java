import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("ご利用のJavaのバージョン:");
        System.out.println(System.getProperty("Java.version"));
        Properties p = System.getProperties();
        Iterator<String> i = p.stringPropertyNames().iterator();
        System.out.println("【システムプロパティ一覧】");
        while(i.hasNext()) {
            String key = i.next();
            System.out.print(key + " = ");
            System.out.println(System.getProperty(key));
        }
    }
}