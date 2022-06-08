package com.nttdata.proyectobootcampjpa.controller;

import com.nttdata.proyectobootcampjpa.model.jpa.Account;
import com.nttdata.proyectobootcampjpa.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

import java.math.BigDecimal;

@RestController
@RequestMapping("/account")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,
        RequestMethod.DELETE })
public class AccountController {

    @Autowired
    private ClientService cientService;

    @GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public Flux<Account> findAll() {
        return Flux.just();
    }
}
