package com.microservicos.estoquepreco.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitmqService {
@Autowired
private RabbitTemplate rabbbitmqTemplate;

public void enviaMesagem(String nomeFila, Object mensagem){
    this.rabbbitmqTemplate.convertAndSend(nomeFila, mensagem);
}
}
