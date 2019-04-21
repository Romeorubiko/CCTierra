/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misc;

import java.util.ArrayList;

/**
 *
 * @author raul
 */
public class IP {
    private String name;
    private String mac;
    private String ip;

    public IP(String name, String mac, String ip) {
        this.name = name;
        this.mac = mac;
        this.ip = ip;
    }

    public String getName() {
        return name;
    }    

    public String getMac() {
        return mac;
    }

    public String getIp() {
        return ip;
    }

    
   
   
}
