package com.example.swaggerkotlin.controller

import com.example.swaggerkotlin.model.Usuario
import io.swagger.annotations.ApiOperation
import io.swagger.annotations.ApiResponse
import io.swagger.annotations.ApiResponses
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*
import java.time.LocalDate

@RestController
@RequestMapping("/usuario")
class UsuarioController {

    //@ApiOperation(value = "Obtém todos os usuários")
    @GetMapping(produces = [MediaType.APPLICATION_JSON_VALUE])
    fun listar(): List<Usuario> {
        return listOf(Usuario(1, "Usuário Teste", 51992987313, LocalDate.now()))
    }

    @ApiOperation(value = "Realiza inclusão de um usuário")
    @PostMapping(
        consumes = [MediaType.APPLICATION_JSON_VALUE],
        produces = [MediaType.APPLICATION_JSON_VALUE])
    @ApiResponses(value = [
        ApiResponse(
            code = 201,
            message = "Registro incluído com sucesso."
        ),
        ApiResponse(
            code = 422,
            message = "Erro de regra de negócio."
        )])
    fun incluir(@RequestBody usuario: Usuario): Usuario {
        return usuario
    }

    @ApiOperation(value = "Realiza exclusão de um usuário.")
    @DeleteMapping("/{idUsuario}")
    fun excluir(
        @PathVariable idUsuario: Long) {
    }
}