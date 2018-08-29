package mybatis_spring;

import mybatis_spring.dao.bill.BillDao;
import mybatis_spring.pojo.SmbmsBill;
import mybatis_spring.service.BillService;
import mybatis_spring.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BillTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("BillContext.xml");
        BillService billService=(BillService) context.getBean("billService");
     /*   SmbmsBill bill=new SmbmsBill();
        bill.setBillCode("B1234");
        bill.setProductName("王老吉");
        bill.setProductDesc("饮料");
        bill.setProductCount(20);
        bill.setProductUnit("听");
        bill.setTotalPrice(200);
          bill.setProviderId(13);
        int count = billService.addBill(bill);
        System.out.println(count);*/

  /*   SmbmsBill smbmsBill=new SmbmsBill();
     smbmsBill.setBillCode("C51234");
     smbmsBill.setProductUnit("罐");
     smbmsBill.setId(19);
        int count =billService.updateBill(smbmsBill);
        System.out.println(count);*/
        int count = billService.deleteBill(19);
        System.out.println(count);

    }
}
