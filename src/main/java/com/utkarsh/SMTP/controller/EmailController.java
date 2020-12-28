package com.utkarsh.SMTP.controller;

import com.utkarsh.SMTP.service.SendEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @Autowired
    SendEmailService sendEmailService;


    @RequestMapping(value = "/sendemail")
    public void sendEmail() {
        sendEmailService.sendEmail("to@email.com","Hello testing", "SMTP");
    }
}
