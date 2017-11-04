/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsdemo;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

/**
 *
 * @author ngocnt
 */
public class WSDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GeoIPService pogba =  new GeoIPService();
        GeoIPServiceSoap rooney = pogba.getGeoIPServiceSoap();
        GeoIP ferguson = rooney.getGeoIP("123.30.215.62");
        System.out.println(ferguson.getCountryName());
        System.out.println(ferguson.getReturnCodeDetails());
		System.out.println("Edited v2.0");
    }
    
}
