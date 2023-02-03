package com.inTimeTec.reimbursementApplication.Controller;


import com.inTimeTec.reimbursementApplication.Entity.Manager;
import com.inTimeTec.reimbursementApplication.Service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/manager")
public class ManagerController {

    @Autowired
    private ManagerService managerService;

    @GetMapping("/")
    public String mgr()
    {
        return "<HTML><H1>Welcome to Manager Page</H1></HTML>";
    }

    @GetMapping("/manager")
    public List<Manager> getManagers()
    {
        return this.managerService.getManagers();
    }

    @GetMapping("/manager/{mgrID}")
    public Manager getEmployee(@PathVariable String mgrID)
    {
        return this.managerService.getManager(Integer.parseInt(mgrID));
    }

    @PostMapping("/manager")
    public Manager addManager(@RequestBody Manager manager)
    {
        return this.managerService.addManager(manager);
    }

    @PutMapping("/manager")
    public Manager uodateManager(@RequestBody Manager manager)
    {
        return this.managerService.updateManager(manager);
    }

    @DeleteMapping("/manager/{mgrID}")
    public String deleteManager(@PathVariable String mgrID)
    {
        return this.managerService.deleteManager(Integer.parseInt(mgrID));
    }

}
