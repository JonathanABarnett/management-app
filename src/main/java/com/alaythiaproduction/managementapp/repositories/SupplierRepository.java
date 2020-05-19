package com.alaythiaproduction.managementapp.repositories;

import com.alaythiaproduction.managementapp.models.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}
