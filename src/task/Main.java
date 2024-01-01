package task;

import task.constans.NotificationConstants;
import task.service.NoSenderService;
import task.service.TelegramSenderService;
import task.service.WhatsapSenderService;

import javax.management.Notification;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String key = scanner.nextLine();
        String message = scanner.nextLine();
        WhatsapSenderService whatsapSenderService = new WhatsapSenderService();
        TelegramSenderService telegramSenderService = new TelegramSenderService();
        NoSenderService noSenderService = new NoSenderService();
        switch (key){
            case "whatsapp"->{
                whatsapSenderService.send(message);
            }
            case "telegram"->{
                telegramSenderService.send(message);
            }
            default -> {
                noSenderService.send(message);
            }
        }
    }

}