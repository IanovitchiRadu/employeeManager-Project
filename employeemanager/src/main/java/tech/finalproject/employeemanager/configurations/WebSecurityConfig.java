//package tech.finalproject.employeemanager.configurations;
////
////import org.springframework.beans.factory.annotation.Autowired;
////import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
////import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//import javax.sql.DataSource;
////import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
////import org.springframework.security.crypto.password.PasswordEncoder;
////
////import javax.sql.DataSource;
////
////
////// Configurarile la clasa erau facute cu dependinte de thymeleaf
////
////
//
//@EnableWebSecurity
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Autowired
//    UserDetailsService userDetailsService;
//    private DataSource dataSource;
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(userDetailsService());
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .antMatchers("/admin").hasRole("ADMIN")
//                .antMatchers("/user").hasAnyRole("ADMIN", "USER")
//                .antMatchers("/").permitAll()
//                .and().formLogin();
//    }
//
////        @Autowired
////    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception{
////        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
////        auth
////                .jdbcAuthentication()
////                .dataSource(this.dataSource) // nu e necesar "this"
////                .passwordEncoder(passwordEncoder);
////        System.out.println(passwordEncoder.encode("12345"));
////    }
//
//    @Bean
//    public PasswordEncoder getPasswordEncoder() { return NoOpPasswordEncoder.getInstance();
//    }
//
//
//}
////
////    @Autowired
////    private DataSource dataSource; // creeaza conexiunea cu baza de date.
////
////    @Override
////    protected void configure(HttpSecurity http) throws Exception {
////        http.csrf().disable();
////        http
////                .authorizeRequests()
////                .antMatchers("/", "/css/**", "/js/**", "/login-form", "/login")
////                .permitAll();
////        http
////                .authorizeRequests()
////                .anyRequest()
////                .authenticated();
////
//////        http.httpBasic(); comanda aceasta forteaza browser'ul sa afiseze un pop-up pentru user si parola
////
////        http
////                .formLogin() // indica springului ca avem propriul form de login
////                .loginPage("/")
////                .usernameParameter("userName")
////                .passwordParameter("password")
////                .loginProcessingUrl("/login") // URL-ul care apare la un form in action
////                .defaultSuccessUrl("/")
////                .failureUrl("/");
////        http
////                .logout()
////                .logoutUrl("/logout")
////                .logoutSuccessUrl("/");
////    }
////
////
////    // autentificare in memorie, la pornirea aplicatiei setez in memorie user'ii si parolele
////    // la restart de aplicatie se vor reseta
////
//////    @Autowired
//////    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception{
//////        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//////        auth.inMemoryAuthentication()
//////                .withUser("Alex").password(passwordEncoder.encode("12345"))
//////                .roles("USER")
//////                .and()
//////                .passwordEncoder(passwordEncoder);
//////    }
////
////
////    // autentificare cu baza de date
////    @Autowired
////    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception{
////        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
////        auth
////                .jdbcAuthentication()
////                .dataSource(this.dataSource) // nu e necesar "this"
////                .passwordEncoder(passwordEncoder);
////        System.out.println(passwordEncoder.encode("12345"));
////    }
////
//
