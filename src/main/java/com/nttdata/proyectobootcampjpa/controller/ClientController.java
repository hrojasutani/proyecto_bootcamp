package com.nttdata.proyectobootcampjpa.controller;


import com.nttdata.proyectobootcampjpa.model.jpa.Client;
import com.nttdata.proyectobootcampjpa.model.request.ClientRequest;
import com.nttdata.proyectobootcampjpa.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;


@RestController
@RequestMapping("/client")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,
		RequestMethod.DELETE })
public class ClientController {

	@Autowired
	private ClientService clientService;

	@PostMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Mono<Client> save(@RequestBody ClientRequest body) {
		return Mono.just(clientService.save(body));
	}

    @GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
	public Flux<List<Client>> findAll() {
		return Flux.just(clientService.list());
	}

	@PutMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Mono<Client> update(@RequestBody ClientRequest body) {
		return Mono.just(clientService.update(body));
	}
	@DeleteMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public Mono<Boolean> delete(@PathVariable("id") int id) {
		return Mono.just(clientService.delete(id));
	}


}
