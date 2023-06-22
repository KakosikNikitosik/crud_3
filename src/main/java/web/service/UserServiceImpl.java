package web.service;

import org.springframework.stereotype.Service;
import web.dao.UserDao;
import web.model.User;

import javax.transaction.Transactional;
import java.util.List;
@Service
public class UserServiceImpl implements UserService{

    UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> listUsers() {
        return userDao.listUsers();

    }
    @Override
    @Transactional
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    public User show(Long id) {return userDao.show(id);}
    @Override
    @Transactional
    public void update(User updatedUser) {
        userDao.update(updatedUser);
    }
    @Override
    @Transactional
    public void delete (Long id) {
        userDao.delete(id);
    }
}
