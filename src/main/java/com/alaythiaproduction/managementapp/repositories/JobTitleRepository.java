package com.alaythiaproduction.managementapp.repositories;

import com.alaythiaproduction.managementapp.models.JobTitle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobTitleRepository extends JpaRepository<JobTitle, Long> {
}
