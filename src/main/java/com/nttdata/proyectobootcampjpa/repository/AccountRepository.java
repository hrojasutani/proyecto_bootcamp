package com.nttdata.proyectobootcampjpa.repository;

import com.nttdata.proyectobootcampjpa.model.jpa.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
}
