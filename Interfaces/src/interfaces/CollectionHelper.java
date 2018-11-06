package interfaces;

import java.util.ArrayList;

public class CollectionHelper {
    
    
    public static ArrayList<Object> collectAll (ArrayList<Object> objects, Filter f) 
    {
        ArrayList<Object> result = new ArrayList<>();
        
        for(Object o : objects){
            if (f.accept(o)){
                result.add(o);
            }
        }
        return result;
    }
}
