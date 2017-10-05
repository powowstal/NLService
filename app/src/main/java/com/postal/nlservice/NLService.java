package com.postal.nlservice;

import android.app.Notification;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;

/**
 * Created by Александр on 05.10.2017.
 */

public class NLService extends NotificationListenerService {
    public void onNotificationPosted(StatusBarNotification sbn) {
        sbn.getNotification().extras.getCharSequence(Notification.EXTRA_TEXT).toString();
        sbn.getNotification().extras.getCharSequence(Notification.EXTRA_TITLE).toString();

    }
    @Override
    public void onNotificationRemoved(StatusBarNotification sbn) {
        //super.onNotificationRemoved(sbn);
    }
}
