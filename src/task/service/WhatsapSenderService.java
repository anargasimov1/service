package task.service;

import task.factory.Factory;

public class WhatsapSenderService implements Factory {

    @Override
    public void send(String message) {
        System.out.println("Sizin mesajiniz whatsappa gonderilmisdir: "+ message);
    }

}
