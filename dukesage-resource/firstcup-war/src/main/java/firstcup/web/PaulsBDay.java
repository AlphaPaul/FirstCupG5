/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstcup.web;

import com.e2dev.jni.NativeSingleton;
import java.io.Serializable;
import java.util.StringTokenizer;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.servlet.ServletException;

/**
 *
 * @author paul
 */

@Named
@SessionScoped
public class PaulsBDay implements Serializable {
    
    protected int paulAge = 32;    
    protected String helloString = "hello";

    protected NativeSingleton jniSingleton;
    
    public PaulsBDay() {
        jniSingleton = NativeSingleton.getInstance();
        
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
    
    public String getHelloString(){
        return helloString;
    }
    
    public void setHelloString(String hello){
        helloString = hello;
    }
    
    public void loadJniLib(){
       jniSingleton.loadJniLibrary();
    }
    
    public void updateHelloStringFromJNI(){
        
        int num = jniSingleton.getNativeNumber();
        
        helloString = "Hello, the number received is: " + num;
    }
}
