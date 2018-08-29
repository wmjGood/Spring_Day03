package mybatis_spring.service;

import mybatis_spring.pojo.SmbmsProvider;

import java.util.List;

public interface UserService {
    public List<SmbmsProvider> findAll();

    public  List<SmbmsProvider> findProviderByName(String proName);

    public  boolean addProvider(SmbmsProvider provider);

    boolean delete(int id);

    boolean   update(SmbmsProvider provider);
}
