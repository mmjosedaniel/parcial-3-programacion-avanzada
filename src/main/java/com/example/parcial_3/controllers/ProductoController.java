package com.example.parcial_3.controllers;

import com.example.parcial_3.models.Producto;
import com.example.parcial_3.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

/**
 * Controlador que maneja la ruta "/api/productos" y devuelve
 * la lista de productos de forma reactiva.
 */
@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    /**
     * Retorna un elemento (Flux) con todos los productos.
     * Ejemplo de URL: http://localhost:8080/api/productos
     */
    @GetMapping
    public Flux<Producto> listarProductos() {
        return productoService.obtenerProductos();
    }
}
