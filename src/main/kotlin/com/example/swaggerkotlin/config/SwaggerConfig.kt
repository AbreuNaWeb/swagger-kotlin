package com.example.swaggerkotlin.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import springfox.documentation.builders.ApiInfoBuilder
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.service.ApiInfo
import springfox.documentation.service.Contact
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2

@Configuration
@EnableSwagger2
class SwaggerConfig {

    @Bean
    fun api(): Docket {
        return Docket(DocumentationType.SWAGGER_2)
            .select()
            .apis(RequestHandlerSelectors.basePackage("com.example.swaggerkotlin"))
            //.apis(RequestHandlerSelectors.any())
            .build()
            //.useDefaultResponseMessages(false)
            .apiInfo(metaData())
            //enable(false)
    }

    private fun metaData(): ApiInfo {
        return ApiInfoBuilder()
            .title("REST API <nome da aplicação>")
            .description("API para <descrição>")
            .version("1.0.0")
            .contact(
                Contact("Nome do time", "https://www.google.com.br/", "nomeTime@dominio.com")
            )
            .build()
    }
}