package com.nttdata.proyectobootcampjpa.service;

import com.nttdata.proyectobootcampjpa.model.jpa.Account;
import com.nttdata.proyectobootcampjpa.model.request.AccountRequest;
import com.nttdata.proyectobootcampjpa.repository.AccountRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public Account save(AccountRequest request) {
        Account account = new Account();
        
        account.setNroCcta(request.getNroCcta());
        account.setAccountType(request.getAccountType());
        account.setStatus(request.isStatus());
        account.setAmount(request.getAmount());
        account.setCreateAt(request.getCreateAt());
        account.setClient(request.getClient());
        
        return accountRepository.save(account);
    }

    public List<Account> list() {
        return accountRepository.findAll();
    }

    public Account update(AccountRequest request){
        Account account = new Account();
        account.setId(request.getId());
        account.setNroCcta(request.getNroCcta());
        account.setAccountType(request.getAccountType());
        account.setStatus(request.isStatus());
        account.setAmount(request.getAmount());
        account.setCreateAt(request.getCreateAt());
        account.setClient(request.getClient());
        return accountRepository.save(account);
    }

    public boolean delete(int id){
        accountRepository.deleteById(id);
        return true;
    }

}
