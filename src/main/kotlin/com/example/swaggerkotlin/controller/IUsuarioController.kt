package com.example.swaggerkotlin.controller

import com.example.swaggerkotlin.dto.Usuario
import io.swagger.annotations.ApiOperation
import io.swagger.annotations.ApiResponse
import io.swagger.annotations.ApiResponses

interface IUsuarioController {

    //@ApiOperation(value = "Obtém todos os usuários")
    fun listar(): List<Usuario>

    @ApiOperation(value = "Realiza inclusão de um usuário")
    @ApiResponses(value = [
        ApiResponse(
            code = 201,
            message = "Registro incluído com sucesso."
        ),
        ApiResponse(
            code = 422,
            message = "Erro de regra de negócio."
        )])
    fun incluir(usuario: Usuario): Usuario

    @ApiOperation(value = "Realiza exclusão de um usuário.")
    fun excluir(idUsuario: Long)
}