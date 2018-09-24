package com.bytatech.ayoos.doctor.apigateway.repository;

import com.bytatech.ayoos.doctor.apigateway.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Authority entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
