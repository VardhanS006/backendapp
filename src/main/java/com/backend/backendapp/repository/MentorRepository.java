package com.backend.backendapp.repository;

import com.backend.backendapp.model.Mentor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface MentorRepository extends JpaRepository<Mentor,Long>{

    Optional<Mentor> findByUserId(Long userId);
}