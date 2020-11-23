/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * TelaPrincipal.java
 *
 * Created on 05/08/2012, 14:32:53
 */
package agenda;

import java.awt.Color;
import java.awt.FileDialog;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utilitarios.ConectaBanco;
import utilitarios.InOut;
import sistemaintegrado.*;

/**
 *
 * @author MC System
 */
public class Agenda extends javax.swing.JFrame {
public String usuario = Parametros.getsNmUsuas();
public String funcao = Parametros.getsFuncao();
ConectaBanco con;
ResultSet lRes;
FileDialog fbSalvar;

/** Creates new form TelaPrincipal */

    public Agenda() {
        super("Agenda");
        
        initComponents();
        this.setLocationRelativeTo(null);
       
        fbSalvar = new FileDialog(this, "Salvar Arquivo", FileDialog.SAVE);
        
        Pesquisa.setEditable(false);
        Pesquisa.setText("Pesquise o Nome Aqui!!!");
        Pesquisa.setBackground(Color.CYAN);
        Pesquisa.setForeground(Color.red);
        
        LimpaButton.setVisible(false);
        AtualizaButton.setVisible(false);
        SalvarButton.setVisible(false);
        
        Membro.setSelected(false);
        NaoMembro.setSelected(false);
        
        PesquisaButton.setVisible(false);
        
        TabAgenda.setVisible(false);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Grupo = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Membro = new javax.swing.JRadioButton();
        NaoMembro = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Nome = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        LimpaButton = new javax.swing.JButton();
        SalvarButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabAgenda = new javax.swing.JTable();
        Pesquisa = new javax.swing.JTextField();
        AtualizaButton = new javax.swing.JButton();
        PesquisaButton = new javax.swing.JButton();
        Progresso = new javax.swing.JProgressBar();
        Tel1 = new javax.swing.JTextField();
        Tel2 = new javax.swing.JTextField();
        Id = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(240, 240, 240));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        Membro.setBackground(new java.awt.Color(255, 255, 204));
        Grupo.add(Membro);
        Membro.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Membro.setText("Membro");
        Membro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Membro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MembroActionPerformed(evt);
            }
        });

        NaoMembro.setBackground(new java.awt.Color(255, 255, 204));
        Grupo.add(NaoMembro);
        NaoMembro.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        NaoMembro.setText("Não Membro");
        NaoMembro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        NaoMembro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NaoMembroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Membro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NaoMembro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NaoMembro)
                    .addComponent(Membro))
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel3.setText("Nome :");

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel4.setText("Telefone :");

        jLabel5.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel5.setText("Telefone 2 :");

        Nome.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jButton3.setText("Sair");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton3MousePressed(evt);
            }
        });

        LimpaButton.setText("Limpar");
        LimpaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LimpaButtonMousePressed(evt);
            }
        });

        SalvarButton.setText("Salvar");
        SalvarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SalvarButtonMousePressed(evt);
            }
        });

        TabAgenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome", "Telefone", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabAgenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabAgendaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabAgenda);
        TabAgenda.getColumnModel().getColumn(0).setResizable(false);
        TabAgenda.getColumnModel().getColumn(0).setPreferredWidth(150);
        TabAgenda.getColumnModel().getColumn(1).setResizable(false);
        TabAgenda.getColumnModel().getColumn(1).setPreferredWidth(15);
        TabAgenda.getColumnModel().getColumn(2).setResizable(false);
        TabAgenda.getColumnModel().getColumn(2).setPreferredWidth(15);

        Pesquisa.setBackground(new java.awt.Color(204, 255, 255));
        Pesquisa.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Pesquisa.setForeground(new java.awt.Color(255, 0, 0));
        Pesquisa.setText("Pesquise o Nome Aqui!!!");
        Pesquisa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        Pesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PesquisaMouseClicked(evt);
            }
        });
        Pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisaActionPerformed(evt);
            }
        });
        Pesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PesquisaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PesquisaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PesquisaKeyTyped(evt);
            }
        });

        AtualizaButton.setText("Atualizar");
        AtualizaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AtualizaButtonMousePressed(evt);
            }
        });

        PesquisaButton.setText("Pesquisar");
        PesquisaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PesquisaButtonMousePressed(evt);
            }
        });

        Progresso.setForeground(new java.awt.Color(0, 0, 0));
        Progresso.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        Progresso.setFocusable(false);
        Progresso.setName("Barra de Progresso"); // NOI18N
        Progresso.setStringPainted(true);

        Tel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        Tel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PesquisaButton))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Nome))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Tel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Tel2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(Progresso, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(AtualizaButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SalvarButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LimpaButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PesquisaButton))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(Tel1)
                        .addComponent(Tel2))
                    .addComponent(Id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LimpaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SalvarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AtualizaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Progresso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("Arquivo");

        jMenuItem2.setText("Salvar arquivo");
        jMenuItem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem2MousePressed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem1.setText("Sair");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem1MousePressed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButton3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MousePressed
       
// TODO add your handling code here:
  int confirma = 0;  
  confirma = JOptionPane.showConfirmDialog(rootPane, "DESEJA REALMENTE SAIR ?", null, confirma);
    System.out.println(confirma);
    if (confirma == 0){
        this.dispose();
    }
}//GEN-LAST:event_jButton3MousePressed

    private void LimpaButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LimpaButtonMousePressed
        // ******* Limpa os dados digitados ******
      int confirma = 0;  
  confirma = JOptionPane.showConfirmDialog(rootPane, "DESEJA LIMPAR OS DADOS DIGITADOS ?", null, confirma);
    System.out.println(confirma);
    if (confirma == 0){
        LimpaCampos();
    }      
    }//GEN-LAST:event_LimpaButtonMousePressed

    private void SalvarButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalvarButtonMousePressed
        // ****** Salva os Usuários ********
        String sSql = new String();
  if("".equals(Nome.getText())){
       java.awt.Toolkit.getDefaultToolkit().beep(); 
       JOptionPane.showMessageDialog(null,"DIGITE O NOME ","ERRO NO SALVAMENTO!!!!" , JOptionPane.ERROR_MESSAGE); 
       Nome.requestFocus();
       Nome.setBackground(Color.yellow);
   }else{
        sSql = "INSERT INTO AGENDA_EXTRA(NOME,TELEFONE,TEL_CELULAR) VALUES ('"+Nome.getText()+"','"+Tel1.getText()+"','"+Tel2.getText()+"');"; 
        con= new ConectaBanco();
        if(!con.conecta())
        {
            InOut.MsgDeErro(null,"Erro ao conectar");
            return;            
        }
        con.executa(sSql);
        System.out.println(sSql);
        con.desconecta(); 
        Nome.setBackground(Color.white);
   }   
        
    }//GEN-LAST:event_SalvarButtonMousePressed

    private void PesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisaActionPerformed
 
    }//GEN-LAST:event_PesquisaActionPerformed

    private void PesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PesquisaMouseClicked
        // TODO add your handling code here:
        Pesquisa.setForeground(Color.BLACK);
        Pesquisa.setBackground(Color.yellow);
        Pesquisa.setEditable(true);
        Pesquisa.setText("");
        PesquisaButton.setVisible(true);
        
    }//GEN-LAST:event_PesquisaMouseClicked

    private void PesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PesquisaKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_PesquisaKeyPressed

    private void PesquisaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PesquisaKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_PesquisaKeyTyped

    private void PesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PesquisaKeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_PesquisaKeyReleased

    private void MembroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MembroActionPerformed
        // TODO add your handling code here:
        
        AtualizaButton.setVisible(true);
        LimpaButton.setVisible(true);
        Nome.setEditable(false);
    }//GEN-LAST:event_MembroActionPerformed

    private void NaoMembroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NaoMembroActionPerformed
        // TODO add your handling code here:
        
        AtualizaButton.setVisible(true);
            SalvarButton.setVisible(true);
        LimpaButton.setVisible(true);       
        Nome.setEditable(true);
    }//GEN-LAST:event_NaoMembroActionPerformed

    private void PesquisaButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PesquisaButtonMousePressed
        // TODO add your handling code here:
        TabAgenda.setVisible(true);
        if("".equals(Pesquisa.getText()))
        {
            InOut.MsgDeAviso(null, "Digite o nome para pesquisa!");
        }
        else
        {
            PopulaTabela();            
        }
            
    }//GEN-LAST:event_PesquisaButtonMousePressed

    private void TabAgendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabAgendaMouseClicked
        // TODO add your handling code here:
            // TODO add your handling code here:
        int linha=0;
        String sSql=new String();
        String sMembro = new String();       
    SalvarButton.setVisible(false);
    linha=TabAgenda.getSelectedRow();
    sMembro = TabAgenda.getValueAt(linha, 0).toString();
    // TODO add your handling code here:
        con=new ConectaBanco();
        
        
   if (Membro.isSelected()){
        sSql="SELECT idmembros,NOME,telefone,tel_celular FROM MEMBROS WHERE NOME='"+sMembro+"'ORDER BY NOME;";
        con.conecta();
         if(!con.conecta())
        {
            InOut.MsgDeErro(null,"Erro ao conectar");
            return;            
        }
        con.executaSelect(sSql);
        
        lRes=con.resultset;        
        try 
        {           
            while (lRes.next())
            {
                 Id.setText(lRes.getString("idmembros")); 
                 Nome.setText(lRes.getString("NOME")); 
                 Tel1.setText(lRes.getString("telefone"));
                 Tel2.setText(lRes.getString("tel_celular"));
            }            
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(Agenda.class.getName()).log(Level.SEVERE, null, ex);
        }        
        con.desconecta();
   } else if (NaoMembro.isSelected()){
       sSql="SELECT idagenda,NOME,telefone,tel_celular FROM agenda_extra WHERE NOME='"+sMembro+"'ORDER BY NOME;";
        con.conecta();
         if(!con.conecta())
        {
            InOut.MsgDeErro(null,"Erro ao conectar");
            return;            
        }
        con.executaSelect(sSql);
        System.out.println(sSql);
        lRes=con.resultset;        
        try 
        {           
            while (lRes.next())
            {
                 Id.setText(lRes.getString("idagenda"));
                 Nome.setText(lRes.getString("NOME")); 
                 Tel1.setText(lRes.getString("telefone"));
                 Tel2.setText(lRes.getString("tel_celular"));
                 
            }            
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(Agenda.class.getName()).log(Level.SEVERE, null, ex);
        }        
        con.desconecta();
   } 
        
        
        
    }//GEN-LAST:event_TabAgendaMouseClicked

    private void AtualizaButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AtualizaButtonMousePressed
        // TODO add your handling code here:
        String verifica = new String();
        String sSql = new String();
        con=new ConectaBanco();
       
    if("".equals(Nome.getText())){
       java.awt.Toolkit.getDefaultToolkit().beep(); 
       JOptionPane.showMessageDialog(null,"PESQUISE O NOME DO MEMBRO \n ANTES DE SALVAR","ERRO NA ATUALIZAÇÃO!!!!" , JOptionPane.ERROR_MESSAGE); 
   }else{
        if (Membro.isSelected()){
            sSql="UPDATE MEMBROS SET TELEFONE='"+Tel1.getText()+"', tel_celular='"+Tel2.getText()+"' where idmembros ='"+Id.getText()+"';";
        }else if(NaoMembro.isSelected()){
            sSql="UPDATE agenda_extra SET TELEFONE='"+Tel1.getText()+"', tel_celular='"+Tel2.getText()+"' where idagenda ='"+Id.getText()+"';";
        }
        
        con.conecta();
        con.executa(sSql);
        con.desconecta();
        System.out.println(sSql);
        PopulaTabela();
        
   }  
      
        
        
    }//GEN-LAST:event_AtualizaButtonMousePressed

    private void jMenuItem1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MousePressed
        // TODO add your handling code here:
        int confirma = 0;  
  confirma = JOptionPane.showConfirmDialog(rootPane, "DESEJA REALMENTE SAIR ?", null, confirma);
    System.out.println(confirma);
    if (confirma == 0){
        this.dispose();
    }
        
    }//GEN-LAST:event_jMenuItem1MousePressed

    private void jMenuItem2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem2MousePressed
  String nome_do_arquivo,sSql=null,contador=null;
  boolean continua = true;
          int i=0;
          int recebeProgresso=0;
          String NOME,TELEFONE,TELEFONECELULAR;
       con=new ConectaBanco();
        if(Membro.isSelected())
        {    
            sSql="SELECT NOME,TELEFONE,TEL_CELULAR FROM MEMBROS;";
            contador="SELECT NOME, COUNT(*) AS CONTADOR FROM MEMBROS;";
        }
        else if(NaoMembro.isSelected())
        {
            sSql="SELECT NOME,TELEFONE,TEL_CELULAR FROM AGENDA_EXTRA;";
            contador="SELECT NOME, COUNT(*) AS CONTADOR FROM AGENDA_EXTRA;";
        }
        else
        {
            InOut.MsgDeAviso(null, "Selecione o tipo de agenda (Membro - Não Membro)");
                 continua = false;
        } 
    if(continua)
    {      
        fbSalvar.setVisible(true);
        if (fbSalvar.getFile()==null) {
            return;
        }
        nome_do_arquivo = fbSalvar.getDirectory()+fbSalvar.getFile();
        PrintWriter out = null;
        try {       
            out = new PrintWriter(nome_do_arquivo+".csv");// **** FORMA MAIS RAPIDO DE SALVAR UM ARQUIVO EM .CSV*****
            out.println("NOME;TELEFONE;TELEFONE CELULAR");
     
        con.conecta();
        con.executaSelect(contador); 
        //System.out.println("aqui é o contador"+contador);
        lRes=con.resultset;        
      // System.out.println(lRes);
       //System.out.println(contador);
        try {
            while (lRes.next()){
                   recebeProgresso=Integer.parseInt( lRes.getString("contador"));
            }
            } catch (SQLException ex) {
            InOut.MsgDeErro(null, contador);
        }
         // System.out.println(lRes);
        System.out.println("***********"+recebeProgresso);
        Progresso.setMaximum(recebeProgresso);
        Progresso.setMinimum(0); 
    
         
         if(!con.conecta())
        {
            InOut.MsgDeErro(null,"Erro ao conectar");
            return;            
        }
        con.executaSelect(sSql);
        
        lRes=con.resultset;        
        System.out.println(lRes);
        System.out.println(sSql);
        try 
        {           
            while (lRes.next())
            {
                 NOME=lRes.getString("NOME");
                 TELEFONE=lRes.getString("TELEFONE");
                 TELEFONECELULAR=lRes.getString("TEL_CELULAR");
                 
                 out.println(NOME+";"+TELEFONE+";"+TELEFONECELULAR+";");
                 
     
                 try {
                        Thread.sleep(5);
                    } catch (InterruptedException e) {
                    }
                    i++;
                    Progresso.setValue(i); 
                 
            }            
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(Agenda.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        con.desconecta();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Agenda.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            out.println(";");
            out.println("USUARIO DO SISTEMA;"+usuario+";");
            out.close();    
    InOut.MsgDeInformacao(null, "Arquivo Salvo!");  
    }//GEN-LAST:event_jMenuItem2MousePressed
    }
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
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Agenda().setVisible(true);
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AtualizaButton;
    private javax.swing.ButtonGroup Grupo;
    private javax.swing.JLabel Id;
    private javax.swing.JButton LimpaButton;
    private javax.swing.JRadioButton Membro;
    private javax.swing.JRadioButton NaoMembro;
    private javax.swing.JTextField Nome;
    private javax.swing.JTextField Pesquisa;
    private javax.swing.JButton PesquisaButton;
    private javax.swing.JProgressBar Progresso;
    private javax.swing.JButton SalvarButton;
    private javax.swing.JTable TabAgenda;
    private javax.swing.JTextField Tel1;
    private javax.swing.JTextField Tel2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void LimpaCampos() {
     Nome.setText("");   
     Tel1.setText("");   
     Tel2.setText("");
     Id.setText("");
     
     Pesquisa.setEditable(false);
     Pesquisa.setText("Pesquise o Nome Aqui!!!");
     Pesquisa.setBackground(Color.CYAN);
     Pesquisa.setForeground(Color.red);
     
     LimpaButton.setVisible(false);
     AtualizaButton.setVisible(false);
     SalvarButton.setVisible(false);
     
     Nome.setEditable(true);
     
     NaoMembro.setSelected(true);
     
     PesquisaButton.setVisible(false);
     
     TabAgenda.setVisible(false);
     Progresso.setValue(0);
    }

    private void PopulaTabela() {
        DefaultTableModel modelo1 = (DefaultTableModel) TabAgenda.getModel();
        int i=0,recebeProgresso;
        recebeProgresso = 0;
        con=new ConectaBanco();
        String sSql,contador=new String();
        
        
        if(Membro.isSelected()){
        try {
        
         sSql="SELECT NOME,telefone,tel_celular FROM MEMBROS WHERE NOME LIKE '%"+Pesquisa.getText()+"%' order by nome;";
         contador="SELECT NOME,Count(*) as contador FROM MEMBROS WHERE NOME LIKE '%"+Pesquisa.getText()+"%';";
        con.conecta();
         if(!con.conecta())
        {
            InOut.MsgDeErro(null,"Erro ao conectar");
            return;            
        }
   // Iniciar contador para barra de progresso    
         con.executaSelect(contador);       
        lRes=con.resultset;        
        try {
            while (lRes.next()){
                   recebeProgresso=Integer.parseInt( lRes.getString("contador"));
            }
            } catch (SQLException ex) {
            InOut.MsgDeErro(null, contador);
        }
        System.out.println(recebeProgresso);
        Progresso.setMaximum(recebeProgresso);
        Progresso.setMinimum(0);
   //*****************************************      
         con.executaSelect(sSql);        
        System.out.println(contador);
        lRes = con.resultset;      
        System.out.println(lRes);
            modelo1.setRowCount(0);
            while (lRes.next()) {
                modelo1.addRow(new Object[]{
                            lRes.getString("NOME"),
                            lRes.getString("TELEFONE"),
                            lRes.getString("TEL_CELULAR")
                           });
                try {
                    Thread.sleep(5);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Agenda.class.getName()).log(Level.SEVERE, null, ex);
                }
                i++;
                Progresso.setValue(i);
                
            }
            TabAgenda.setModel(modelo1);
        } catch (SQLException ex) {

            InOut.MsgDeErro(null, "ERRO AO PESQUISAR");
        }
        con.desconecta(); 
        InOut.MsgDeInformacao(null, "Pesquisa realizada com sucesso!");
        Progresso.setValue(0);
    }else{
       try {
         sSql="SELECT NOME,TELEFONE,TEL_CELULAR FROM AGENDA_EXTRA WHERE NOME LIKE '%"+Pesquisa.getText()+"%' order by nome;";
         contador="SELECT NOME,Count(*) as contador FROM AGENDA_EXTRA WHERE NOME LIKE '%"+Pesquisa.getText()+"%';";
        con.conecta();
         if(!con.conecta())
        {
            InOut.MsgDeErro(null,"Erro ao conectar");
            return;            
        }
         
   // Iniciar contador para barra de progresso    
        con.executaSelect(contador);       
        lRes=con.resultset;        
        try {
            while (lRes.next()){
                   recebeProgresso=Integer.parseInt( lRes.getString("contador"));
            }
            } catch (SQLException ex) {
            InOut.MsgDeErro(null, contador);
        }
        System.out.println(recebeProgresso);
        Progresso.setMaximum(recebeProgresso);
        Progresso.setMinimum(0);
   //***************************************** 
         
        con.executaSelect(sSql); 
        System.out.println(contador);
        lRes = con.resultset;      
        System.out.println(lRes);
            modelo1.setRowCount(0);
            while (lRes.next()) {
                modelo1.addRow(new Object[]{
                            lRes.getString("NOME"),
                            lRes.getString("TELEFONE"),
                            lRes.getString("TEL_CELULAR") 
                           });
               try {
                   Thread.sleep(5);
               } catch (InterruptedException ex) {
                   Logger.getLogger(Agenda.class.getName()).log(Level.SEVERE, null, ex);
               }
               i++;
               Progresso.setValue(i);
                
                
                
            }
            TabAgenda.setModel(modelo1);
        } catch (SQLException ex) {

            InOut.MsgDeErro(null, "ERRO AO PESQUISAR");
        }
        con.desconecta();
        InOut.MsgDeInformacao(null, "Pesquisa realizada com sucesso!");
        Progresso.setValue(0);
    }
    
        
        
        
        
        
        
    }

    

   
 
}