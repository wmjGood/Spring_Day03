package mybatis_spring.service;

import mybatis_spring.dao.UserMapper;
import mybatis_spring.pojo.SmbmsProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Transactional
@Service("userService")
public class UserServiceImpl implements UserService  {
    @Autowired
    //或者 @Resource
    private UserMapper userMapper=null;
    @Override
    public List<SmbmsProvider> findAll() {
        try {
            return userMapper.finaAll();
        }catch (Exception ex){
            ex.printStackTrace();
            throw  ex;
        }

    }

    @Override
    public List<SmbmsProvider> findProviderByName(String proName) {
        try {
            return userMapper.findProviderByName(proName);
        }catch (Exception ex){
            ex.printStackTrace();
            throw  ex;
        }
    }

    @Override
     @Transactional(propagation = Propagation.REQUIRED)
    public boolean addProvider(SmbmsProvider provider) {
        boolean flag=false;
        try {
            if (userMapper.add(provider)==1){
                flag=true;
            }
        }catch (Exception ex){
            ex.printStackTrace();
            throw  ex;
        }
        return flag;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean delete(int id) {
        boolean flag=false;
        try {
            if (userMapper.delete(id)==1){
                flag=true;
            }
        }catch (Exception ex){
            ex.printStackTrace();
            throw  ex;
        }
        return flag;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean update(SmbmsProvider provider) {
        boolean flag=false;
        try {
            if (userMapper.update(provider)==1){
                flag=true;
            }
        }catch (Exception ex){
            ex.printStackTrace();
            throw  ex;
        }
        return flag;
    }


    public UserMapper getUserMapper() {
        return userMapper;
    }

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
}
