package Creational.AbstractFactory;

public class FactoryProducer {
  //Will be changed
    public static AbstracfFactory getFactory(boolean rounded){
        if(rounded){
          return new RoundedShapeFactory();  
        }else{
          return new ShapeFactory();  
        }
    }
}