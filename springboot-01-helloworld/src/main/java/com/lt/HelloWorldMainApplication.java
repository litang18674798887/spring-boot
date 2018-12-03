package com.lt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *  @SpringBootApplication 来标注一个主程序类，说明这是一个SpringBoot 应用
 *
 *  Spring Boot 应用标注在某个类上，说明这个类是SpringBoot的主配置类

 *  @SpringBootConfiguration
 *      标注在某各类上，表示这是一个Spring Boot 的配置类
 *          @Configuration 配置类上来标注这个注解；
 *              配置类 ---- 配置文件：配置类也是容器中的一个组件
 *  @EnableAutoConfiguration ：开启自动配置功能
 *      以前我们需要配置的东西，Spring Boot 帮我们自动配置 @EnableAutoConfiguration
 *      告诉Spring Boot 开启自动配置功能，这样自动配置才能生效
 *          @AutoConfigurationPackage ：自动配置包
 *              @Import({Registrar.class})
 *                  Spring 的底层注解 @Import ，给容器中导入一个组件；导入的组件由
 *                    AutoConfigurationPackage.Registrar.class
 *                  将主配置类（@SpringBootApplication标注的类）的所在包以及所有子包里面的所有组件扫描到Spring容器
 *          @Import({EnableAutoConfigurationImportSelector.class})
 *              EnableAutoConfigurationImportSelector ：导入那些组件的选择器
 *              将所有需要导入的组件以全类名的方式返回，这些组件就会被添加到容器中
 *              会给容器中导入非常多的自动配置类；就是给容器中导入这个场景需要的所有组件，并配置好这些组件
 *              有了自动配置类，免去了我们手动编写配置注入功能组件等工作
 *                   SpringFactoriesLoader.loadFactoryNames(EnableAutoConfiguration, ClassLoader);
 *   Spring Boot 在启动的时候，从类路径下的 META-INF/spring.factories获取 EnableAutoConfiguration 指定的值，
 *   将这些值作为自动配置类导入到容器中，自动配置类就生效，帮我们自动配置工作，以前我们需要自动配置的东西，自动配置类都帮我们；
 */
@SpringBootApplication
public class HelloWorldMainApplication {

    public static void main(String[] args) {

        // Spring 应用启动起来
        SpringApplication.run(HelloWorldMainApplication.class,args);
    }
}
