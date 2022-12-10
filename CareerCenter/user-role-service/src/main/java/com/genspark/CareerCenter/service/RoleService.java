package com.genspark.CareerCenter.service;

import com.genspark.CareerCenter.controller.entity.Role;
import com.genspark.CareerCenter.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
	public class RoleService {

	        @Autowired
            RoleRepository roleRepository;
	        
	     // CREATE 
	        public Role createRole(Role role) {
	            return roleRepository.save(role);
	        }

	        // READ
	        public List<Role> getRole() {
	            return roleRepository.findAll();
	        }

	        // DELETE
	        public void deleteRole(Long roleId) {
	            roleRepository.deleteById(roleId);
	        }
	        
	     // UPDATE
	        public Role updateRole(Long roleId, Role roleDetails) {
				Role role = roleRepository.findById(roleId).get();
				role.setRoleName(roleDetails.getRoleName());
	                return roleRepository.save(role);
	        }
	}

