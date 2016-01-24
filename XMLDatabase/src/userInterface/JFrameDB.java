
package userInterface;
import databaseManager.DatabaseManager;
import documentManager.Document;
import indexManager.StructuralSummaryManager01;
import java.awt.ComponentOrientation;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerConfigurationException;

import javax.swing.*;

import xmlProcessor.RG.Twig;
//import xmlProcessor.RG01.Twig???
import outputGenerator.CIDStream;
import outputGenerator.DIDStream;
import outputGenerator.ExportData;import outputGenerator.Comparator;
import outputGenerator.NodeStream;
import outputGenerator.QNameIndexSimulator;
import xmlProcessor.DBServer.DBException;
public class JFrameDB extends javax.swing.JFrame
{
    private Document doc;
    private Twig twig;
    private StructuralSummaryManager01 ssMgr;
    
    public JFrameDB()  
    {
        initComponents();
          twig=new Twig(); 
          //ssMgr=StructuralSummaryManager01.getInctance();
    }
    public void AppendToOutput(String newOutput)
    {
        jtxtOutput.append(newOutput);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jDialog1 = new javax.swing.JDialog();
        jbtnGo = new javax.swing.JButton();
        btnGetStream = new javax.swing.JButton();
        JBtn_NodeStream = new javax.swing.JButton();
        jBtn_Comparator = new javax.swing.JButton();
        jtxtPlanNumber = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jRBtn_RG00 = new javax.swing.JRadioButton();
        jRBtn_RG01 = new javax.swing.JRadioButton();
        jRBtn_RG05 = new javax.swing.JRadioButton();
        jRBtn_RG06 = new javax.swing.JRadioButton();
        jRBtn_RG07 = new javax.swing.JRadioButton();
        jBtn_Simulate = new javax.swing.JButton();
        jTxt_QName = new javax.swing.JTextField();
        jBtnDIDStream = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jRdBtn_DispID = new javax.swing.JRadioButton();
        jBtn_Export = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jbtnOpenXML = new javax.swing.JButton();
        jbtnSaveToDB = new javax.swing.JButton();
        jtxtXMLPath = new javax.swing.JTextField();
        jtxtDBPath = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtOutput = new javax.swing.JTextArea();
        jBtnProcess = new javax.swing.JButton();
        jBtn_ssGen = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jbtnGo.setText("Go");
        jbtnGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGoActionPerformed(evt);
            }
        });

        btnGetStream.setText("Get Class Id Stream");
        btnGetStream.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetStreamActionPerformed(evt);
            }
        });

        JBtn_NodeStream.setText("Get Node Stream");
        JBtn_NodeStream.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtn_NodeStreamActionPerformed(evt);
            }
        });

        jBtn_Comparator.setText("Compare");
        jBtn_Comparator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_ComparatorActionPerformed(evt);
            }
        });

        jtxtPlanNumber.setText("103");
        jtxtPlanNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtPlanNumberActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRBtn_RG00);
        jRBtn_RG00.setText("RG00");
        jRBtn_RG00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBtn_RG00ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRBtn_RG01);
        jRBtn_RG01.setText("RG01");
        jRBtn_RG01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBtn_RG01ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRBtn_RG05);
        jRBtn_RG05.setText("RG05");
        jRBtn_RG05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBtn_RG05ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRBtn_RG06);
        jRBtn_RG06.setText("RG06");
        jRBtn_RG06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBtn_RG06ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRBtn_RG07);
        jRBtn_RG07.setSelected(true);
        jRBtn_RG07.setText("RG07");
        jRBtn_RG07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBtn_RG07ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRBtn_RG07)
                    .addComponent(jRBtn_RG06)
                    .addComponent(jRBtn_RG05)
                    .addComponent(jRBtn_RG01)
                    .addComponent(jRBtn_RG00))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jRBtn_RG00)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRBtn_RG01)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRBtn_RG05)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRBtn_RG06)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRBtn_RG07))
        );

        jBtn_Simulate.setText("Simulate Qname Index");
        jBtn_Simulate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_SimulateActionPerformed(evt);
            }
        });

        jTxt_QName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxt_QNameActionPerformed(evt);
            }
        });

        jBtnDIDStream.setText("Get DID Stream");
        jBtnDIDStream.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDIDStreamActionPerformed(evt);
            }
        });

        jRdBtn_DispID.setText("Has DIDs?");

        jBtn_Export.setText("Export");
        jBtn_Export.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_ExportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRdBtn_DispID)
                    .addComponent(jBtn_Export, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRdBtn_DispID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addComponent(jBtn_Export))
        );

        jLabel2.setText("To Choose an XML Document Cllick On Button Bellow:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 307, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        jbtnOpenXML.setText("Select XML Document");
        jbtnOpenXML.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnOpenXMLActionPerformed(evt);
            }
        });

        jbtnSaveToDB.setText("Save Database To");
        jbtnSaveToDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSaveToDBActionPerformed(evt);
            }
        });

        jtxtXMLPath.setText("XML Document");
        jtxtXMLPath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtXMLPathActionPerformed(evt);
            }
        });

        jtxtDBPath.setText("Save To DataBase");

        jtxtOutput.setColumns(20);
        jtxtOutput.setRows(5);
        jScrollPane1.setViewportView(jtxtOutput);

        jBtnProcess.setText("Process Query");
        jBtnProcess.setName(""); // NOI18N
        jBtnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnProcessActionPerformed(evt);
            }
        });

        jBtn_ssGen.setText("Structural Summary Mgr Generator");
        jBtn_ssGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_ssGenActionPerformed(evt);
            }
        });

        jLabel1.setText("Enter The Plan Number of Query You want to be executed :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtnDIDStream, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(466, 466, 466))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTxt_QName, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(jBtn_Simulate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(593, 593, 593))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(JBtn_NodeStream, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGetStream, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(jBtn_ssGen, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                        .addGap(1023, 1023, 1023))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(10, 10, 10))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(10, 10, 10)
                                        .addComponent(jtxtPlanNumber))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jbtnSaveToDB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jbtnOpenXML, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jtxtXMLPath)
                                            .addComponent(jtxtDBPath, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBtnProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jbtnGo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(306, 306, 306)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBtn_Comparator, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(552, 552, 552))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jBtn_Comparator, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jbtnGo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jbtnOpenXML)
                                            .addComponent(jtxtXMLPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(3, 3, 3)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jbtnSaveToDB)
                                            .addComponent(jtxtDBPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jtxtPlanNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBtnProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jBtn_ssGen)
                                .addGap(17, 17, 17)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtn_Simulate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxt_QName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnDIDStream)
                        .addGap(10, 10, 10)
                        .addComponent(btnGetStream, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBtn_NodeStream)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(449, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGoActionPerformed
         DatabaseManager dbMgr=DatabaseManager.Instance;
        
             try {
                 System.out.println("XML File Read From :\t"+jtxtXMLPath.getText());
                 System.out.println("Database Save To :\t"+jtxtDBPath.getText());
                 AppendToOutput("XML File Read From :\t"+jtxtXMLPath.getText());
                 AppendToOutput("Database Save To :\tPostgreSQL");
                 doc=dbMgr.importDB(jtxtDBPath.getText(),jtxtXMLPath.getText());     
                 //List <DeweyID> Deweylist=doc.getDeweyList();
                 // jTxtDocument.append(Deweylist.get(i).toString());
                     // jTxtDocument.append(Deweylist.get(i).toString());
             } catch (ParserConfigurationException | TransformerConfigurationException | IOException | DBException ex) {
                 ex.printStackTrace();
             }
             
    }//GEN-LAST:event_jbtnGoActionPerformed

    private void jBtnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnProcessActionPerformed
         try {
            //how I should pass params?
           // twig.prepare(evt, params);
            if(jRBtn_RG00.isSelected())
//                 twig.customizedPrepare(101,jTxtDbName.getText(),jRBtn_RG00.getText());
                 twig.customizedPrepare(Integer.parseInt(jtxtPlanNumber.getText()),jtxtDBPath.getText(),jRBtn_RG00.getText());
//                 twig.customizedPrepare(302,jTxtDbName.getText(),jRBtn_RG00.getText());
//                 twig.customizedPrepare(303,jTxtDbName.getText(),jRBtn_RG00.getText());
            else if(jRBtn_RG01.isSelected())
//                 twig.customizedPrepare(101,jTxtDbName.getText(),jRBtn_RG01.getText());
            twig.customizedPrepare(Integer.parseInt(jtxtPlanNumber.getText()),jtxtDBPath.getText(),jRBtn_RG01.getText());
            else if(jRBtn_RG05.isSelected())
//                twig.customizedPrepare(101,jTxtDbName.getText(),jRBtn_RG05.getText());
                twig.customizedPrepare(Integer.parseInt(jtxtPlanNumber.getText()),jtxtDBPath.getText(),jRBtn_RG05.getText());
            else if(jRBtn_RG06.isSelected())
//                twig.customizedPrepare(101,jTxtDbName.getText(),jRBtn_RG06.getText());
                twig.customizedPrepare(Integer.parseInt(jtxtPlanNumber.getText()),jtxtDBPath.getText(),jRBtn_RG06.getText());
            else if(jRBtn_RG07.isSelected())
//                twig.customizedPrepare(101,jTxtDbName.getText(),jRBtn_RG07.getText());
                twig.customizedPrepare(Integer.parseInt(jtxtPlanNumber.getText()),jtxtDBPath.getText(),jRBtn_RG07.getText());

            twig.execute();
        } catch (DBException ex) {
            //StackTraceElement[] DBStackTrace=ex.getStackTrace();
            ex.printStackTrace();
            System.err.println("Exception occured during execute() being run in jBtnProcessActionPerformed");
        }
    }//GEN-LAST:event_jBtnProcessActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
         
    }//GEN-LAST:event_formWindowClosed

    private void btnGetStreamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetStreamActionPerformed
       CIDStream stream=new CIDStream();
        try {
            stream.open(jtxtDBPath.getText());
            stream.close(jtxtDBPath.getText());
        } catch (IOException ex) {
            System.err.println("error occured during getting stream");
        } catch (DBException ex) {
           System.err.println("DBException occured during QNameIndexSimulator()(while opening indexes)! ");
        }
    }//GEN-LAST:event_btnGetStreamActionPerformed

    private void JBtn_NodeStreamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtn_NodeStreamActionPerformed
        NodeStream nodeS=new NodeStream();
        try {
            nodeS.open(jtxtDBPath.getText());
            nodeS.close(jtxtDBPath.getText());
        } catch (IOException ex) {
            System.err.println("error occured during getting stream");
            ex.printStackTrace();
        } catch (DBException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_JBtn_NodeStreamActionPerformed

    private void jBtn_ComparatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_ComparatorActionPerformed
        try {
            Comparator comparator=new Comparator();
            comparator.compare();
            
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jBtn_ComparatorActionPerformed

    private void jtxtPlanNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtPlanNumberActionPerformed
       
    }//GEN-LAST:event_jtxtPlanNumberActionPerformed

    private void jRBtn_RG01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBtn_RG01ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBtn_RG01ActionPerformed

    private void jRBtn_RG06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBtn_RG06ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBtn_RG06ActionPerformed

    private void jRBtn_RG05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBtn_RG05ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBtn_RG05ActionPerformed

    private void jRBtn_RG00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBtn_RG00ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBtn_RG00ActionPerformed

    private void jBtn_ssGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_ssGenActionPerformed
        //MohsenCs: this function doesn't work properly yet.
        String xmlOutput;
        try 
        {
            xmlOutput = new String(ssMgr.getXMLStructuralSummary(jtxtDBPath.getText()));
            jtxtOutput.setText(xmlOutput);
        } catch (DBException ex) {
            System.err.println("error ocured during getXMLStructuralsummary()");
        }
         
    }//GEN-LAST:event_jBtn_ssGenActionPerformed

    private void jBtn_SimulateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_SimulateActionPerformed
        try {
            QNameIndexSimulator simulator=new QNameIndexSimulator((jtxtDBPath.getText()));
            jtxtOutput.setText(simulator.toString(simulator.simulate(jTxt_QName.getText())));
            simulator.close();
        } catch (IOException ex) {
            System.err.println("IOException occured during QNameIndexSimulator()(while opening indexes)! ");
        } catch (DBException ex) {
            System.err.println("DBException occured during QNameIndexSimulator()(while opening indexes)! ");
        }
    }//GEN-LAST:event_jBtn_SimulateActionPerformed

    private void jTxt_QNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxt_QNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxt_QNameActionPerformed

    private void jRBtn_RG07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBtn_RG07ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBtn_RG07ActionPerformed

    private void jBtn_ExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_ExportActionPerformed
       
         JFileChooser fcXMLDoc = new JFileChooser();
         String expFilePath = jtxtDBPath.getText();
        if(fcXMLDoc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION)
        {
            File xmlExport = fcXMLDoc.getSelectedFile();
            expFilePath = xmlExport.getPath();
        }
        try
       {
               ExportData expData=new ExportData(jtxtDBPath.getText(),expFilePath);
               boolean dispDIDs=false;
               if(jRdBtn_DispID.isSelected())
                   dispDIDs=true;
               expData.exporter(dispDIDs);
               expData.close();
          
       }
       catch(IOException ex)
       {
           logManager.LogManager.log(5,"IO Error occured while Exportation"); 
       } catch (Exception ex) {
           StackTraceElement[] stackTrace = ex.getStackTrace();
           //logManager.LogManager.log(5,"Exception:"+ stackTrace[0].getFileName()+"."+stackTrace[0].getMethodName()+" at line: "+ stackTrace[0].getLineNumber());
           ex.printStackTrace();
       }
    }//GEN-LAST:event_jBtn_ExportActionPerformed

    private void jBtnDIDStreamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDIDStreamActionPerformed
        // This Function Just Print outs the DeweyID of all Captured Elements of xml documnet
        DIDStream stream=new DIDStream();
        try {
            stream.open(jtxtDBPath.getText());
            stream.close(jtxtDBPath.getText());
        } catch (IOException ex) {
            System.err.println("error occured during getting stream");
        } catch (DBException ex) {
           System.err.println("DBException occured during QNameIndexSimulator()(while opening indexes)! ");
        }
    }//GEN-LAST:event_jBtnDIDStreamActionPerformed

    private void jbtnSaveToDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSaveToDBActionPerformed
        // TODO add your handling code here:
         JFileChooser fcDB = new JFileChooser();
        if(fcDB.showSaveDialog(this) == JFileChooser.APPROVE_OPTION)
        {
            File xmlDB = fcDB.getSelectedFile();
            jtxtDBPath.setText(xmlDB.getPath());
        }
    }//GEN-LAST:event_jbtnSaveToDBActionPerformed

    private void jbtnOpenXMLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnOpenXMLActionPerformed
        // TODO add your handling code here:
        
        JFileChooser fcXMLDoc = new JFileChooser();
        if(fcXMLDoc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION)
        {
            File xmlInputDoc = fcXMLDoc.getSelectedFile();
            jtxtXMLPath.setText(xmlInputDoc.getPath());
        }
    }//GEN-LAST:event_jbtnOpenXMLActionPerformed

    private void jtxtXMLPathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtXMLPathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtXMLPathActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //Get the jvm heap size.
        long heapSize = Runtime.getRuntime().totalMemory();
        //Print the jvm heap size.
        System.out.println("Heap Size = " + heapSize);
        
        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameDB().setVisible(true);
            }
        });
        
        System.out.println("END!");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBtn_NodeStream;
    private javax.swing.JButton btnGetStream;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JButton jBtnDIDStream;
    private javax.swing.JButton jBtnProcess;
    private javax.swing.JButton jBtn_Comparator;
    private javax.swing.JButton jBtn_Export;
    private javax.swing.JButton jBtn_Simulate;
    private javax.swing.JButton jBtn_ssGen;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRBtn_RG00;
    private javax.swing.JRadioButton jRBtn_RG01;
    private javax.swing.JRadioButton jRBtn_RG05;
    private javax.swing.JRadioButton jRBtn_RG06;
    private javax.swing.JRadioButton jRBtn_RG07;
    private javax.swing.JRadioButton jRdBtn_DispID;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTxt_QName;
    private javax.swing.JButton jbtnGo;
    private javax.swing.JButton jbtnOpenXML;
    private javax.swing.JButton jbtnSaveToDB;
    private javax.swing.JTextField jtxtDBPath;
    private javax.swing.JTextArea jtxtOutput;
    private javax.swing.JTextField jtxtPlanNumber;
    private javax.swing.JTextField jtxtXMLPath;
    // End of variables declaration//GEN-END:variables
}
