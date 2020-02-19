package com.security.student;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "*",methods = {DELETE, GET, HEAD, OPTIONS, PATCH, POST, PUT},allowedHeaders = "*",allowCredentials ="true")
public class StudentController {

    private final MailServices mailServices;

    @GetMapping("mail")
    public String sendMail(@RequestBody Student student) {
        mailServices.sendNotification(student);
        return "Thanks you for details";
    }

    @RequestMapping("")
    public String getName(){
        return "Syed MOhiuddin";
    }
}
