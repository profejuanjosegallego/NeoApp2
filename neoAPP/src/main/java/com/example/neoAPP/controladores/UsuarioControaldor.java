package com.example.neoAPP.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.neoAPP.modelos.Usuario;
import com.example.neoAPP.servicios.UsuarioServicio;

@RestController
@RequestMapping("api/v1/usuarios")
public class UsuarioControaldor {

    @Autowired
    UsuarioServicio servicio;

    @PostMapping
    public ResponseEntity<?> controaldorGuardar(@RequestBody Usuario datos){
        return ResponseEntity.status(HttpStatus.OK).body(servicio.guardar_usuario(datos));
    }

    @GetMapping
    public ResponseEntity<?> controaldorListar(){
        return ResponseEntity.status(HttpStatus.OK).body(servicio.listar_usuarios());
    }

}
