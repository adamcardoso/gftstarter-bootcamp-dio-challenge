package com.challenge.userdeptarment.repositories;

import com.challenge.userdeptarment.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
