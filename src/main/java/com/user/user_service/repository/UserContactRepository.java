package com.user.user_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.user_service.entity.UserContact;

public interface UserContactRepository extends JpaRepository<UserContact, Integer>{

}
