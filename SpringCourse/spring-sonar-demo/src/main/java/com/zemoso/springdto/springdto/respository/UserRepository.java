package com.zemoso.springdto.springdto.respository;

import com.zemoso.springdto.springdto.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}