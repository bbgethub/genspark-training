package com.inTimeTec.reimbursementApplication.Service;

import com.inTimeTec.reimbursementApplication.Dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Authentication {
    @Autowired
    public EmployeeDao employeeDao;

    public int checkCredentials(String email, String pass)
    {
        String s = this.employeeDao.getPassword(email);
        if(s.equals(pass))
        {
            return 1;
        }
        else
        {
            return 0;
        }

    }
}
