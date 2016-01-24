/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConnectToPostgreSQL;

import documentManager.DocumentManager;
import indexManager.BTreeIndex;
import indexManager.ElementIndex;
import indexManager.IndexManager;
import indexManager.StructuralSummaryIndex;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.lang.*;
import xmlProcessor.DBServer.DBException;

/**
 *
 * @author MohsenCs
 */
public class PostgreDBManager {
    
    public static PostgreDBManager Instance=new PostgreDBManager();
    private PostgreDBManager()
    {
    }
    
    public PostgreDB CreateDbDoc(String DbName) throws IOException, DBException
    {
        PostgreDB dbdoc = null;
        try 
        {
//            doc = new Document(DbName,bTreeIndex);
            dbdoc = new PostgreDB(DbName);
        } catch (IOException ex) {
            Logger.getLogger(DocumentManager.class.getName()).log(Level.SEVERE, null,ex);
        }
        return dbdoc;
    }
    
}
