package service;

import Implementation.Mentor;

public class FullTimeMentor implements Mentor {
    @Override
    public void createAccount() {
        System.out.println("Full Time Mentor account is created..");
    }
}
