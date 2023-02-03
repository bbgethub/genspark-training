package com.inTimeTec.reimbursementApplication.Controller;

import com.inTimeTec.reimbursementApplication.Dao.ReimbursementDao;
import com.inTimeTec.reimbursementApplication.Entity.Reimbursement;
import com.inTimeTec.reimbursementApplication.Service.Authentication;
import com.inTimeTec.reimbursementApplication.Service.EmployeeService;
import com.inTimeTec.reimbursementApplication.Service.ReimbursementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reim")
public class ReimbursementController {
    @Autowired
    private Authentication authentication;

    @Autowired
    private EmailController emailController;

    @Autowired
    private ReimbursementService reimbursementService;

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private ReimbursementDao reimbursementDao;

    @GetMapping("/reim")
    public List<Reimbursement> getReimbursements()
    {
        return this.reimbursementService.getReimbursements();
    }

    @GetMapping("/reim/{reimID}")
    public Reimbursement findReimById(@PathVariable String reimID)
    {
        return this.reimbursementService.getReimbursement(Integer.parseInt(reimID));
    }

    @GetMapping("/reim/empid/{empID}")
    public List<Reimbursement> findReimByEmpId(@PathVariable String empID)
    {
        return this.reimbursementService.getReimbursementByEmpID(Integer.parseInt(empID));
    }

    @PostMapping("/reim")
    public Reimbursement addreim(@RequestBody Reimbursement reimbursement)
    {
        return this.reimbursementService.addReimbursement(reimbursement);
    }

    @PutMapping("/reim")
    public Reimbursement updateReim(@RequestBody Reimbursement reimbursement)
    {
        return this.reimbursementService.updateReimbursement(reimbursement);
    }

    @DeleteMapping("/reim/{reimID}")
    public String deleteReim(@PathVariable String reimID)
    {
        return this.reimbursementService.deleteReimbursement(Integer.parseInt(reimID));
    }

    @PutMapping("/reim/{status}/{reimID}")
    public String UpdateStatus(@PathVariable String reimID, @PathVariable String status)
    {
        //return "String";

        this.reimbursementDao.updateReimById(Integer.parseInt(reimID), status);
        return "Reimbursement is " + status + " and " + this.emailController.sendMailByReimId(Integer.parseInt(reimID));
        //return "Successfully";
    }

    @GetMapping("/reim/status/{status}")
    public List<Reimbursement> reimByStatus(@PathVariable String status)
    {
        return this.reimbursementService.getreimByStatus(status);
    }

    @GetMapping("/empname/{eName}")
    public List<Reimbursement> getReimbursementByEName(@PathVariable String eName)
    {
        String empID = this.employeeService.getEmpIdByName(eName);
        return this.findReimByEmpId(empID);
    }

    @GetMapping("/{email}/{pass}")
    public String getAuthenticate(@PathVariable String email, @PathVariable String pass)
    {
        if(this.authentication.checkCredentials(email, pass) == 1)
            return "hello";
        else
            return "hi";
    }
//    @GetMapping("/projectID/{projectID}")
//    public List<Reimbursement> getReimbursementByprojectID(@PathVariable String projectID)
//    {
//        String empID =
//    }
}
