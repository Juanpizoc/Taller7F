package com.example.demo.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Service;

import com.example.demo.model.TallerCuatro;
import com.example.demo.repository.TallerCuatroRepository;

@Service
public class TallerCuatroService {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private TallerCuatroRepository repository;

    public boolean validarContrasena(String usuario, String contrasena) {
        SimpleJdbcCall jdbcCall = new SimpleJdbcCall(dataSource)
                .withFunctionName("VALIDAR_CONTRASENA");

        Map<String, Object> params = new HashMap<>();
        params.put("p_usuario", usuario);
        params.put("p_contrasena", contrasena);

        Number resultado = jdbcCall.executeFunction(Number.class, params);
        return resultado.intValue() == 1;  
    }


    public List<TallerCuatro> obtener_usuarios_func() {
        return repository.obtener_usuarios_func(); 
    }
}
