package com.amos.firstappspring.controller;

import com.amos.firstappspring.entity.Etudiant;
import com.amos.firstappspring.service.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EtudiantController {

    @Autowired
    private EtudiantService etudiantService;

    @GetMapping("/etudiant")
    public List<Etudiant> getAllEtudiant() {
        return etudiantService.getAllEtudiant();
    }

    @GetMapping("/etudiant/{id}")
    public Optional<Etudiant> getEtudiantById(@PathVariable String id) {
        return etudiantService.getEtudiant(id);
    }

    @PostMapping("etudiant")
    public void addEtudiant(@RequestBody Etudiant etudiant) {
        etudiantService.addEtudiant(etudiant);
    }

    @PutMapping("/etudiant/{id}")
    public void updateEtudiant(@RequestBody Etudiant etudiant, @PathVariable String id) {
        etudiantService.updateEtudiant(etudiant, id);
    }

    @DeleteMapping("/etudiant/{id}")
    public void deleteEtudiant(@PathVariable String id) {
        etudiantService.deleteEtudiant(id);
    }
}
