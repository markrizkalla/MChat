package com.MChat.MChat.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AppRepository extends JpaRepository<AppUser, Long> {

    Optional<AppUser> findByUsername(String username);
}