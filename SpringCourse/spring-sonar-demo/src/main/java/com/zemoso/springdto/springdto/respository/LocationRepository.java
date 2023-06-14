package com.zemoso.springdto.springdto.respository;


import com.zemoso.springdto.springdto.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {
}