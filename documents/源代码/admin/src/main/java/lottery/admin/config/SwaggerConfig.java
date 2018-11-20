package lottery.admin.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by liyinfei on 2017/9/24.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Value("${spring.swagger.enable}")
    private String enable;
    @Bean
    public Docket createRestApi() {
        String swaggerEnable=enable.isEmpty()? "false":enable;
        return new Docket(DocumentationType.SWAGGER_2)
                .enable(Boolean.valueOf(swaggerEnable))
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("lottery"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("彩票后台管理接口APIs")
                .description("为后台管理提供接口")
                .termsOfServiceUrl("http://blog.didispace.com/")
                .contact("管理者")
                .version("1.0")
                .build();
    }
}
