package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    /*
            .properties uzantili dosyaya erişebilmek için Properties class'ından obje oluşturmamız gerekir.
         bu oluşturduğumuz obje ile akışa aldığımız dosya yolunu properties.load(fis) methodu ile properties
         dosyasındaki bilgileri objemize yükler ve properties dosyasındaki key değerini return ederiz.
         Bunu yapmak için parametreli bir method oluşturur girdiğimiz key'in değerini bize döndürür
         */
    static Properties properties;  // object olusturduk
    static {
        try {
            FileInputStream fis = new FileInputStream("configuration.properties");
            properties = new Properties();  // properties classindan bir obje olusturduk ,datalari almak icin
            properties.load(fis);//-->fis'in okuduğu bilgileri properties'e yükler
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static String getProperty(String key) {

        return properties.getProperty(key);//-->String olarak girdiğim key'in değerini return eder
        /*
        Burada try-catch kullanmamizin sebebi
         once dosya yolunu bulmaya calisacak ,bulamazsa
        Exception firlatacak.
        Burada her seferinde try-catch calisacagindan statik blok icine koyalim , class seviyesinde
        Bu cok kullanilan bir yontem , dolayisiyla method daha sade bir gorunum aliyor
         */
        /*
        Biz burada configReader.properties uzantili dosyalari ,
        ConfigReader classiyla okur ,
        girmis oldugumuz key 'in degerinide return etmis oluruz.
         */
    }

}
