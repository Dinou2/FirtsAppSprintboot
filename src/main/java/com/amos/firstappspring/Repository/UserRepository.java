package com.amos.firstappspring.Repository;

import com.amos.firstappspring.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, String> {
    List<User> findByLocationId(String locationId);
}
