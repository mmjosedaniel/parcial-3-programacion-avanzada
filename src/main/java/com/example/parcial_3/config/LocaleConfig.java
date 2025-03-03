package com.example.parcial_3.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import java.util.Locale;

@Configuration // Indica que esta clase contiene configuraciones de Spring.
public class LocaleConfig implements WebMvcConfigurer { // Implementa WebMvcConfigurer para añadir interceptores
    /**
     * Se define el LocaleResolver que se encargará de gestionar la configuración del idioma.
     * En este caso, estoy usando SessionLocaleResolver para guardar el locale en la sesión del usuario.
     * El idioma predeterminado es inglés.
     */
    @Bean
    public LocaleResolver localeResolver() {
        SessionLocaleResolver resolver = new SessionLocaleResolver();
        resolver.setDefaultLocale(Locale.ENGLISH); // Idioma predeterminado.
        return resolver;
    }

    /**
     * Define un Bean que permite cambiar el locale mediante un parámetro de la URL.
     * En este caso, uso el parámetro "lang" (por ejemplo: ?lang=es o ?lang=en).
     */
    @Bean
    public LocaleChangeInterceptor localeChangeInterceptor() {
        LocaleChangeInterceptor interceptor = new LocaleChangeInterceptor();
        interceptor.setParamName("lang"); // El nombre del parámetro en la URL para cambiar el idioma.
        return interceptor;
    }

    /**
     * Se registra el Bean de cambio de locale para que se aplique a las peticiones.
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(localeChangeInterceptor());
    }
}
