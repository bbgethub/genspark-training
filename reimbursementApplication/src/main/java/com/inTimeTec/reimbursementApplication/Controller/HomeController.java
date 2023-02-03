package com.inTimeTec.reimbursementApplication.Controller;
import com.inTimeTec.reimbursementApplication.Entity.User;
import com.inTimeTec.reimbursementApplication.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class HomeController {

    @Autowired
    private UserService userService;

    @RequestMapping("/welcome")
    public String welcome() {
        String text = "<HTML><H1>Welcome to Reimbursement Application</H1></HTML>";
        return text;
    }

    @RequestMapping("/getusers")
    public List<User> getUser() {
        return this.userService.getUsers();
    }

}
