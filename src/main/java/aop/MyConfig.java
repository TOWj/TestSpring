package aop;


import org.apache.log4j.PropertyConfigurator;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("aop")
@PropertySource("classpath:myApp.properties")
@EnableAspectJAutoProxy
public class MyConfig {




}
