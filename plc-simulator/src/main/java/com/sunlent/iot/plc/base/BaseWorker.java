package com.sunlent.iot.plc.base;

import java.net.Socket;

/**
 * @author aborn (jiangguobao)
 * @date 2022/12/05 10:27
 */
public class BaseWorker extends Thread {

    protected Socket socket;

    /**
     * Socket No.
     */
    protected int socketid;

    @Override
    public void run() {
        handleClient();
    }

    protected void handleClient() {

    }

    public BaseWorker(Socket socket) {
        this(socket, 0);
    }

    public BaseWorker(Socket socket, int id) {
        this.socket = socket;
        this.socketid = id;
    }

    protected void write(String address, byte[] value) {
        // 由继承子类实现
        SimuData.put(getArea(), address, value);
    };

    protected String getArea() {
        return "BASEWORKER";
    }

    protected byte[] read(String address) {
        return SimuData.get(getArea(), address);
    }

    public Socket getSocket() {
        return socket;
    }

    public int getSocketid() {
        return socketid;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    public void setSocketid(int socketid) {
        this.socketid = socketid;
    }
}
