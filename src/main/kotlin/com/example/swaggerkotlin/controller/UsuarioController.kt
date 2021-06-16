package com.example.swaggerkotlin.controller

import com.example.swaggerkotlin.dto.Usuario
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*
import java.time.LocalDate

@RestController
@RequestMapping("/usuario")
class UsuarioController: IUsuarioController {

    @GetMapping(produces = [MediaType.APPLICATION_JSON_VALUE])
    override fun listar(): List<Usuario> {
        return listOf(Usuario(1, "Usuário Teste", 51992987313, LocalDate.now()))
    }

    @PostMapping(
        consumes = [MediaType.APPLICATION_JSON_VALUE],
        produces = [MediaType.APPLICATION_JSON_VALUE])
    override fun incluir(@RequestBody usuario: Usuario): Usuario {
        return usuario
    }

    @DeleteMapping("/{idUsuario}")
    override fun excluir(
        @PathVariable idUsuario: Long) {
    }
}