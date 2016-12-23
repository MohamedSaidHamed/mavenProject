

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mohamed
 */
public class consonantsCount {
    
    int count; 
    
    public void conCount(String str){
        
        str=str.toUpperCase();
        
        System.out.println("Org Text:" +str);
        
        count= str.length(); 
        
        if(str.contains("A")){
                System.out.println("VoulA");
                count --; 
                
            }
            if(str.contains("E")){
                System.out.println("VoulE");
                count--; 
            }
            if(str.contains("I")){
                System.out.println("VoulI");
                count--;
            }
            if(str.contains("O")){
                System.out.println("VoulO");
                count--; 
            }
            if(str.contains("U")){
                System.out.println("VoulU");
                count--;
            }
            
          System.out.println("Consonants Count = "+ count);
        
    }
    
}
