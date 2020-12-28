package com.utkarsh.SMTP.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class SendEmailService {


    @Autowired
    public JavaMailSender javaMailSender;

    public void sendEmail(String to, String body, String topic){

        System.out.println("#################################### Sending email ##################################");
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom("from@gmail.com");
        simpleMailMessage.setTo(to);
        simpleMailMessage.setSubject(topic);
        simpleMailMessage.setText(body);
        javaMailSender.send(simpleMailMessage);
        System.out.println("#################################### SENT ###########################################");

    }
}
