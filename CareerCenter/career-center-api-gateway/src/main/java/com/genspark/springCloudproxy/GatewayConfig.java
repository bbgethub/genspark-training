package com.genspark.springCloudproxy;

import com.genspark.springCloudproxy.security.JwtAuthenticationFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Autowired
    private JwtAuthenticationFilter filter;

    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder) {
        return builder.routes().route("auth", r -> r.path("/auth/**").filters(f -> f.filter(filter)).uri("lb://auth"))
                .route("user", r -> r.path("/user/**").filters(f -> f.filter(filter)).uri("lb://user"))
                .route("role", r -> r.path("/role/**").filters(f -> f.filter(filter)).uri("lb://role"))
                .route("career", r -> r.path("/career/**").filters(f -> f.filter(filter)).uri("lb://career")).build();
    }

}