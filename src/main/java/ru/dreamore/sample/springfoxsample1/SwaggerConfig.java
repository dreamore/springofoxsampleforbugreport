package ru.dreamore.sample.springfoxsample1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket apiDocket() {

        return new Docket(DocumentationType.SWAGGER_2)
            .tags(
                new Tag("Public API", "Для обслуживания запросов фронтальных систем")
            )
            .select()
            .apis(RequestHandlerSelectors.basePackage("ru.dreamore.simple.springfoxsimple1"))
            .paths(PathSelectors.regex("/public/api/*.*"))
            .build()
            .apiInfo(apiInfo());
    }
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("Find out bug")
            .build();
    }
}
