package com.amos.firstappspring.Repository;

import com.amos.firstappspring.entity.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant, String> {
}
