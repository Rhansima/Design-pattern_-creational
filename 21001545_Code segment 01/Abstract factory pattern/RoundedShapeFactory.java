
package code.segment;

public class RoundedShapeFactory extends AbstarctFactory {
    public Shape getShape(String shapeType){
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new RoundedRectangle();
           
        }
        if(shapeType.equalsIgnoreCase("SQUARE")){
            return new RoundedSquare();
           
        }
        return null;
        
    }
    
}
