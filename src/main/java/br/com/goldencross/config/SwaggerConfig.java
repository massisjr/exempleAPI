package br.com.goldencross.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@Controller
public class SwaggerConfig {
	
	@Bean
	public Docket recepcaoArquivoApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("br.com.goldencross.controller"))
				.build()
				.apiInfo(apiInfo());
				
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("exemplo API")
				.description("API REST do backend exemplo")
				.contact(new springfox.documentation.service.Contact("DESIS", "", "suporte_web@goldencross.com.br"))
				.license("")
				.build();
	}
	
	@RequestMapping(value = "/")
    public String index() {
        System.out.println("swagger-ui.html");
        return "redirect:swagger-ui.html";
    }

	
}
