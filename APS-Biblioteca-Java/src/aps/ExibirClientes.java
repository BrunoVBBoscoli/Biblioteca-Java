/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aps;
import biblioteca_eletronica.Cliente;
import biblioteca_eletronica.Endereco;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yuri-
 */
public class ExibirClientes extends javax.swing.JFrame {

    /**
     * Creates new form ExibirClientes
     */
    public ExibirClientes() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane21 = new javax.swing.JScrollPane();
        JTT = new javax.swing.JTable();
        btnatualiza = new javax.swing.JButton();
        btnex = new javax.swing.JButton();
        txtpesquisa = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnbusca = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtsob = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtdn = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        txtcpf = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        txtel = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        txtsit = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtrua = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtbairro = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtn = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtcom = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtcep = new javax.swing.JFormattedTextField();
        txtcit = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtuf = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        txtnome = new javax.swing.JTextField();
        btnexibir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        JTT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod", "Nome", "Sobrenome", "Nascimento", "CPF", "Telefone", "Situação", "Rua", "Bairro", "Numero", "Complemento", "CEP", "Cidade", "UF"
            }
        ));
        JTT.setOpaque(false);
        JTT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTTMouseClicked(evt);
            }
        });
        jScrollPane21.setViewportView(JTT);

        btnatualiza.setText("Atualizar");
        btnatualiza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnatualizaActionPerformed(evt);
            }
        });

        btnex.setText("Excluir");
        btnex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexActionPerformed(evt);
            }
        });

        jLabel1.setText("Pesquisa:");

        btnbusca.setText("Buscar");
        btnbusca.setMaximumSize(new java.awt.Dimension(581, 521));
        btnbusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscaActionPerformed(evt);
            }
        });

        jLabel3.setText("Nome");

        jLabel4.setText("Sobrenome");

        try {
            txtdn.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel5.setText("Nascimento");

        try {
            txtcpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel6.setText("CPF");

        try {
            txtel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel7.setText("Telefone");

        txtsit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione>", "Pendente", "Não Pendente" }));

        jLabel8.setText("Situação");

        jLabel9.setText("Rua");

        jLabel10.setText("Bairro");

        jLabel11.setText("Número");

        jLabel12.setText("Complemento");

        jLabel13.setText("CEP");

        try {
            txtcep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel14.setText("Cidade");

        txtuf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione>", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "PO" }));

        jLabel15.setText("UF");

        btnexibir.setText("Exibir");
        btnexibir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexibirActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Editar Cadastro");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnome)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtsob, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcpf, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(txtsit, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(126, 126, 126))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(txtrua, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 163, Short.MAX_VALUE))
                            .addComponent(txtbairro))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcom, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(txtcep, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(txtcit, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel15)
                            .addComponent(txtuf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(126, 126, 126))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane21)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtpesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnbusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addComponent(btnatualiza)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnexibir, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnex, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btnbusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnex)
                    .addComponent(btnexibir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10)
                                .addComponent(jLabel9))
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtrua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtcep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtuf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtcit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtcom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(btnatualiza)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexActionPerformed
        
        txtnome.setText("");
        txtsob.setText("");
        txtdn.setText("");
        txtcpf.setText("");
        txtel.setText("");
        txtrua.setText("");
        txtbairro.setText("");
        txtn.setText("");
        txtcom.setText("");
        txtcep.setText("");
        txtcit.setText("");
        
        Object obj = JTT.getValueAt(JTT.getSelectedRow(), 0);
        Cliente.excluir_cliente((String) obj);
        System.out.println(obj);
        if (JTT.getSelectedRow() != -1) {
        ((DefaultTableModel) JTT.getModel()).removeRow(JTT.getSelectedRow());
        JOptionPane.showMessageDialog(null, "Cliente Excluido com sucesso!");
        }
        else{
            JOptionPane.showMessageDialog(null, "Selecione um Cliente para Excluir!");
        }
                
    }//GEN-LAST:event_btnexActionPerformed

    private void btnatualizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatualizaActionPerformed
        if (JTT.getSelectedRow() != -1) {
        
            JTT.setValueAt(txtnome.getText(), JTT.getSelectedRow(), 1);
            JTT.setValueAt(txtsob.getText(), JTT.getSelectedRow(), 2);
            JTT.setValueAt(txtdn.getText(), JTT.getSelectedRow(), 3);
            JTT.setValueAt(txtcpf.getText(), JTT.getSelectedRow(), 4);
            JTT.setValueAt(txtel.getText(), JTT.getSelectedRow(), 5);
            JTT.setValueAt(txtsit.getSelectedItem(), JTT.getSelectedRow(), 6);
            JTT.setValueAt(txtrua.getText(), JTT.getSelectedRow(), 7);
            JTT.setValueAt(txtbairro.getText(), JTT.getSelectedRow(), 8);
            JTT.setValueAt(txtn.getText(), JTT.getSelectedRow(), 9);
            JTT.setValueAt(txtcom.getText(), JTT.getSelectedRow(), 10);
            JTT.setValueAt(txtcep.getText(), JTT.getSelectedRow(), 11);
            JTT.setValueAt(txtcit.getText(), JTT.getSelectedRow(), 12);
            JTT.setValueAt(txtuf.getSelectedItem(), JTT.getSelectedRow(), 13);
        }

        Object obj = JTT.getValueAt(JTT.getSelectedRow(), 0);
        
        Cliente.editar_cliente((String)obj, txtnome.getText(), txtsob.getText(),
        txtcpf.getText(), txtdn.getText(), txtel.getText(), (String)txtsit.getSelectedItem(), txtrua.getText(),
        txtn.getText(), txtbairro.getText(), txtcom.getText(), txtcep.getText(), 
        txtcit.getText(), (String)txtuf.getSelectedItem());
        
    }//GEN-LAST:event_btnatualizaActionPerformed

    private void JTTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTTMouseClicked
        txtnome.setText(JTT.getValueAt(JTT.getSelectedRow(), 1).toString());
        txtsob.setText(JTT.getValueAt(JTT.getSelectedRow(), 2).toString());
        txtdn.setText(JTT.getValueAt(JTT.getSelectedRow(), 3).toString());
        txtcpf.setText(JTT.getValueAt(JTT.getSelectedRow(), 4).toString());
        txtel.setText(JTT.getValueAt(JTT.getSelectedRow(), 5).toString());
        txtsit.setSelectedItem(JTT.getValueAt(JTT.getSelectedRow(), 6).toString());
        txtrua.setText(JTT.getValueAt(JTT.getSelectedRow(), 7).toString());
        txtbairro.setText(JTT.getValueAt(JTT.getSelectedRow(), 8).toString());
        txtn.setText(JTT.getValueAt(JTT.getSelectedRow(), 9).toString());
        txtcom.setText(JTT.getValueAt(JTT.getSelectedRow(), 10).toString());
        txtcep.setText(JTT.getValueAt(JTT.getSelectedRow(), 11).toString());
        txtcit.setText(JTT.getValueAt(JTT.getSelectedRow(), 12).toString());
        txtuf.setSelectedItem(JTT.getValueAt(JTT.getSelectedRow(), 13).toString());
    }//GEN-LAST:event_JTTMouseClicked

    private void btnexibirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexibirActionPerformed
    DefaultTableModel dtmClientes = (DefaultTableModel) JTT.getModel();
    dtmClientes.getDataVector().clear();
    
    for (int i = 0; i < Cliente.getClientes().size(); i++) {
    // Dados Pessoais
    String cod_cliente = Cliente.getClientes().get(i).getCod_cliente();
    String nome_cliente = Cliente.getClientes().get(i).getNome_cliente();
    String sobrenome = Cliente.getClientes().get(i).getSobrenome();
    String dt_nascimento = Cliente.getClientes().get(i).getDt_nascimento();
    String cpf = Cliente.getClientes().get(i).getCpf();
    String telefone = Cliente.getClientes().get(i).getTelefone();
    String situacao = Cliente.getClientes().get(i).getSituacao();
    //Endereço
    String rua = Cliente.getClientes().get(i).getEndereco().getRua();
    String bairro = Cliente.getClientes().get(i).getEndereco().getBairro();
    String numero_endereco = Cliente.getClientes().get(i).getEndereco().getNumero_endereco();
    String complemento = Cliente.getClientes().get(i).getEndereco().getComplemento();
    String cep = Cliente.getClientes().get(i).getEndereco().getCep();
    String cidade = Cliente.getClientes().get(i).getEndereco().getCidade();
    String uf = Cliente.getClientes().get(i).getEndereco().getUf();


    Object[] dados = {cod_cliente, nome_cliente, sobrenome, dt_nascimento, cpf, telefone, 
    situacao, rua, bairro, numero_endereco, complemento, cep, cidade, uf};
    
    dtmClientes.addRow(dados);

}
    }//GEN-LAST:event_btnexibirActionPerformed

    private void btnbuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscaActionPerformed
        DefaultTableModel dtmCliente = (DefaultTableModel) JTT.getModel();
        dtmCliente.getDataVector().removeAllElements();
        
        for (int i = 0; i < Cliente.getClientes().size(); i++) {            
            if (txtpesquisa.getText().equals(Cliente.getClientes().get(i).getCod_cliente())) {               
                String cod_cliente = Cliente.getClientes().get(i).getCod_cliente();
                String nome_cliente = Cliente.getClientes().get(i).getNome_cliente();
                String sobrenome = Cliente.getClientes().get(i).getSobrenome();
                String dt_nascimento = Cliente.getClientes().get(i).getDt_nascimento();
                String cpf = Cliente.getClientes().get(i).getCpf();
                String telefone = Cliente.getClientes().get(i).getTelefone();
                String situacao = Cliente.getClientes().get(i).getSituacao();
                String rua = Cliente.getClientes().get(i).getEndereco().getRua();
                String bairro = Cliente.getClientes().get(i).getEndereco().getBairro();
                String numero_endereco = Cliente.getClientes().get(i).getEndereco().getNumero_endereco();
                String complemento = Cliente.getClientes().get(i).getEndereco().getComplemento();
                String cep = Cliente.getClientes().get(i).getEndereco().getCep();
                String cidade = Cliente.getClientes().get(i).getEndereco().getCidade();
                String uf = Cliente.getClientes().get(i).getEndereco().getUf();
  
                Object[] dados = {cod_cliente, nome_cliente, sobrenome, dt_nascimento, cpf, telefone, 
                situacao, rua, bairro, numero_endereco, complemento, cep, cidade, uf};
                
                dtmCliente.addRow(dados);
                
            }
         }
    }//GEN-LAST:event_btnbuscaActionPerformed

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
            java.util.logging.Logger.getLogger(ExibirClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExibirClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExibirClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExibirClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExibirClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTT;
    private javax.swing.JButton btnatualiza;
    private javax.swing.JButton btnbusca;
    private javax.swing.JButton btnex;
    private javax.swing.JButton btnexibir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtbairro;
    private javax.swing.JFormattedTextField txtcep;
    private javax.swing.JTextField txtcit;
    private javax.swing.JTextField txtcom;
    private javax.swing.JFormattedTextField txtcpf;
    private javax.swing.JFormattedTextField txtdn;
    private javax.swing.JFormattedTextField txtel;
    private javax.swing.JTextField txtn;
    private javax.swing.JTextField txtnome;
    private javax.swing.JTextField txtpesquisa;
    private javax.swing.JTextField txtrua;
    private javax.swing.JComboBox<String> txtsit;
    private javax.swing.JTextField txtsob;
    private javax.swing.JComboBox<String> txtuf;
    // End of variables declaration//GEN-END:variables
}
