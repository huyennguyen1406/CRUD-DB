package service;

import model.Mail;

import java.util.ArrayList;

public class MailService implements IMailService {
    private ArrayList<Mail> mails = new ArrayList<>();

    @Override
    public ArrayList<Mail> getAll() {
        return mails;
    }

    @Override
    public void save(Mail mail) {
        mails.add(mail);
    }
}
