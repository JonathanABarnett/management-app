package com.alaythiaproduction.managementapp.repositories;

import com.alaythiaproduction.managementapp.models.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
}
