package task.service;

import task.factory.Factory;

public class TelegramSenderService implements Factory {
    @Override
    public void send(String message) {
        System.out.println("Sizin mesajiniz telegrama gonderilmisdir: "+ message);
    }
}
