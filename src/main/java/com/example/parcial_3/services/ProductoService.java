package com.example.parcial_3.services;

import com.example.parcial_3.models.Producto;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.List;

/**
 * Servicio que maneja la lista de productos de manera reactiva.
 */
@Service
public class ProductoService {

    // Lista de productos.
    private List<Producto> productos = List.of(
        new Producto("1", "Laptop", 1200.0),
        new Producto("2", "Mouse", 25.0),
        new Producto("3", "Teclado", 45.0)
    );

    /**
     * Retorna un Flux<Producto> a partir de la lista de productos.
     * Esto permite manejar los datos de forma reactiva y no bloqueante.
     */
    public Flux<Producto> obtenerProductos() {
        // Flux.fromIterable() crea un flujo reactivo a partir de la lista.
        return Flux.fromIterable(productos);
    }
}
