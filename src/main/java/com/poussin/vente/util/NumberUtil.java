/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.vente.util;

/**
 *
 * @author hp
 */
public class NumberUtil {
   
    private static final String CHAINE_VIDE="";
    
    public static Double toDouble(String value){
        if(value==null || value.isEmpty()){
            return null;
        }else {
            return new Double(value);
        }
    }
    
    
 
    
    public static String toString(Double value){
        if(value==null){
            return CHAINE_VIDE;
        }else {
            return String.valueOf(value);
        }
    }
}
