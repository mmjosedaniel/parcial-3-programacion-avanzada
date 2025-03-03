package com.example.parcial_3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
// Se elimina el import de abajo (RequestHeader) pués obtener saludo ya no lo utiliza.
// import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.Locale;

/**
 * Controlador Reactivo que maneja la ruta "/api/saludo".
 * Utiliza un MessageSource para obtener el mensaje traducido.
 */
@RestController
@RequestMapping("/api")
public class SaludoController {
	@Autowired
	private MessageSource messageSource;
	// Se elimina el locale como argumento pués ahora se optiene con LocaleContextHolder.getLocale()
	// public Mono<String> obtenerSaludo(@RequestHeader(name = "Accept-Language",required = false) Locale locale) {
	@GetMapping("/saludo")
	public Mono<String> obtenerSaludo() {
		Locale locale = LocaleContextHolder.getLocale();
		return Mono.just(messageSource.getMessage("saludo", null, locale));
	}
}
