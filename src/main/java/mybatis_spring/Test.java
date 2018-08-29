package mybatis_spring;

import mybatis_spring.pojo.SmbmsProvider;
import mybatis_spring.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) context.getBean("userService");
       /* List<SmbmsProvider> list = userService.findAll();
        for (SmbmsProvider p : list ) {
            System.out.println(p.getId()+p.getProName()+p.getProCode());
        }*/
        List<SmbmsProvider> proList = userService.findProviderByName("北");
        for (SmbmsProvider p : proList ) {
            System.out.println(p.getId()+p.getProName()+p.getProCode());
        }

    }
}
