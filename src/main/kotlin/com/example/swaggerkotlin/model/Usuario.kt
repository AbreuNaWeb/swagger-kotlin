package com.example.swaggerkotlin.model

import com.fasterxml.jackson.annotation.JsonFormat
import io.swagger.annotations.ApiModelProperty
import java.time.LocalDate

data class Usuario(
    @ApiModelProperty(example = "1")
    val id: Long,
    @ApiModelProperty(example = "João")
    val nome: String,
    @ApiModelProperty(example = "51992987313")
    val telefone: Long,
    @ApiModelProperty(dataType = "Date", example = "2021-01-01")
    @JsonFormat(pattern = "yyyy-MM-dd")
    val dataCriacao: LocalDate
)