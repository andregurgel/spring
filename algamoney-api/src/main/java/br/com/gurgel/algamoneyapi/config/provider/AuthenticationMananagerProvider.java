package br.com.gurgel.algamoneyapi.config.provider;

/* Para o Spring Boot 2.X+ é necessário criar um AuthenticationManagerProvider, que buscarar no nosso WebSecurity
 * o bean necessário para que o AuthorizationServerConfig possa funcionar corretamente.
 *
 * Fontes na issue:
 * https://github.com/spring-projects/spring-boot/issues/11136 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class AuthenticationMananagerProvider extends WebSecurityConfigurerAdapter {

    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }
}
