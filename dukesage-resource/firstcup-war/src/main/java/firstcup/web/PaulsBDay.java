/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstcup.web;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author paul
 */

@Named
@SessionScoped
public class PaulsBDay implements Serializable {
    
    protected int paulAge = 32;
    
    
    public PaulsBDay(){
        
    }
    
    /**
     * Get the value of paulAge
     *
     * @return the value of paulAge
     */
    public int getPaulAge(){
        return paulAge;
    }
    
    public void setPaulAge(int age){
        paulAge = age;
    }
    
}
