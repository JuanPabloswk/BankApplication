package com.example.nequisito.repository;

import com.example.nequisito.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findUserByNombres(String nombres);

//    @Query("SELECT u FROM User u WHERE u.id=:hols")
//    Optional<User> findById(@Param("hols") Long id);
}

