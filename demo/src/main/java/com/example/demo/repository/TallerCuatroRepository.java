package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.example.demo.model.TallerCuatro;

@Repository
public interface TallerCuatroRepository extends JpaRepository<TallerCuatro, Long> {

    @Procedure(name = "OBTENER_USUARIOS_FUNC")
    List<TallerCuatro> obtener_usuarios_func();
}

