package com.amos.firstappspring.Repository;

import com.amos.firstappspring.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, String> {
}
