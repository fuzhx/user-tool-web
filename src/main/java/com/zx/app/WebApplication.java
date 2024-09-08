package com.zx.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

/**
 * @author SH.YE
 */
@SpringBootApplication
public class WebApplication {



    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(WebApplication.class);
        ConfigurableApplicationContext cac = app.run(args);
        Environment env = cac.getEnvironment();

        String serverServletContextPath = env.getProperty("server.servlet.context-path");
        if (serverServletContextPath == null) {
            serverServletContextPath = "";
        }
        String serverPort = env.getProperty("server.port");

        if (serverPort != null && serverPort.length() > 0) {
            System.out.println("http://localhost:" + serverPort + serverServletContextPath + "/ctrl/tool/common/helloWorld");
        }

    }
}
