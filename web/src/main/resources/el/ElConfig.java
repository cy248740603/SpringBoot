package cy.el;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.Resource;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan("com.example.cy.demo.el")
@PropertySource("classpath:com/example/cy/demo/el/test.properties")
public class ElConfig{
    //注入普通字符
    @Value("I Love Bing!")
    private String normal;
    //操作系统属性
    @Value("#{systemProperties['os.name']}")
    private String osName;
    //其他bean属性
    @Value("#{demoService.another}")
    private String fromAnother;
    //表达式结果
    @Value("#{T(java.lang.Math).random()*100.0}")
    private double randomNumber;
    //文件资源
    @Value("classpath:com/example/cy/demo/el/text.txt")
    private Resource textFile;
    //网站资源
    @Value("http://www.baidu.com")
    private Resource testUrl;
    //配置文件 
    @Value("${book.name}")
    private String bookName;
    @Autowired
    private Environment environment;
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigure(){
        return new PropertySourcesPlaceholderConfigurer();
    }

    public void outputResource(){
        try{
            System.out.println(normal);
            System.out.println(osName);
            System.out.println(randomNumber);
            System.out.println(fromAnother);
            System.out.println(IOUtils.toString(textFile.getInputStream()));
            System.out.println(IOUtils.toString(testUrl.getInputStream()));
            System.out.println(bookName);
            System.out.println(environment.getProperty("book.author"));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}