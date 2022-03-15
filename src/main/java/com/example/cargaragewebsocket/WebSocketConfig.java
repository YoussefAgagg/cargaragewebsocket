package com.example.cargaragewebsocket;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {
    private final static String ENDPOINT = "/garage";

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry webSocketHandlerRegistry) {
        webSocketHandlerRegistry.addHandler(getChatWebSocketHandler(), ENDPOINT)
                .setAllowedOrigins("*");
    }

    @Bean
    public WebSocketHandler getChatWebSocketHandler(){
        return new WebSocketHandler();
    }

}
