package com.sunlent.iot.plc.plcsimulatorserv.api;

import lombok.Data;

/**
 * @author aborn (jiangguobao)
 * @date 2023/01/11 18:00
 */
@Data
public class RegData {
    public RegData() {
    }

    private String area;

    private String address;

    /**
     * forced string output
     */
    private String value;

}
