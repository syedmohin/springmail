package com.security.student;

import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MailServices {

    private final JavaMailSender javaMailSender;

    public void sendNotification(Student student) {
        SimpleMailMessage mail = new SimpleMailMessage();
        mail.setFrom("deccanbesporty@gmail.com");
        mail.setTo(student.getMe());
        mail.setText(student.getMsg() + student.getMail() + student.getName());
        mail.setSubject("Mail from portfolio");
        javaMailSender.send(mail);
    }
}
