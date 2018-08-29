package mybatis_spring.dao.bill;

import mybatis_spring.pojo.SmbmsBill;

public interface BillDao {

    public int addBill(SmbmsBill bill);

    int updateBill(SmbmsBill bill);

    int deleteBill(Integer id);

}
