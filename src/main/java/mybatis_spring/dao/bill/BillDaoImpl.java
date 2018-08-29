package mybatis_spring.dao.bill;

import mybatis_spring.pojo.SmbmsBill;
import org.mybatis.spring.SqlSessionTemplate;

public class BillDaoImpl implements  BillDao {
    private SqlSessionTemplate SqlSession;

    @Override
    public int deleteBill(Integer id) {
        return SqlSession.delete("mybatis_spring.dao.bill.BillDao.deleteBill",id);
    }
    public SqlSessionTemplate getSqlSession() {
        return SqlSession;
    }

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        SqlSession = sqlSession;
    }




    @Override
    public int addBill(SmbmsBill bill) {
        return 0;
    }

    @Override
    public int updateBill(SmbmsBill bill) {
        return 0;
    }




}
