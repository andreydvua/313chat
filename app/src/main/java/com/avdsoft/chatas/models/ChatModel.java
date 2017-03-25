package com.avdsoft.chatas.models;

import java.util.Date;

/**
 * Created by AVDSOFT on 25.03.2017;
 * project - ChatAS;
 */

public class ChatModel {
    private int id;
    private int user_id;
    private String message;
    private Date timeStamp;

    public ChatModel(int id, int user_id, String message, Date timeStamp) {
        this.id = id;
        this.user_id = user_id;
        this.message = message;
        this.timeStamp = timeStamp;
    }

    public int getId() {
        return id;
    }

    public int getUser_id() {
        return user_id;
    }

    public String getMessage() {
        return message;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }
}
