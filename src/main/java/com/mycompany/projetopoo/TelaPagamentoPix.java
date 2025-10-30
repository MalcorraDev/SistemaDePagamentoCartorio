package com.mycompany.projetopoo;

import com.mycompany.projetopoo.dao.TransacaoDAO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.time.LocalDate;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.google.zxing.*;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

public class TelaPagamentoPix extends JFrame {

    private JTextField campoValor;
    private JButton botaoGerarPix;
    private JLabel labelQrCode;
    private JTextArea areaCodigoPix;

    public TelaPagamentoPix() {
        // ❌ Removido o initComponents()
        setTitle("Pagamento PIX");
        setSize(420, 600);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JLabel lblValor = new JLabel("Valor do PIX:");
        lblValor.setBounds(50, 30, 100, 25);
        add(lblValor);

        campoValor = new JTextField();
        campoValor.setBounds(150, 30, 150, 25);
        add(campoValor);

        botaoGerarPix = new JButton("Gerar PIX");
        botaoGerarPix.setBounds(130, 80, 130, 30);
        add(botaoGerarPix);

        areaCodigoPix = new JTextArea();
        areaCodigoPix.setBounds(30, 130, 340, 120);
        areaCodigoPix.setLineWrap(true);
        areaCodigoPix.setWrapStyleWord(true);
        areaCodigoPix.setEditable(false);
        add(areaCodigoPix);

        labelQrCode = new JLabel();
        labelQrCode.setBounds(80, 270, 250, 250);
        add(labelQrCode);

        botaoGerarPix.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                gerarPix();
            }
        });
    }

    private void gerarPix() {
        try {
            double valor = Double.parseDouble(campoValor.getText());

            // Registrar no banco
            TransacaoDAO dao = new TransacaoDAO();
            dao.registrarPix(valor, LocalDate.now());

            // Código Pix simulado
            String codigo = "00020126360014BR.GOV.BCB.PIX0114cartorio@pix.com52040000"
                    + "5303986540" + String.format("%.2f", valor).replace(",", ".")
                    + "5802BR5920Cartorio Municipal6009Santana RS62070503***6304ABCD";

            areaCodigoPix.setText("Código Copia e Cola:\n" + codigo);

            // Gerar QR Code
            BitMatrix matrix = new MultiFormatWriter().encode(codigo, BarcodeFormat.QR_CODE, 250, 250);
            BufferedImage qrImage = MatrixToImageWriter.toBufferedImage(matrix);
            ImageIcon icon = new ImageIcon(qrImage.getScaledInstance(250, 250, Image.SCALE_SMOOTH));
            labelQrCode.setIcon(icon);

            JOptionPane.showMessageDialog(this, "PIX simulado gerado com sucesso!");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao gerar PIX: " + ex.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
