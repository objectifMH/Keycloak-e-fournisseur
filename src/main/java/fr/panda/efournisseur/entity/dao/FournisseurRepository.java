/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.panda.efournisseur.entity.dao;

import fr.panda.efournisseur.entity.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author gtu
 */
public interface FournisseurRepository extends JpaRepository<Fournisseur, Long>{
    
}
