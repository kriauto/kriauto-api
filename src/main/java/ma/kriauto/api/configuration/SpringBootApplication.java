package ma.kriauto.api.configuration;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootConfiguration
@EnableJpaAuditing
@EnableJpaRepositories("ma.kriauto.api.*")
@ComponentScan(basePackages = { "ma.kriauto.api.*" })
@EntityScan("ma.kriauto.api.*") 
public class SpringBootApplication {
	
	@Value("${tomcat.ajp.port}")
	int ajpPort;

	@Value("${tomcat.ajp.enabled}")
	boolean tomcatAjpEnabled;
	
	@Bean
	public ConfigurableServletWebServerFactory webServerFactory() {
	  TomcatServletWebServerFactory factory = new TomcatServletWebServerFactory();
	  if (tomcatAjpEnabled) {
	     //log.info("AJP Enabled on port {}", ajpPort);
	     factory.setProtocol("AJP/1.3");
         factory.addConnectorCustomizers(connector -> {
	     connector.setPort(ajpPort);
	   });
	  } // else create default http connector as per usual
	     return factory;
    }

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApplication.class, args);
	}

}
