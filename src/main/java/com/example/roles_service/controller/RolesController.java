package com.example.roles_service.controller;

import com.example.roles_service.model.Roles;
import com.example.roles_service.service.RolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/roles")
public class RolesController {

    @Autowired
    private RolesService rolesService;

    @GetMapping("/{id}")
    public Roles getRoleById(@PathVariable String id) {
        return rolesService.findRolesById(id);
    }

    @PostMapping
    public Roles createRole(@RequestBody Roles roles) {
        return rolesService.saveRoles(roles);
    }

    @DeleteMapping("/{id}")
    public String deleteRole(@PathVariable String id) {
        rolesService.deleteRolesById(id);
        return "Role deleted";
    }

    @GetMapping
    public List<String> getAllRoles() {
        return rolesService.getAllRoles()
                .stream()
                .map(Roles::getRoleName)
                .collect(Collectors.toList());
    }
}
