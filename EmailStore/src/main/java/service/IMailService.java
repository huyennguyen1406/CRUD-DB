package service;

import model.Mail;

import java.util.ArrayList;

public interface IMailService {
    ArrayList<Mail> getAll();

    void save(Mail mail);
}
