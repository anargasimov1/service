package task.constans;

public enum NotificationConstants {

    WHATSAPP_SERVICE("whatsapp"),
    TELEGRAM_SERVICE("telegram"),
    NONE_SEVRRICE("none");
   private final String name;

    public String getName() {
        return name;
    }
     NotificationConstants(String name) {
        this.name = name;
    }
}
