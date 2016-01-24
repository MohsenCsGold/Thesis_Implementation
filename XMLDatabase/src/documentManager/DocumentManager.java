package documentManager;

import documentManager.Document;
import ConnectToPostgreSQL.PostgreDB;
import documentManager.IDocumentManager;
import LogicalFileManager.LogicalFileManager;
import indexManager.IndexManager;
import indexManager.BTreeIndex;
import indexManager.ElementIndex;
import indexManager.StructuralSummaryIndex;
//import diskManager.FileManager;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import xmlBuilder.XmlParser;
import xmlProcessor.DBServer.DBException;

public class DocumentManager implements IDocumentManager
{
    private IndexManager indexMgr;
    public static DocumentManager Instance=new DocumentManager();
    private DocumentManager()
    {
        indexMgr= IndexManager.Instance;
    }
    
     public Document createDoc(String DbName) throws IOException, DBException
    {
        //String filePath;
        //String indexPath;
        BTreeIndex bTreeIndex=indexMgr.createBTreeIndex(DbName);//modifies metadata,reates root node
        ElementIndex elemIndex=indexMgr.createElementIndex(DbName);
        StructuralSummaryIndex structSumIndex=indexMgr.createSSIndex(DbName);
        Document doc = null;
        //PostgreDB dbdoc = null;
        try 
        {
//            doc = new Document(DbName,bTreeIndex);
            doc=new Document(DbName,bTreeIndex,structSumIndex,elemIndex);
            //dbdoc = new PostgreDB(DbName);
        } catch (IOException ex) {
            Logger.getLogger(DocumentManager.class.getName()).log(Level.SEVERE, null,ex);
        }
        return doc;
    }
     
     
    public void closeDoc(String openDocName) throws IOException, DBException//input may change to openDoc itself
    {
        System.out.println("closing");
        
        // I think here is some problem that compiler says out of memory!
        indexMgr.closeIndexes(openDocName);
       
    }
    
    /** public Document loadIndex(String DBName,int type)
    {
        switch(type)
        {
                case 1: BTreeIndex bTreeIndex=indexMgr.openBTreeIndex();
                case 2:  ElementIndex elemIndex=indexMgr.openElementIndex;
                case 3: StructuralSummaryIndex structSumIndex=indexMgr.openSSIndex;  
        }
     
    }*/
    
}
