package com.example;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author Alejandro Duarte.
 */
public class UsuarioService {

    private final List<Usuario> usuarios;

    public UsuarioService() {
        usuarios = IntStream.range(1, 100)
                .mapToObj(i -> new Usuario("nombre" + i, "email" + i + "@a.b", "dir" + i, LocalDate.now()))
                .collect(Collectors.toList());
    }

    public List<Usuario> findAll() {
        return usuarios;
    }

}
