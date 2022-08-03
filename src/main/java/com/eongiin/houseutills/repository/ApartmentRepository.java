package com.eongiin.houseutills.repository;

import com.eongiin.houseutills.entity.Apartment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApartmentRepository extends JpaRepository<Apartment, Long> {
}
