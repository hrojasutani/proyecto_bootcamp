package com.nttdata.proyectobootcampjpa.service;

import com.nttdata.proyectobootcampjpa.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

}
