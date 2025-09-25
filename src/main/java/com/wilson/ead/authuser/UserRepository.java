package com.wilson.ead.authuser;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wilson.ead.authuser.models.UserModel;

public interface UserRepository extends JpaRepository<UserModel, UUID>{

}
