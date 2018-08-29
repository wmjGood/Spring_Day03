package mybatis_spring.service;

import mybatis_spring.pojo.SmbmsBill;

public interface BillService {

    public int addBill( SmbmsBill bill);

    int updateBill(SmbmsBill bill);

    int deleteBill(Integer id);

}
