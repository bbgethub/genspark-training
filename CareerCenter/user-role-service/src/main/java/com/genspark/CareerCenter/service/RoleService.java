package com.genspark.CareerCenter.service;

import com.genspark.CareerCenter.controller.entity.Role;
import com.genspark.CareerCenter.repository.RoleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Slf4j
@Service
	public class RoleService {

	        @Autowired
            RoleRepository roleRepository;
	        
	     // CREATE 
	        public Role createRole(Role role) {
				log.info("Inside createRole of RoleService");
				return roleRepository.save(role);
	        }

	        // READ
	        public List<Role> getRole() {
				log.info("Inside getRole of RoleService");
				return roleRepository.findAll();
	        }

	        // DELETE
	        public void deleteRole(Long roleId) {
				log.info("Inside deleteRole of RoleService");
				roleRepository.deleteById(roleId);
	        }
	        
	     // UPDATE
	        public Role updateRole(Long roleId, Role roleDetails) {
				log.info("Inside updateRole of RoleService");
				Role role = roleRepository.findById(roleId).get();
				role.setRoleName(roleDetails.getRoleName());
	                return roleRepository.save(role);
	        }
	}

