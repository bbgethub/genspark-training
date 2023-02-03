package com.inTimeTec.reimbursementApplication.Dao;

import com.inTimeTec.reimbursementApplication.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {
    //username , it will return the user of given username
    public User findByUsername(String username);
}
