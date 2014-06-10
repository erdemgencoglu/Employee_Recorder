
package com.employee;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.*;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


/**
 *
 * @author erdem
 */
public class EmployeeUI extends javax.swing.JFrame {
    //Database ayarları
    com.mysql.jdbc.Connection conn=null;
    private String url="jdbc:mysql://localhost:3306/";
    private String dbAdi="employee";
    private String diver="com.mysql.jdbc.Driver";
    private String userAdi="root";
    private String userPass="12253030";
    private String properties="?userUnicode=true&characterEncoding=utf8";
    public ResultSet rs;
    public Statement st;
    Connection connection=null;
    /*----------------------------------------*/
    int ilkDeger;//Liste başı Id si
    int rowCount;//Satır sayısı değişkeni  
    /*---------------------------------------------*/
    //Bağlantı açma metodu
    public Statement baglantiAc() throws Exception{
        Class.forName(diver).newInstance();
        conn=(com.mysql.jdbc.Connection) DriverManager.getConnection(url+dbAdi+properties,userAdi,userPass);
        return (Statement) conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NextButton = new javax.swing.JButton();
        PreviousButton = new javax.swing.JButton();
        FirstID = new javax.swing.JTextField();
        LastID = new javax.swing.JTextField();
        IdArea = new javax.swing.JTextField();
        FirstNameArea = new javax.swing.JTextField();
        LastNameArea = new javax.swing.JTextField();
        EmailArea = new javax.swing.JTextField();
        DepartmentArea = new javax.swing.JTextField();
        TitleArea = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        SearchArea = new javax.swing.JTextField();
        FindButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        BrowseAllEntryButton = new javax.swing.JButton();
        UpdateEntryButton = new javax.swing.JButton();
        DeleteEntryButton = new javax.swing.JButton();
        InsertentryButton = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Erdem Gençoğlu 12253030");
        setName("Employee"); // NOI18N
        setResizable(false);

        NextButton.setText("Next");
        NextButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NextButtonMouseClicked(evt);
            }
        });

        PreviousButton.setText("Previous");
        PreviousButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PreviousButtonMouseClicked(evt);
            }
        });

        FirstID.setEditable(false);
        FirstID.setBackground(java.awt.Color.white);

        LastID.setEditable(false);
        LastID.setBackground(java.awt.Color.white);

        IdArea.setEditable(false);
        IdArea.setBackground(java.awt.Color.white);
        IdArea.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Find by LastName", "Find by Department", "Find by Title" }));

        FindButton.setText("Find");
        FindButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FindButtonMouseClicked(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("ID");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("LastName");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("FirstName");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Email");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Department");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Title");

        jLabel7.setText("/");

        BrowseAllEntryButton.setText("Browse all entry");
        BrowseAllEntryButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BrowseAllEntryButtonMouseClicked(evt);
            }
        });

        UpdateEntryButton.setText("Update entry");
        UpdateEntryButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateEntryButtonMouseClicked(evt);
            }
        });

        DeleteEntryButton.setText("Delete entry");
        DeleteEntryButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteEntryButtonMouseClicked(evt);
            }
        });

        InsertentryButton.setText("Insert new entry");
        InsertentryButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InsertentryButtonMouseClicked(evt);
            }
        });

        Clear.setText("Clear");
        Clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClearMouseClicked(evt);
            }
        });

        jLabel8.setText("Employee Recorder");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(202, 202, 202))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SearchArea)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FindButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DeleteEntryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BrowseAllEntryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(InsertentryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(UpdateEntryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(116, 116, 116)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Clear))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PreviousButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FirstID, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(LastID, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel2)))
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(FirstNameArea, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(IdArea, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LastNameArea, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EmailArea, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DepartmentArea, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TitleArea, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NextButton)
                    .addComponent(PreviousButton)
                    .addComponent(FirstID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LastID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IdArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FirstNameArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LastNameArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmailArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DepartmentArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TitleArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Clear)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(SearchArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(FindButton))
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(InsertentryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BrowseAllEntryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DeleteEntryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UpdateEntryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //-------------------------------
    private void BrowseAllEntryButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BrowseAllEntryButtonMouseClicked
         try {
            Statement stmt=baglantiAc();
            String sorgu="SELECT * FROM Employee";  
            rs=stmt.executeQuery(sorgu);
            //Toplam Satır sayısına bulma
            if(rs.last())
            rowCount=rs.getRow();
            else
            rowCount=0;
            ilkDeger=1;
            //Bilgilerin veri tabanından alınması
            rs.beforeFirst();
            rs.next();
            FirstID.setText(""+ilkDeger);
            IdArea.setText(rs.getString("ID"));
            FirstNameArea.setText(rs.getString("FirstName"));
            LastNameArea.setText(rs.getString("LastName"));
            DepartmentArea.setText(rs.getString("Department"));
            EmailArea.setText(rs.getString("Email")); 
            TitleArea.setText(rs.getString("Title"));
            LastID.setText(""+rowCount);

           //--------------------------------------------------------------      
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Database is Empty!");
        } catch (Exception ex) {
           JOptionPane.showMessageDialog(null, "Database problem!");
        }
    }//GEN-LAST:event_BrowseAllEntryButtonMouseClicked

    private void InsertentryButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InsertentryButtonMouseClicked
       //Kişi Ekleme7
       new NewInsert().setVisible(true);
       
    }//GEN-LAST:event_InsertentryButtonMouseClicked
   
    private void UpdateEntryButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateEntryButtonMouseClicked
      try {
            if(ilkDeger!=0){
            st=baglantiAc();
            st.executeUpdate("Update Employee Set FirstName='"+FirstNameArea.getText()+"',LastName='"+LastNameArea.getText()+"',Email='"+EmailArea.getText()+"', Department='"+DepartmentArea.getText()+"',Title='"+TitleArea.getText()+"' WHERE ID='"+IdArea.getText()+"'");
            JOptionPane.showMessageDialog(null,"Update successfuly!"); 
            }
            else
                 JOptionPane.showMessageDialog(null,"Please First Browse Person!");     
            } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Database problem!");
        }
    }//GEN-LAST:event_UpdateEntryButtonMouseClicked

    private void DeleteEntryButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteEntryButtonMouseClicked
        try {
            // Database den kişi silme kısmı
            if(ilkDeger!=0){
            st=baglantiAc();//db.statementi
            st.executeUpdate("Delete from Employee where ID='"+IdArea.getText()+"'");
            JOptionPane.showMessageDialog(null,"Delete successfuly!");
            }
            else
              JOptionPane.showMessageDialog(null,"Please First Browse All Entries!");
            } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Database problem!");
        }
    }//GEN-LAST:event_DeleteEntryButtonMouseClicked

    private void PreviousButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PreviousButtonMouseClicked
         try {
            if(ilkDeger!=0){ 
            if(ilkDeger>1){
            ilkDeger=ilkDeger-1;
            rs.previous();
            FirstID.setText(""+ilkDeger);
            IdArea.setText(rs.getString("ID"));
            FirstNameArea.setText(rs.getString("FirstName"));
            LastNameArea.setText(rs.getString("LastName"));
            DepartmentArea.setText(rs.getString("Department"));
            EmailArea.setText(rs.getString("Email")); 
            TitleArea.setText(rs.getString("Title"));}}
            else
                JOptionPane.showMessageDialog(null,"Please First Browse All Entries!");
           } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,"Database problem!");
        }       
    }//GEN-LAST:event_PreviousButtonMouseClicked

    private void FindButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FindButtonMouseClicked
        try {
            Statement stmt=baglantiAc();
      
            if (jComboBox1.getSelectedItem().toString()=="Find by LastName") {           
                String sorgu="select * from Employee where LastName Like '%"+SearchArea.getText()+"%'";//like komutu girilen değer ile aynı olan kişileri listeler 
                rs=stmt.executeQuery(sorgu);
               
                //Tablonun toplam satırsayısını buldurma
                if(rs.last())
                rowCount=rs.getRow();
                else
                rowCount=0;
                ilkDeger=1;
               //Bilgilerin alınması 
                rs.beforeFirst();
                rs.next();          
                FirstID.setText((""+ilkDeger));
                IdArea.setText(rs.getString("ID"));
                FirstNameArea.setText(rs.getString("FirstName"));
                LastNameArea.setText(rs.getString("LastName"));
                DepartmentArea.setText(rs.getString("Department"));
                EmailArea.setText(rs.getString("Email")); 
                TitleArea.setText(rs.getString("Title"));
                LastID.setText(""+rowCount);           
            }
             
            
            else if (jComboBox1.getSelectedItem().toString()=="Find by Department") {
                String sorgu="select * from Employee where Department Like '%"+SearchArea.getText()+"%'";//like komutu girilen değer ile aynı olan kişileri listeler 
                rs=stmt.executeQuery(sorgu);
               
                //Tablonun toplam satırsayısını buldurma
                if(rs.last())
                rowCount=rs.getRow();
                else
                rowCount=0;
                ilkDeger=1;
                // Bilgilerin alınması
                rs.beforeFirst();
                rs.next();          
                FirstID.setText((""+ilkDeger));
                IdArea.setText(rs.getString("ID"));
                FirstNameArea.setText(rs.getString("FirstName"));
                LastNameArea.setText(rs.getString("LastName"));
                DepartmentArea.setText(rs.getString("Department"));
                EmailArea.setText(rs.getString("Email")); 
                TitleArea.setText(rs.getString("Title"));
                LastID.setText(""+rowCount);           
           
            }
            
            else if (jComboBox1.getSelectedItem().toString()=="Find by Title") {
                String sorgu="select * from Employee where Title Like '%"+SearchArea.getText()+"%'";//like komutu girilen değer ile aynı olan kişileri listeler 
                rs=stmt.executeQuery(sorgu);
               
                //Tablonun toplam satırsayısını buldurma
                if(rs.last())
                rowCount=rs.getRow();
                else
                rowCount=0;
                ilkDeger=1;
                // Bilgilerin alınması
                rs.beforeFirst();
                rs.next();          
                FirstID.setText((""+ilkDeger));
                IdArea.setText(rs.getString("ID"));
                FirstNameArea.setText(rs.getString("FirstName"));
                LastNameArea.setText(rs.getString("LastName"));
                DepartmentArea.setText(rs.getString("Department"));
                EmailArea.setText(rs.getString("Email")); 
                TitleArea.setText(rs.getString("Title"));
                LastID.setText(""+rowCount);           
           
            }
           
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Please check search message!");
           }
        
    }//GEN-LAST:event_FindButtonMouseClicked

    private void ClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearMouseClicked
        FirstID.setText("");
        LastID.setText("");
        IdArea.setText("");
        FirstNameArea.setText("");
        LastNameArea.setText("");
        DepartmentArea.setText("");
        EmailArea.setText(""); 
        TitleArea.setText("");
    }//GEN-LAST:event_ClearMouseClicked

    private void NextButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextButtonMouseClicked

        try {
            if(ilkDeger!=0){
            if(ilkDeger<rowCount){
            rs.next();
            ilkDeger=ilkDeger+1;
            String ilkDegerString=Integer.toString(ilkDeger);
            FirstID.setText(ilkDegerString);
            IdArea.setText(rs.getString("ID"));
            FirstNameArea.setText(rs.getString("FirstName"));
            LastNameArea.setText(rs.getString("LastName"));
            DepartmentArea.setText(rs.getString("Department"));
            EmailArea.setText(rs.getString("Email")); 
            TitleArea.setText(rs.getString("Title"));}}
            else
                JOptionPane.showMessageDialog(null,"Please First Browse All Entries!");
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Database problem!");
           }
        
    }//GEN-LAST:event_NextButtonMouseClicked
     public EmployeeUI() {
        initComponents();
    }

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BrowseAllEntryButton;
    private javax.swing.JButton Clear;
    private javax.swing.JButton DeleteEntryButton;
    private javax.swing.JTextField DepartmentArea;
    private javax.swing.JTextField EmailArea;
    private javax.swing.JButton FindButton;
    private javax.swing.JTextField FirstID;
    private javax.swing.JTextField FirstNameArea;
    private javax.swing.JTextField IdArea;
    private javax.swing.JButton InsertentryButton;
    private javax.swing.JTextField LastID;
    private javax.swing.JTextField LastNameArea;
    private javax.swing.JButton NextButton;
    private javax.swing.JButton PreviousButton;
    private javax.swing.JTextField SearchArea;
    private javax.swing.JTextField TitleArea;
    private javax.swing.JButton UpdateEntryButton;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
