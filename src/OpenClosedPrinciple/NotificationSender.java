package OpenClosedPrinciple;

import java.util.ArrayList;
import java.util.List;

public class NotificationSender {
    public void sendNotification(List<Notification> notifications){
        for (Notification noti:notifications){
            noti.send();
        }
    }

    public static void main(String[] args) {


        NotificationSender notificationSender=new NotificationSender();
        List<Notification> arr=new ArrayList<>();


        notificationSender.sendNotification(arr);
    }
}
