package com.example.roles_service.repository;

import com.example.roles_service.model.Roles;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolesRepo extends MongoRepository<Roles, String> {
}
