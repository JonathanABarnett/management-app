package com.alaythiaproduction.managementapp.repositories;

import com.alaythiaproduction.managementapp.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
