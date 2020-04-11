package cn.t215;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan
public class App {
    public static void main(String[] args) {
        SpringApplicationBuilder  builder = new SpringApplicationBuilder(App.class) ;
        builder.bannerMode(Banner.Mode.OFF).run (args) ;
    }
}
