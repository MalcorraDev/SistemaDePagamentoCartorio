package com.mycompany.projetopoo;

import javax.swing.table.DefaultTableModel;

public class TelaHistoricoTransacao extends javax.swing.JFrame {

    public TelaHistoricoTransacao() {
        initComponents();
        carregarTransacoes();
    }

    private void carregarTransacoes() {
        SistemaDePagamento sistema = SistemaDePagamento.getInstancia();

        DefaultTableModel modelo = (DefaultTableModel) TabelaTransacoes.getModel();
        modelo.setRowCount(0); // limpa a tabela

        for (Transacao t : sistema.getTransacoes()) {
            modelo.addRow(new Object[]{
                t.getCliente().getNome(),
                t.getservico().getDescricao(),
                t.getdata(),
                t.getvalor()
            });
        }
    }

    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaTransacoes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        BotaoVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TabelaTransacoes.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Cliente", "Serviço", "Data", "Valor"
                }
        ));
        jScrollPane1.setViewportView(TabelaTransacoes);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 18));
        jLabel1.setText("Histórico de Transações");

        BotaoVoltar.setText("Voltar");
        BotaoVoltar.addActionListener(evt -> {
            TelaPrincipal tela = new TelaPrincipal();
            tela.setVisible(true);
            tela.setLocationRelativeTo(null);
            this.dispose();
        });
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    // End of variables declaration//GEN-END:variables
}
