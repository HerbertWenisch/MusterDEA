/**
 * MusterDEA
 *
 * @author Herbert Wenisch
 * @version 16.19.21
 */

public class DEA {
    private int state = 0;
    
    private void consume(char ch){
        switch (state){
            case 0 : 
                if(ch == 'a') state = 1;
                if(ch == 'd') state = -1; 
                break;
                
            case 1:
                if(ch == 'a');
                else if (ch == 'b') state = 2;
                else if (ch == 'c') state = 0;
                else state = -1;  
                break;
                
            case 2:
                switch(ch){
                    case 'a': state = 1; break;
                    case 'b':
                    case 'c': state = 0; break;
                    default: state = -1;
                }
                break;
         }
    }
         
    public boolean test(String word){
       state = 0;
       for(int i = 0; i < word.length(); i++)
           consume(word.charAt(i));
       return state == 2;    
   }
}
     
    

