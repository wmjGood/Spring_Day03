package mybatis_spring;

import mybatis_spring.pojo.SmbmsProvider;
import mybatis_spring.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MybatisTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Context.xml");
        UserService userService = (UserService) context.getBean("userService");
     /*  SmbmsProvider provider=new SmbmsProvider();
       provider.setProDesc("12121");
       provider.setProCode("B78945");
       provider.setProName("北京市吴梦洁21211");
       provider.setProContact("文具");
        boolean falg = userService.addProvider(provider);*/
        //boolean falg = userService.delete(15);
        SmbmsProvider provider=new SmbmsProvider();
        provider.setProDesc("12121");
provider.setProName("1111");
provider.setId(14);
        boolean falg=userService.update(provider);
        System.out.println(falg);

    }
}
