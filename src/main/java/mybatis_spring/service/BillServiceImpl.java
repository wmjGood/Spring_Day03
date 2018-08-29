package mybatis_spring.service;

import mybatis_spring.dao.bill.BillDao;
import mybatis_spring.pojo.SmbmsBill;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


@Service("billService")
public class BillServiceImpl implements BillService  {



    @Autowired
   private BillDao billDao=null;


    @Override
    public int deleteBill(Integer id) {
        return billDao.deleteBill(id);
    }


    public BillDao getBillDao() {
        return billDao;
    }

    public void setBillDao(BillDao billDao) {
        this.billDao = billDao;
    }



    @Override
    public int addBill(SmbmsBill bill) {
        return billDao.addBill(bill);
    }

    @Override
    public int updateBill(SmbmsBill bill) {
        return billDao.updateBill(bill);
    }










}
