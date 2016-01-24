/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConnectToPostgreSQL;

import bufferManager.BufferManager;
import bufferManager.InternalBuffer;
import diskManager.DiskManager;
import documentManager.DocumentManager;
import indexManager.BTreeIndex;
import indexManager.ElementIndex;
import indexManager.StructuralSummaryIndex;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import xmlProcessor.DBServer.DBException;
import xmlProcessor.DeweyID;
import userInterface.JFrameDB;

import java.sql.*;

/**
 *
 * @author MohsenCs
 */
public class PostgreDB
{
    private String docName;//haman db name
    private BTreeIndex bTreeIndex;
    private ElementIndex elemIndex;
    private StructuralSummaryIndex structSumIndex;
    private PostgreDBManager dbdocMgr;
    private BufferManager bufMgr=BufferManager.getInstance();
    //IndexManager indexMgr;
    private List<DeweyID> Deweylist;
    private static  int num = 0;
    private Connection con = null;

    public PostgreDB() 
    {
    }
    public PostgreDB(String docName) throws IOException 
    {
        dbdocMgr=PostgreDBManager.Instance;
        
        try
        {
            String dbURL= "jdbc:postgresql://localhost:5432/XMLDB";
            String userName = "postgres";
            String password = "P0stgresql";
            con = DriverManager.getConnection(dbURL,userName,password);
        }
        catch(SQLException e)
        {
            System.out.println("JDBC Driver is not Configured Correctly !");
            e.printStackTrace();
            
            return;
        }
    }
    
    
     public List getDeweyList()
    {
        return Deweylist;
    }
     
     public HashMap checkBufPool()
     {
         logManager.LogManager.log(0,"Checking bufPool status");
        return bufMgr.getPoolStatus();
     }
     
    public void addElement(DeweyID deweyID,String qName,int parentCID,boolean qNameFound) throws IOException, Exception ,SQLException
    {
        try
        {
            if(con != null)
            {
                String sqlQuery = "INSERT INTO \"OrderedByCID\" (\"CID\", \"DeweyID\") VALUES (?, ?);";
                PreparedStatement pst = con.prepareStatement(sqlQuery);
                pst.setInt(1, deweyID.getCID());
                pst.setString(2, deweyID.toString());
                pst.executeUpdate();
                pst.close();
                
            }
        }
         catch(SQLException e)
        {
            System.out.println("JDBC Driver is not Configured Correctly !");
            e.printStackTrace();
            return;
        }
    }
    
     public void addAttribute(DeweyID deweyID,String qName,int parentCID,boolean qNameFound) throws IOException, Exception
     {
         //parentCID is curNode's CID
//        logManager.LogManager.log(6,qName);
//        logManager.LogManager.log(6,"Attrib: "+deweyID.toString());
//        logManager.LogManager.log(6,String.valueOf(deweyID.getCID()));
//        }
//         elemIndex.insert(deweyID.getCID(),deweyID);   
//         bTreeIndex.insert(deweyID,deweyID.getCID(),qName);
        if(!qNameFound)
        {
            //structSumIndex.add(deweyID.getCID(),qName,parentCID);
            try
            {
                if(con != null)
                {
                    String sqlQuery = "INSERT INTO \"OrderedByCID\" (\"CID\", \"DeweyID\") VALUES (?, ?);";
                    PreparedStatement pst = con.prepareStatement(sqlQuery);
                    pst.setInt(1, deweyID.getCID());
                    pst.setString(2, deweyID.toString());
//                    pst.setString(3, String.v);
                    pst.executeUpdate();
                    pst.close();
                }
            }
            catch(SQLException e)
            {
                System.out.println("JDBC Driver is not Configured Correctly !");
                e.printStackTrace();
                return;
            }
        }
         //checkBufPool();
     }
     public void addValue(DeweyID deweyID,String value,int parentCID) throws IOException, Exception
     {
         // we may have problem here
         // maybe we should update previously inserted attributes instead of insert new one
         
        //FOR ATTrib Values (Actually they are behaved the same as text contents)
         //text contents are not added to element index,thier CID shouldn be Zero 
         //elemIndex.insert(0,deweyID);
         //bTreeIndex.insert(deweyID,-1,value);
        logManager.LogManager.log(6,value);
        logManager.LogManager.log(6,"Value: "+deweyID.toString());
        try
        {
            if(con != null)
            {
                String sqlQuery = "INSERT INTO \"OrderedByCID\" (\"CID\", \"DeweyID\" , \"Value\") VALUES (?, ? ,?);";
                PreparedStatement pst = con.prepareStatement(sqlQuery);
                pst.setInt(1, deweyID.getCID());
                pst.setString(2, deweyID.toString());
                pst.setString(3, value);
                pst.executeUpdate();
                pst.close();
                
            }
        }
        catch(SQLException e)
        {
            System.out.println("JDBC Driver is not Configured Correctly !");
            e.printStackTrace();
            return;
        }

         // structSumIndex.add(-1,value,parentCID);THIS IS NOT NEEDED!
         //checkBufPool();
     }
     public void addContent(DeweyID deweyID,StringBuilder contentBuilder,int parentCID) throws IOException, Exception
     {
         String content=new String(contentBuilder);
         try
        {
            if(con != null)
            {
                String sqlQuery = "INSERT INTO \"OrderedByCID\" (\"CID\", \"DeweyID\" , \"Value\") VALUES (?, ? ,?);";
                PreparedStatement pst = con.prepareStatement(sqlQuery);
                pst.setInt(1, deweyID.getCID());
                pst.setString(2, deweyID.toString());
                pst.setString(3, content);
                pst.executeUpdate();
                pst.close();
                
            }
        }
        catch(SQLException e)
        {
            System.out.println("JDBC Driver is not Configured Correctly !");
            e.printStackTrace();
            return;
        }
         //text contents are not added to element index,thier CID shouldn be Zero 
         //elemIndex.insert(0,deweyID);
//         bTreeIndex.insert(deweyID,-2,content);
//         System.out.println("CID: -2");
         //structSumIndex.add(-2,content,parentCID);THIS IS NOT NEEDED
         //checkBufPool();
     }
     public void endOfDocSignal() throws IOException, DBException, SQLException
     {
         structSumIndex.endDoc();
//         docMgr.closeDoc(this.docName);
         con.close();
         
     }
}
