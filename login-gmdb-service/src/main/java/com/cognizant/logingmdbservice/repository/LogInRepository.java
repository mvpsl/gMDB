package com.cognizant.logingmdbservice.repository;

import com.cognizant.logingmdbservice.domain.Credential;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LogInRepository extends JpaRepository<Credential, String> {
}
