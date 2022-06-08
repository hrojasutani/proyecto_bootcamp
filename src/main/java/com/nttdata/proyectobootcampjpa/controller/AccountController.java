package com.nttdata.proyectobootcampjpa.controller;

import com.nttdata.proyectobootcampjpa.model.jpa.Account;
import com.nttdata.proyectobootcampjpa.model.request.AccountRequest;
import com.nttdata.proyectobootcampjpa.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/account")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,
        RequestMethod.DELETE })
public class AccountController {

    @Autowired
    private AccountService cientService;

    @PostMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Mono<Account> save(@RequestBody AccountRequest body) {
		return Mono.just(cientService.save(body));
	}

    @GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
	public Flux<List<Account>> findAll() {
		return Flux.just(cientService.list());
	}

	@PutMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Mono<Account> update(@RequestBody AccountRequest body) {
		return Mono.just(cientService.update(body));
	}
    
	@DeleteMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public Mono<Boolean> delete(@PathVariable("id") int id) {
		return Mono.just(cientService.delete(id));
	}

}
