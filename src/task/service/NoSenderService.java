package task.service;

import task.factory.Factory;

public class NoSenderService implements Factory {
    @Override
    public void send(String message) {
        System.out.println("Bele service movcud deyil: "+ message);
    }
}
