package com.nttdata.proyectobootcampjpa.repository;

import com.nttdata.proyectobootcampjpa.model.jpa.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {
}
