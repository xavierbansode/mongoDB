/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trymongo;

/**
 *
 * @author XAVIER
 */
import com.mongodb.*;
import java.net.UnknownHostException;
import com.mongodb.DB;
public class TryMongo {

    boolean Flag=true;
    TryMongo Parent;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MongoClient mongoClient = new MongoClient("localhost",27017);
        DB db = mongoClient.getDB("TourDatabase");
        DBCollection coll=db.getCollection("CustomerDetails");
        
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartPageJFrame().setVisible(true);
    //    BasicDBObject doc =new BasicDBObject("First_Name",name);
        
                                 }  
        }*/
        
      //this.setVisible(false);
    new LoginForm().setVisible(true);
    }

   
}
