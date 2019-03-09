package com.fangzhongfeng;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @SpringBootApplication指定这是一个 spring boot的应用程序.
 */
@SpringBootApplication
public class App extends SpringBootServletInitializer {
	
    public static void main( String[] args )
    {
    	// SpringApplication 用于从main方法启动Spring应用的类。
        SpringApplication.run(App.class, args);
    }



    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(App.class);
    }
}
