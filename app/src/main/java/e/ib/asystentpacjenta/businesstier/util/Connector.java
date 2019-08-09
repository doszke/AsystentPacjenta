package e.ib.asystentpacjenta.businesstier.util;

import com.google.firebase.firestore.FirebaseFirestore;

public class Connector {
    
    private static boolean hasInstance = false;

    private FirebaseFirestore firestore;
    
    private Connector() {
        
    }
    
    public static Connector getInstance(){
        if(hasInstance){
            throw new IllegalStateException();
        } else {
            hasInstance = true;
            return new Connector();
        }
    }
    
    
    
}
