package daily;

/**
 * Write a description of class WarmupMethods here.
 *
 * @author Jason Ballinger
 * @version 9/28/2021
 * 
 */

public class WarmupMethods
{
    double numa;
    double numb;
    
    public WarmupMethods(){
        numa = 0;
        numb = 0;
    }
    
    public WarmupMethods(double paramA, double paramB){
        numa = paramA;
        numb = paramB;
    }
    
    public WarmupMethods(WarmupMethods dup){
        
    }
    
    public double sum(){
        return(numa + numb);
    }
    
    public double quotient(){
        return(numa / numb);
    }
    
    public double difference(){
        return(numa - numb);
    }
    
    public double getnuma(){
        return numa;
    }
    
    public double getnumb(){
        return numb;
    }
}
