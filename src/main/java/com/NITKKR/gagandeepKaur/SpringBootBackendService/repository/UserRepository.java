package com.NITKKR.gagandeepKaur.SpringBootBackendService.repository;


import com.NITKKR.gagandeepKaur.SpringBootBackendService.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Repository

public interface UserRepository extends JpaRepository<User,Long> {
}
