package com.example.roles_service.service;

import com.example.roles_service.model.Roles;
import com.example.roles_service.repository.RolesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolesService {

    @Autowired
    private RolesRepo rolesRepo;

    public Roles saveRoles(Roles roles) {
        return rolesRepo.save(roles);
    }

    public Roles findRolesById(String role_Id) {
        return rolesRepo.findById(role_Id).orElse(null);
    }

    public void deleteRolesById(String role_Id) {
        rolesRepo.deleteById(role_Id);
    }

    public List<Roles> getAllRoles() {
        return rolesRepo.findAll();
    }
}
