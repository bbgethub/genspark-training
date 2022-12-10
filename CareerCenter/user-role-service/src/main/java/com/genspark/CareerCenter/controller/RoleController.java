package com.genspark.CareerCenter.controller;

import com.genspark.CareerCenter.controller.entity.Role;
import com.genspark.CareerCenter.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class RoleController {
        @Autowired
        RoleService roleService;
        
        
        @RequestMapping(value="/role", method=RequestMethod.POST)
        public Role createUser(@RequestBody Role role) {
            return roleService.createRole(role);
        }
        
        @RequestMapping(value="/roles", method=RequestMethod.GET)
        public List<Role> readRoles() {
            return roleService.getRole();
        }

        @RequestMapping(value="/roles/{roleId}", method=RequestMethod.PUT)
        public Role readRoles(@PathVariable(value = "roleId") Long id, @RequestBody Role roleDetails) {
            return roleService.updateRole(id, roleDetails);
        }

        @RequestMapping(value="/roles/{roleId}", method=RequestMethod.DELETE)
        public void deleteRoles(@PathVariable(value = "roleId") Long id) {
            roleService.deleteRole(id);
        }

}