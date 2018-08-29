package mybatis_spring.dao;

import mybatis_spring.pojo.SmbmsProvider;

import java.util.List;

public interface UserMapper {
    public List<SmbmsProvider> finaAll();

    public  List<SmbmsProvider> findProviderByName(String proName);

    public  int add(SmbmsProvider provider);

    int delete(int id);

    int update(SmbmsProvider provider);
}
