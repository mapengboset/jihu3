package com.yqbing.servicebing.webapp.handle;

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



@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
			//	.host("jinrongt.jihustore.com")
				.select()
				//为当前包路径
				.apis(RequestHandlerSelectors.basePackage("com.yqbing.servicebing.webapp.controller"))
				.paths(PathSelectors.any())
				.build();
	}  

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
		
		
				//页面标题
				.title("yqbing api")
				//创建人
				.contact(new Contact("快下", "http://Yqbing.com/", ""))
				//版本号 
				.version("1.0")
				//描述hfsjll
				.description("快手app") 
				.build();
	}
}
