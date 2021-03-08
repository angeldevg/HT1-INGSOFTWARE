package gt.edu.umg.sistemas.ingenieriasoftware.singleresponsabilityproblemapp.model;


public class CalculatorArea {
    
    
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
    
    
    public void GenerateTableAreas(float a, float b){
    
        float squardTotal =  this.SquareArea(a, b);
        float tringleTotal = this.TringleArea(a, b);
        float circleTotal = this.OblicuangleArea(a, b);
        
        String table;
        
        table = "\nSharpt          |   Area   "
              + "\n---------------------"
              + "\nSquard          |   "+ squardTotal
              + "\nTriangle        |   "+ tringleTotal
              + "\nOblicuangule    |   "+ circleTotal;
        
        this.PrintTableAreas(table);
    }
    
    
    public void PrintTableAreas(String table){
    
        System.out.println(table);
    }
    
    
}
