package com.inTimeTec.reimbursementApplication.Service;


import com.inTimeTec.reimbursementApplication.Dao.ManagerDao;
import com.inTimeTec.reimbursementApplication.Entity.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MangerServiceImpl implements ManagerService{
    @Autowired
    private ManagerDao managerDao;

    @Override
    public List<Manager> getManagers() {
        return this.managerDao.findAll();
    }

    @Override
    public Manager getManager(int mgrID) {
        Optional<Manager> m = this.managerDao.findById(mgrID);
        Manager mgr = null;
        if(m.isPresent()){
            mgr = m.get();
        }
        else{
            throw new RuntimeException("Employee not found for given ID :: " + mgrID);
        }
        return mgr;
    }

    @Override
    public Manager addManager(Manager manager) {
        return this.managerDao.save(manager);
    }

    @Override
    public Manager updateManager(Manager manager) {
        return this.managerDao.save(manager);
    }

    @Override
    public String deleteManager(int mgrID) {
        this.managerDao.deleteById(mgrID);
        return "Employee deleted successfully";
    }
}
