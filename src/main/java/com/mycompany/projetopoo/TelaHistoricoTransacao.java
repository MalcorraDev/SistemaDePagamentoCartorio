package com.mycompany.projetopoo;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class TelaHistoricoTransacao extends javax.swing.JFrame {

    public TelaHistoricoTransacao() {
        initComponents();
        carregarTransacoes();
        SistemaDePagamento sistema = SistemaDePagamento.getInstancia();
        atualizarTabela(sistema);
     
        
    }

    private void atualizarTabela(SistemaDePagamento sistema) {
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) jTableHistorico.getModel();
        model.setRowCount(0); // limpa a tabela

        double total = 0.0;

        for (Transacao t : sistema.getTransacoes()) {
            model.addRow(new Object[]{
                t.getCliente().getNome(),
                t.getservico().getDescricao(),
                String.format("R$ %.2f", t.getvalor()),
                t.getdata()
            });
            total += t.getvalor();
        }
        
        LabelSaldo.setText("Saldo total: R$ " + String.format("%.2f", total));
    }

    private void carregarTransacoes() {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TituloHistorico = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableHistorico = new javax.swing.JTable();
        LabelSaldo = new javax.swing.JLabel();
        BotaoVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TituloHistorico.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TituloHistorico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TituloHistorico.setText("Historico De Transação");

        jTableHistorico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cliente", "Serviço", "Valor (R$)", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableHistorico);

        LabelSaldo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LabelSaldo.setForeground(new java.awt.Color(0, 80, 0));
        LabelSaldo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelSaldo.setText("Saldo total: R$ 0.00");

        BotaoVoltar.setText("Voltar");
        BotaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(TituloHistorico)
                        .addGap(87, 87, 87))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(LabelSaldo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(69, 69, 69))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(TituloHistorico)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelSaldo)
                    .addComponent(BotaoVoltar))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoVoltarActionPerformed
        TelaPrincipal tela = new TelaPrincipal();
        tela.setVisible(true);
        tela.setLocationRelativeTo(null);
        this.dispose();
        tela.dispose();
    }//GEN-LAST:event_BotaoVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaHistoricoTransacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaHistoricoTransacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaHistoricoTransacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaHistoricoTransacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaHistoricoTransacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoVoltar;
    private javax.swing.JLabel LabelSaldo;
    private javax.swing.JLabel TituloHistorico;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableHistorico;
    // End of variables declaration//GEN-END:variables
}
