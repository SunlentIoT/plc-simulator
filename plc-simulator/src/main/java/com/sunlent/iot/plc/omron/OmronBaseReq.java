package com.sunlent.iot.plc.omron;

/**
 * @author aborn (jiangguobao)
 * @date 2022/12/09 15:31
 */
public class OmronBaseReq {
    byte[] header = new byte[4];
    byte[] length = new byte[4];
    byte[] command = new byte[4];
    byte[] errorCode = new byte[4];

    OmronBaseReq(byte[] buf) {
        System.arraycopy(buf, 0, this.header, 0, 4);
        System.arraycopy(buf, 1 * 4, this.length, 0, 4);
        System.arraycopy(buf, 2 * 4, this.command, 0, 4);
        System.arraycopy(buf, 3 * 4, this.errorCode, 0, 4);
    }

    public byte[] getHeader() {
        return header;
    }

    public byte[] getLength() {
        return length;
    }

    public byte[] getCommand() {
        return command;
    }

    public byte[] getErrorCode() {
        return errorCode;
    }
}
