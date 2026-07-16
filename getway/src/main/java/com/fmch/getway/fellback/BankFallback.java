package com.fmch.getway.fellback;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Fallback controller
 * BankFellback
 * 
 * @author Fernando Cabrera
 */

@RestController
public class BankFallback {

    /**
     * Fallback method
     * @return a String
     */
    @GetMapping("${fallbacks.account}")
    public ResponseEntity<String> fallback() {
        return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE)
                .body("El servicio de Pet Store no está disponible en este momento. Intenta más tarde.");
    }

}
