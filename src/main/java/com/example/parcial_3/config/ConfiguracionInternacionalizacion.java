package com.example.parcial_3.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

// Fue necesario manejar los mensajes desde está clase pues en la configuración de Application.properties no
// funcionaba; esto aparentemente se debe a configuraciones de la versión de Eclipse en Ubutu que estoy usando
/**
 * Maneja la configuración para obtener los mensajes.
 */
@Configuration
public class ConfiguracionInternacionalizacion {
    @Bean
    public MessageSource messageSource() {
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        // Se buscarán archivos cuyo nombre base sea "messages"
        messageSource.setBasename("messages/messages");
        // Se usa UTF-8 para evitar problemas de codificación
        messageSource.setDefaultEncoding("UTF-8");
        return messageSource;
    }
}
