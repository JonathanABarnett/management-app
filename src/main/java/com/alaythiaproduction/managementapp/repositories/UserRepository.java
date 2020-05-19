package com.alaythiaproduction.managementapp.repositories;

import com.alaythiaproduction.managementapp.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
