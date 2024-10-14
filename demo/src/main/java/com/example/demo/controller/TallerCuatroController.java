package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.TallerCuatro;
import com.example.demo.services.TallerCuatroService;


@RestController
@RequestMapping("/taller-cuatro")
public class TallerCuatroController {

    @Autowired
    private TallerCuatroService service;

    @GetMapping("/validar")
    public ResponseEntity<Boolean> validarContrasena(
        @RequestParam String usuario, 
        @RequestParam String contrasena) {
        boolean esValida = service.validarContrasena(usuario, contrasena);
        return ResponseEntity.ok(esValida);
    }

    @GetMapping("/usuarios")
    public ResponseEntity<List<TallerCuatro>> obtenerUsuarios() {
        List<TallerCuatro> usuarios = service.obtener_usuarios_func();
        return ResponseEntity.ok(usuarios);
    }
}
