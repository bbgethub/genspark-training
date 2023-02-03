package com.inTimeTec.reimbursementApplication.Service;


import com.inTimeTec.reimbursementApplication.Entity.Employee;
import com.inTimeTec.reimbursementApplication.Entity.Manager;

import java.util.List;

public interface ManagerService {
    List<Manager> getManagers();
    Manager getManager(int mgrID);
    Manager addManager(Manager manager);
    Manager updateManager(Manager manager);
    String deleteManager(int mgrId);
}
