package com.nttdata.proyectobootcampjpa.controller;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

// import com.nttdata.datajpa.business.FilmService;
// import com.nttdata.datajpa.model.request.UpdateFilmRequest;
// import com.nttdata.datajpa.model.response.FilmPageResponse;
// import com.nttdata.datajpa.model.response.FilmResponse;
// import com.nttdata.datajpa.model.response.StatusResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;


@RestController
@RequestMapping("/client")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,
		RequestMethod.DELETE })


public class ClientController {
    
    
    @GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
	public Flux<BigDecimal> findAll() {
		return Flux.just(BigDecimal.ZERO, BigDecimal.ONE, BigDecimal.TEN);
	}

	// @Autowired
	// private FilmService filmService;

	// @GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
	// public Flux<FilmPageResponse> getPaginatedFilms(@RequestParam("page") @NotEmpty @Min(1) Integer page) {
	// 	return filmService.getFilms(page);
	// }

	// @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	// public Mono<FilmResponse> getFilm(@PathVariable("id") @NotEmpty @Min(1) Integer idFilm) {
	// 	return filmService.getFilmById(idFilm);
	// }

	// @PutMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	// public Mono<StatusResponse> updateFilm(@RequestBody UpdateFilmRequest body) {
	// 	return filmService.updateFilm(body);
	// }

	// @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	// public Mono<StatusResponse> deleteFilm(@PathVariable Integer id) {
	// 	return filmService.deleteFilm(id);
	// }

}
