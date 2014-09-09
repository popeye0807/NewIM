package com.whosbean.newim.entity;

import org.msgpack.annotation.Message;

import java.util.UUID;

/**
 * Created by yaming_deng on 14-9-9.
 */
@Message
public class ChatMessage extends Chatbox {

    public static final Integer OP_JOIN = 1;
    public static final Integer OP_QUIT = 2;
    public static final Integer OP_CHAT = 3;

    private String uuid;
    private String sender;
    private String receiver;
    private Integer type;
    private String body;
    private Integer op;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public void assignUuid(){
        this.uuid = UUID.randomUUID().toString();
        this.uuid = this.uuid.replace("-", "");
    }

    public Integer getOp() {
        return op;
    }

    public void setOp(Integer op) {
        this.op = op;
    }
}