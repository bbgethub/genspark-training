package com.genspark.CareerCenter.controller;

import com.genspark.CareerCenter.controller.entity.Role;
import com.genspark.CareerCenter.service.RoleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/role/api")
@Slf4j
public class RoleController {
        @Autowired
        RoleService roleService;
        
        
        @RequestMapping(value="/role", method=RequestMethod.POST)
        public Role createRole(@RequestBody Role role) {
            log.info("Inside createRole in RoleController");

            return roleService.createRole(role);
        }
        
        @RequestMapping(value="/roles", method=RequestMethod.GET)
        public List<Role> readRoles() {
            log.info("Inside readRoles to read all in RoleController");
            return roleService.getRole();
        }

        @RequestMapping(value="/roles/{roleId}", method=RequestMethod.PUT)
        public Role readRoles(@PathVariable(value = "roleId") Long id, @RequestBody Role roleDetails) {
            log.info("Inside readRoles to read only roleId record in RoleController");
            return roleService.updateRole(id, roleDetails);
        }

        @RequestMapping(value="/roles/{roleId}", method=RequestMethod.DELETE)
        public void deleteRoles(@PathVariable(value = "roleId") Long id) {
            log.info("Inside deleteRoles in RoleController");
            roleService.deleteRole(id);
        }

}