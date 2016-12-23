
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mohamed
 */
public class reorderString {
    
    public char [] orgStr ; 
    public String sorted; 
    
    public void reOrder(String str){
        
        str.toUpperCase();
        
        orgStr = str.toCharArray(); 
        
        Arrays.sort(orgStr);
        
        sorted = new String(orgStr); 
        
        System.out.println("Original Textt: "+str + " Reordered String: "+sorted );
        
        
        
        
    }
    
}
