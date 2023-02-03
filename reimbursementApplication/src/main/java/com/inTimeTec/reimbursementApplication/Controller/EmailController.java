package com.inTimeTec.reimbursementApplication.Controller;

import com.inTimeTec.reimbursementApplication.Entity.Reimbursement;
import com.inTimeTec.reimbursementApplication.Service.EmailService;
import com.inTimeTec.reimbursementApplication.Service.EmployeeService;
import com.inTimeTec.reimbursementApplication.Service.ReimbursementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmailController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private ReimbursementService reimbursementService;

    @Autowired
    private EmailService emailService;

    @GetMapping("/sendMail/{empId}")
    public String sendEmail(@PathVariable int empId)
    {
        String email = this.employeeService.getEmailByEmpID(empId);
        String body = String.valueOf(this.reimbursementService.getReimbursementByEmpID(empId));
//        String body = "";
//        List<Reimbursement> re = this.reimbursementService.getReimbursementByEmpID(empId);
//        for (Reimbursement r: re)
//        {
//            body=body+re;
//        }
        emailService.sendMail(email, "Reimbursement Details",body);
        return "Mail Sent to " + email;
    }

    @GetMapping("/sendMailByReimId/{reimId}")
    public String sendMailByReimId(@PathVariable int reimId)
    {
        int empId = this.reimbursementService.getEmpIdByReim(reimId);
        String email = this.employeeService.getEmailByEmpID(empId);
        String body = String.valueOf(this.reimbursementService.getReimbursement(reimId));
        emailService.sendMail(email, "Reimbursement Details",body);
        return "Mail Sent to " + email;
    }
}