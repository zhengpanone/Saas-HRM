package com.zp.company.config;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * SwaggerConfig
 *
 * @author zhengpanone
 * @since 2022-04-06
 */
@Configuration
@EnableSwagger2
@ConditionalOnClass(Docket.class)
public class  SwaggerConfig {
    private static final String     VERSION="1.0";
    @Value("${springfox.swagger2.enabled}")
    private Boolean swaggerEnabled;

    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2).enable(swaggerEnabled).groupName("company").apiInfo(apiInfo())
                .select().apis(RequestHandlerSelectors.withClassAnnotation(Api.class)).paths(PathSelectors.any()).build();
    }

    /**
     * 添加摘要信息
     * @return 摘要信息
     */
    private ApiInfo apiInfo(){
        return new ApiInfoBuilder().title("公司接口文档").contact(new Contact("","",""))
                .description("公司接口文档").version(VERSION).build();
    }
}
