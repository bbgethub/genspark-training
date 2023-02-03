package com.inTimeTec.reimbursementApplication.Service;

import com.inTimeTec.reimbursementApplication.Dao.UserDao;
import com.inTimeTec.reimbursementApplication.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;
    @Override
    public List<User> getUsers() {
        return this.userDao.findAll();
    }
}
