/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba;

/**
 *
 * @author User
 */
public class Frame extends javax.swing.JFrame {

    /**
     * Creates new form Frame
     */
    public Frame() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Nilai = new javax.swing.JTextField();
        Nama = new javax.swing.JTextField();
        Absen = new javax.swing.JTextField();
        Mapel = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Hasil = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setText("Hasil Penilaian");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(164, 11, 100, 14);

        jLabel2.setText("Nama Siswa");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 40, 80, 14);

        jLabel3.setText("Absen Siswa");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 80, 80, 14);

        jLabel4.setText("Mata Pelajaran");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 120, 90, 10);

        jLabel5.setText("Data Proses");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 230, 80, 10);

        Nilai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NilaiActionPerformed(evt);
            }
        });
        getContentPane().add(Nilai);
        Nilai.setBounds(160, 160, 160, 30);
        getContentPane().add(Nama);
        Nama.setBounds(160, 40, 160, 30);

        Absen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbsenActionPerformed(evt);
            }
        });
        getContentPane().add(Absen);
        Absen.setBounds(160, 80, 160, 30);
        getContentPane().add(Mapel);
        Mapel.setBounds(160, 120, 160, 30);

        jButton1.setText("Proses");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(160, 200, 80, 20);

        jLabel6.setText("Nilai");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(60, 160, 60, 10);

        Hasil.setColumns(20);
        Hasil.setRows(5);
        jScrollPane1.setViewportView(Hasil);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(160, 230, 260, 120);

        setBounds(0, 0, 475, 445);
    }// </editor-fold>//GEN-END:initComponents

    private void NilaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NilaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NilaiActionPerformed

    private void AbsenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbsenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AbsenActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String nama = Nama.getText();
        int absen = Integer.parseInt(Absen.getText());
        String mapel = Mapel.getText();
        int nilai = Integer.parseInt(Nilai.getText());
        
        if(nilai < 75 ){
            Hasil.append("Nama Siswa :"+nama);
            Hasil.append("\nAbsen Siswa :"+absen);
            Hasil.append("\nMata Pelajaran :"+mapel);
            Hasil.append("\nNilai : "+nilai+" Tidak Lulus");
        }
        else if(nilai > 75 || nilai <= 85){
            Hasil.append("Nama Siswa :"+nama);
            Hasil.append("\nAbsen Siswa :"+absen);
            Hasil.append("\nMata Pelajaran :"+mapel);
            Hasil.append("\nNilai : "+nilai+" Lulus");
        }
        else if(nilai >= 85 || nilai <= 100){
            Hasil.append("Nama Siswa :"+nama);
            Hasil.append("\nAbsen Siswa :"+absen);
            Hasil.append("\nMata Pelajaran :"+mapel);
            Hasil.append("\nNilai : "+nilai+" Sempurna");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Absen;
    private javax.swing.JTextArea Hasil;
    private javax.swing.JTextField Mapel;
    private javax.swing.JTextField Nama;
    private javax.swing.JTextField Nilai;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
