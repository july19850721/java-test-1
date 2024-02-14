package org.example.src.ZhongJieZheMoShi;

import java.util.Date;

public class ChatRoom {
    public static void showMessage(User1 user, String message) {
        System.out.println(new Date() + " [" + user.getName() + "] : " + message);
    }
}