package controller;

import model.Mail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.IMailService;

import java.util.ArrayList;

@Controller
@RequestMapping("/home")
public class MailController {

    @Autowired
    private IMailService mailService;

    @GetMapping
    public ModelAndView createNew(){
        ModelAndView modelAndView = new ModelAndView("index");
        Mail mail = new Mail();
        modelAndView.addObject("mail",mail);
        return modelAndView;
    }

    @PostMapping("storage")
    public ModelAndView storage(@ModelAttribute Mail mail){
        ModelAndView modelAndView = new ModelAndView("storage");
        mailService.save(mail);
        ArrayList<Mail> mails = mailService.getAll();
        modelAndView.addObject("mails", mails);
        return modelAndView;
    }
}
