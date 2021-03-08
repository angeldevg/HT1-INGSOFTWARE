
package gt.edu.umg.sistemas.ingenieriasoftwar.ht1.singleresponsabiliyapp.model;


public class Message {
    
    
    public void GenerateTableAreas(float a, float b) {
        
        AreaCalculator area = new AreaCalculator();

        float squardTotal = area.SquareArea(a, b);
        float tringleTotal = area.TringleArea(a, b);
        float circleTotal = area.OblicuangleArea(a, b);

        String table;

        table = "\nSharpt          |   Area   "
                + "\n---------------------"
                + "\nSquard          |   " + squardTotal
                + "\nTriangle        |   " + tringleTotal
                + "\nOblicuangule    |   " + circleTotal;

        this.PrintTableAreas(table);
    }

    public void PrintTableAreas(String table) {

        System.out.println(table);
    }
    
    
}
