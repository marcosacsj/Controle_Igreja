/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tesouraria;

import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import mascaras.MascaraValor;
import utilitarios.*;
import sistemaintegrado.*;

/**
 *
 * @author marcos.junior
 */
public class Tesouraria extends javax.swing.JFrame {
    MascaraValor valor1 = new MascaraValor();
    ConectaBanco con;
    public String usuario = Parametros.getsNmUsuas();
    ResultSet lRes;
    
    
    
    
    /**
     * Creates new form TelaPrincipal
     */
    public Tesouraria() {
        super("FINANCEIRO");
        
        initComponents();
         this.setLocationRelativeTo(null);
        Usuario.setText("Usuário do Sistema : "+usuario);
        
        Valor.setDocument(valor1);
        
        DIZIMO.setEnabled(false);
        OFERTA.setEnabled(false);
        OFERTA_EBD.setEnabled(false);
        
        TabMembro.setEnabled(false);
        
        Pesquisa.setEnabled(false);
        PesquisarButton.setEnabled(false);
        
        DescricaoSaida.setEnabled(false);
        
        Dia.setEnabled(false);
        Mes.setEnabled(false);
        Ano.setEnabled(false);
        Valor.setEnabled(false);
        
        SalvarButton.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoLancamento = new javax.swing.ButtonGroup();
        GrupoEntrada = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        Entrada = new javax.swing.JRadioButton();
        Saida = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        Dia = new javax.swing.JComboBox();
        Ano = new javax.swing.JComboBox();
        Mes = new javax.swing.JComboBox();
        Valor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        PainelEntrada = new javax.swing.JPanel();
        DIZIMO = new javax.swing.JRadioButton();
        OFERTA = new javax.swing.JRadioButton();
        OFERTA_EBD = new javax.swing.JRadioButton();
        Pesquisa = new javax.swing.JTextField();
        PesquisarButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabMembro = new javax.swing.JTable();
        Membro = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        DescricaoSaida = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        SalvarButton = new javax.swing.JButton();
        Usuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de Lançamento"));

        GrupoLancamento.add(Entrada);
        Entrada.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Entrada.setText("Entrada");
        Entrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaActionPerformed(evt);
            }
        });

        GrupoLancamento.add(Saida);
        Saida.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Saida.setText("Saída");
        Saida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Entrada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(Saida)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Entrada)
                    .addComponent(Saida)))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Descrição Principal"));

        Dia.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Dia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        Dia.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        Ano.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Ano.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050", "2051", "2052", "2053", "2054", "2055", "2056", "2057", "2058", "2059", "2060", "2061", "2062", "2063", "2064", "2065", "2066", "2067", "2068", "2069", "2070", "2071", "2072", "2073", "2074", "2075", "2076", "2077", "2078", "2079", "2080", "2081", "2082", "2083", "2084", "2085", "2086", "2087", "2088", "2089", "2090", "2091", "2092", "2093", "2094", "2095", "2096", "2097", "2098", "2099", "2100" }));
        Ano.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        Mes.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Mes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "JANEIRO", "FEVEREIRO", "MARCO", "ABRIL", "MAIO", "JUNHO", "JULHO", "AGOSTO", "SETEMBRO", "OUTUBRO", "NOVEMBRO", "DEZEMBRO" }));
        Mes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        Valor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Valor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Valor :");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(Dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Ano, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Valor, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 114, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ano, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(Valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        PainelEntrada.setBorder(javax.swing.BorderFactory.createTitledBorder("Entrada"));

        GrupoEntrada.add(DIZIMO);
        DIZIMO.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        DIZIMO.setText("Dízimo");

        GrupoEntrada.add(OFERTA);
        OFERTA.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        OFERTA.setText("Oferta");

        GrupoEntrada.add(OFERTA_EBD);
        OFERTA_EBD.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        OFERTA_EBD.setText("Oferta EBD");

        Pesquisa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        PesquisarButton.setText("Pesquisar");
        PesquisarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PesquisarButtonMousePressed(evt);
            }
        });

        TabMembro.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        TabMembro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabMembro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabMembroMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabMembro);

        Membro.setEditable(false);
        Membro.setFont(new java.awt.Font("Georgia", 3, 12)); // NOI18N
        Membro.setForeground(new java.awt.Color(0, 0, 255));
        Membro.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        javax.swing.GroupLayout PainelEntradaLayout = new javax.swing.GroupLayout(PainelEntrada);
        PainelEntrada.setLayout(PainelEntradaLayout);
        PainelEntradaLayout.setHorizontalGroup(
            PainelEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelEntradaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelEntradaLayout.createSequentialGroup()
                        .addGroup(PainelEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PainelEntradaLayout.createSequentialGroup()
                                .addComponent(DIZIMO)
                                .addGap(18, 18, 18)
                                .addComponent(OFERTA)
                                .addGap(18, 18, 18)
                                .addComponent(OFERTA_EBD))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                            .addComponent(Membro))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelEntradaLayout.createSequentialGroup()
                        .addComponent(Pesquisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PesquisarButton)))
                .addContainerGap())
        );
        PainelEntradaLayout.setVerticalGroup(
            PainelEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelEntradaLayout.createSequentialGroup()
                .addGroup(PainelEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DIZIMO)
                    .addComponent(OFERTA)
                    .addComponent(OFERTA_EBD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Membro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PesquisarButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Saída"));

        DescricaoSaida.setColumns(10);
        DescricaoSaida.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        DescricaoSaida.setRows(5);
        jScrollPane2.setViewportView(DescricaoSaida);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        SalvarButton.setText("Salvar");
        SalvarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SalvarButtonMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(SalvarButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SalvarButton)
                .addContainerGap())
        );

        Usuario.setFont(new java.awt.Font("Georgia", 3, 11)); // NOI18N
        Usuario.setForeground(new java.awt.Color(0, 0, 153));
        Usuario.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PainelEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Usuario)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Usuario)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(75, 75, 75))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PainelEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(189, 189, 189)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaActionPerformed
        // TODO add your handling code here:
        DIZIMO.setEnabled(true);
        OFERTA.setEnabled(true);
        OFERTA_EBD.setEnabled(true);
        
        TabMembro.setEnabled(true);
        
        Pesquisa.setEnabled(true);
        PesquisarButton.setEnabled(true);
        
        DescricaoSaida.setEnabled(false);
        
        Dia.setEnabled(true);
        Mes.setEnabled(true);
        Ano.setEnabled(true);
        Valor.setEnabled(true);
        SalvarButton.setEnabled(true);
    }//GEN-LAST:event_EntradaActionPerformed

    private void SaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaidaActionPerformed
        // TODO add your handling code here:
        DIZIMO.setEnabled(false);
        OFERTA.setEnabled(false);
        OFERTA_EBD.setEnabled(false);
        
        TabMembro.setEnabled(false);
        
        Pesquisa.setEnabled(false);
        PesquisarButton.setEnabled(false);
        
        DescricaoSaida.setEnabled(true);
        
        Dia.setEnabled(true);
        Mes.setEnabled(true);
        Ano.setEnabled(true);
        Valor.setEnabled(true);
        
        SalvarButton.setEnabled(true);
        
    }//GEN-LAST:event_SaidaActionPerformed

    private void SalvarButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalvarButtonMousePressed
        // TODO add your handling code here:
        if(Entrada.isSelected())
        {
            if(DIZIMO.isSelected()||OFERTA.isSelected()||OFERTA_EBD.isSelected()||!"".equals(Valor.getText()))
            {
               SalvarLancamento();
            }
            else
            {
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(null, "Reveja os dados", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
        else if(Saida.isSelected())
        {
            if("".equals(DescricaoSaida.getText())||"".equals(Valor.getText()))
            {
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(null, "Reveja os dados", "Erro", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                SalvarLancamento();
            }
        }
    }//GEN-LAST:event_SalvarButtonMousePressed

    private void PesquisarButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PesquisarButtonMousePressed
        // TODO add your handling code here:
        String sSql = new String();
        con=new ConectaBanco();
        
        sSql="SELECT NOME FROM MEMBROS WHERE NOME LIKE'%"+Pesquisa.getText()+ "%'ORDER BY NOME;";
        con.conecta();
        con.executaSelect(sSql);
        //System.out.println("primeiro select"+sSql);       
        populaTabMembros(con.resultset);
        con.desconecta(); 
    }//GEN-LAST:event_PesquisarButtonMousePressed

    private void TabMembroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabMembroMouseClicked
        // TODO add your handling code here:
        int linha=0;
        String sMembro = new String(); 
        
   
    linha=TabMembro.getSelectedRow();
    sMembro = TabMembro.getValueAt(linha, 0).toString();
    // TODO add your handling code here:
        con=new ConectaBanco();
        String sSql=new String();
        
   
        sSql="SELECT NOME FROM MEMBROS WHERE NOME LIKE'%"+sMembro+ "%'ORDER BY NOME;";
        con.conecta();
         if(!con.conecta())
        {
            InOut.MsgDeErro(null,"Erro ao conectar");
            return;            
        }
        con.executaSelect(sSql);
        System.out.println(sMembro);
        lRes=con.resultset;        
        try 
        {           
            while (lRes.next())
            {
                
                 Membro.setText(lRes.getString("NOME").toUpperCase());   
            }            
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(Tesouraria.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        con.desconecta();  
    }//GEN-LAST:event_TabMembroMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Tesouraria.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Tesouraria.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Tesouraria.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Tesouraria.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tesouraria().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Ano;
    private javax.swing.JRadioButton DIZIMO;
    private javax.swing.JTextArea DescricaoSaida;
    private javax.swing.JComboBox Dia;
    private javax.swing.JRadioButton Entrada;
    private javax.swing.ButtonGroup GrupoEntrada;
    private javax.swing.ButtonGroup GrupoLancamento;
    private javax.swing.JTextField Membro;
    private javax.swing.JComboBox Mes;
    private javax.swing.JRadioButton OFERTA;
    private javax.swing.JRadioButton OFERTA_EBD;
    private javax.swing.JPanel PainelEntrada;
    private javax.swing.JTextField Pesquisa;
    private javax.swing.JButton PesquisarButton;
    private javax.swing.JRadioButton Saida;
    private javax.swing.JButton SalvarButton;
    private javax.swing.JTable TabMembro;
    private javax.swing.JLabel Usuario;
    private javax.swing.JTextField Valor;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    private void SalvarLancamento() {
        String sSql = new String();
        String sSql2 = new String();
        con=new ConectaBanco();
        
       
   if(Entrada.isSelected())
   {     
        if(DIZIMO.isSelected())
        {
            sSql="INSERT INTO FINANCEIRO(USUARIO,DATA_DIA,DATA_MES,DATA_ANO,VALOR_ENTRADA,VALOR_SAIDA,DESCRICAO,MEMBRO)"
                + "VALUES ('"+Usuario.getText()+"','"
                +Dia.getSelectedItem()+"','"
                +Mes.getSelectedItem()+"','"
                +Ano.getSelectedItem()+"','"
                +Valor.getText()+"','0','DIZIMO','"+Membro.getText()+"');";
            sSql2="INSERT INTO DIZIMO(NOME,"+Mes.getSelectedItem()+",ano) values ('"+Membro.getText()+"','OK','"+Ano.getSelectedItem()+"')";
            System.out.println(sSql2);
            con.conecta();
            con.executa(sSql2);
            con.desconecta();
        }
        else if(OFERTA.isSelected())
        {
            sSql="INSERT INTO FINANCEIRO(USUARIO,DATA_DIA,DATA_MES,DATA_ANO,VALOR_ENTRADA,VALOR_SAIDA,DESCRICAO)"
                + "VALUES ('"+Usuario.getText()+"','"
                +Dia.getSelectedItem()+"','"
                +Mes.getSelectedItem()+"','"
                +Ano.getSelectedItem()+"','"
                +Valor.getText()+"','0','OFERTA');";
        }
        else if(OFERTA_EBD.isSelected())
        {
            sSql="INSERT INTO FINANCEIRO(USUARIO,DATA_DIA,DATA_MES,DATA_ANO,VALOR_ENTRADA,VALOR_SAIDA,DESCRICAO)"
                + "VALUES ('"+Usuario.getText()+"','"
                +Dia.getSelectedItem()+"','"
                +Mes.getSelectedItem()+"','"
                +Ano.getSelectedItem()+"','"
                +Valor.getText()+"','0','OFERTA_EBD');";
        } 
        
    }
   else if(Saida.isSelected())
   {
       sSql="INSERT INTO FINANCEIRO(USUARIO,DATA_DIA,DATA_MES,DATA_ANO,VALOR_ENTRADA,VALOR_SAIDA,DESCRICAO)"
                + "VALUES ('"+Usuario.getText()+"','"
                +Dia.getSelectedItem()+"','"
                +Mes.getSelectedItem()+"','"
                +Ano.getSelectedItem()+"','0','"
                +Valor.getText()+"','"+DescricaoSaida.getText()+"');";
   }
   System.out.println(sSql);
   con.conecta();
   con.executa(sSql);
   con.desconecta();
}

    private void populaTabMembros(ResultSet res) {
        DefaultTableModel modelo1 = (DefaultTableModel) TabMembro.getModel();
      String sSql = new String();     
      int linha=0;
  
      con=new ConectaBanco();
       
       sSql="SELECT NOME FROM MEMBROS WHERE NOME LIKE'%"+Pesquisa.getText()+ "%'ORDER BY NOME;";
        con.conecta();
        con.executaSelect(sSql);        
        lRes=con.resultset; 
        System.out.println(lRes);
        System.out.println(sSql);
        try {                   
            modelo1.setRowCount(0);
            while (lRes.next()) {
                modelo1.addRow(new Object[]{
                            lRes.getString("NOME")
                           });
            }
            TabMembro.setModel(modelo1);
        } catch (SQLException ex) {
            Logger.getLogger(Tesouraria.class.getName()).log(Level.SEVERE, null, ex);
        }
     con.desconecta();        
    }
}
