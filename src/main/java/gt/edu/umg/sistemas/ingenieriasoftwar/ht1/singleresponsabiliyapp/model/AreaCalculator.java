
package gt.edu.umg.sistemas.ingenieriasoftwar.ht1.singleresponsabiliyapp.model;

public class AreaCalculator {
    
    
    public float SquareArea(float width, float heith){
        
        float result;
        
        result = width * heith;
        
        return result;        
    }
    
    public float TringleArea(float width, float heith){
   
        float result;
        
        result = (width * heith) / 2;
        
        return result;
    } 
    
    public float OblicuangleArea(float width, float heith){
        
        float result;
        
        result = ((width * heith) / 2) * 1;
        
        return result;
    
    }
    
}
