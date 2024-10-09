package com.chatonline.models;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Chatter {
    private String name;
    private final Socket socket;
    private final OutputStream printWriter;
    private final InputStream bufferedReader;
    private String status;

    public Chatter(String name, Socket socket, OutputStream printWriter, InputStream bufferedReader) {
        this.name = name;
        this.socket = socket;
        this.printWriter = printWriter;
        this.bufferedReader = bufferedReader;
        this.status = "online";
    }

    public String getName() {
        return name;
    }

    public Socket getSocket() {
        return socket;
    }

    public OutputStream getPrintWriter() {
        return printWriter;
    }

    public InputStream getBufferedReader() {
        return bufferedReader;
    }

    public String getStatus() {
        return status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}