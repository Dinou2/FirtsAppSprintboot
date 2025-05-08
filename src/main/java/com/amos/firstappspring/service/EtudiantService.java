package com.amos.firstappspring.service;

import com.amos.firstappspring.Repository.EtudiantRepository;
import com.amos.firstappspring.entity.Etudiant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EtudiantService {
    @Autowired
    private EtudiantRepository etudiantRepository;

    public List<Etudiant> getAllEtudiant() {
        List<Etudiant> etudiants = new ArrayList<>();
        etudiantRepository.findAll().forEach(etudiants::add);
        return etudiants;
    }

    public void addEtudiant(Etudiant etudiant) {
        etudiantRepository.save(etudiant);
    }

    public Optional<Etudiant> getEtudiant(String id) {
        return etudiantRepository.findById(id);
    }

    public void updateEtudiant(Etudiant etudiant, String id) {
        etudiantRepository.save(etudiant);
    }
    public void deleteEtudiant(String id) {
        etudiantRepository.deleteById(id);
    }
}
