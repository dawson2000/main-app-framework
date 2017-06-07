package com.citi.otc.instruction.config;

import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;

/**
 * Created by Dawson on 2017/6/3.
 */
public class MonetMessageConfiguration {

    @Value("${amqp.port:5672}")
    private int port = 5672;

    @Value("${amqp.monet.otc.inbound.queue")
    private String  monetInboundQueue;

    @Bean
    public ConnectionFactory connectionFactory() {
        //TODO make it possible to customize in subclasses.
        CachingConnectionFactory connectionFactory = new CachingConnectionFactory("localhost");
        connectionFactory.setUsername("guest");
        connectionFactory.setPassword("guest");
        connectionFactory.setPort(port);
        return connectionFactory;
    }

    @Bean
    public AmqpAdmin rabbitAdmin() {
        return new RabbitAdmin(connectionFactory());
    }

    //@Bean
    public RabbitTemplate rabbitTemplate() {
        RabbitTemplate template = new RabbitTemplate(connectionFactory());
        template.setMessageConverter(jsonMessageConverter());
       // configureRabbitTemplate(template);
        return template;
    }

    @Bean
    public MessageConverter jsonMessageConverter() {
        return new JsonMessageConverter();
    }

    public void configureRabbitTemplate(RabbitTemplate rabbitTemplate) {
        rabbitTemplate.setRoutingKey(monetInboundQueue);
    }




}
