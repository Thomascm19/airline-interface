/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkgfinal;

import java.time.Instant;
import java.util.Date;
import java.util.LinkedList;
import javax.swing.JOptionPane;
/**
 *
 * @author Thomas-CM
 */
public class InterfazVuelos extends javax.swing.JFrame {

    InterfazVuelos graficavuelos;
    Vuelos vuelo;
    LinkedList<Vuelos> vuelos;
    int contador = 0;
    public InterfazVuelos() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        comboNumeroNiños = new javax.swing.JComboBox<>();
        comboNumeroBebes = new javax.swing.JComboBox<>();
        txtCiudad_origen = new javax.swing.JTextField();
        txtCiudad_destino = new javax.swing.JTextField();
        btbReservar = new javax.swing.JButton();
        btbVolver = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtcc = new javax.swing.JTextField();
        txtPagar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        comboSillasAdultos = new javax.swing.JComboBox<>();
        comboSillasNiños = new javax.swing.JComboBox<>();
        comboSillasBebes = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnAnterior = new javax.swing.JButton();
        radioViajeIda = new javax.swing.JRadioButton();
        radioViajeIda_Regreso = new javax.swing.JRadioButton();
        jdcFecha_ida = new com.toedter.calendar.JDateChooser();
        jdcFecha_regreso = new com.toedter.calendar.JDateChooser();
        comboNumeroAdutos = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Selecciona tu viaje");

        jLabel3.setText("Ciudad de origen");

        jLabel4.setText("Ciudad de destino");

        jLabel5.setText("Fecha de ida");

        jLabel7.setText("Fecha de regreso");

        jLabel8.setText("Numero de pasajeros");

        jLabel9.setText("Adultos");

        jLabel10.setText("Niños");

        jLabel11.setText("Bebes");

        comboNumeroNiños.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8" }));

        comboNumeroBebes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));

        txtCiudad_origen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCiudad_origenActionPerformed(evt);
            }
        });

        txtCiudad_destino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCiudad_destinoActionPerformed(evt);
            }
        });

        btbReservar.setText("Reservar");
        btbReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbReservarActionPerformed(evt);
            }
        });

        btbVolver.setText("Volver");
        btbVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbVolverActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar reserva");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel12.setText("Digite su numero de identificacion");

        txtcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtccActionPerformed(evt);
            }
        });

        txtPagar.setText("Pagar reserva");
        txtPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPagarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSiguiente.setText("Siguiente reserva");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        jLabel13.setText("Seleccione su asiento(Adulto)");

        comboSillasAdultos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));

        comboSillasNiños.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));

        comboSillasBebes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));

        jLabel14.setText("Seleccione su asiento(Niño)");

        jLabel15.setText("Seleccione su asiento (Bebes)");

        btnAnterior.setText("Reserva anterior ");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        radioViajeIda.setText("Viaje de ida");
        radioViajeIda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioViajeIdaActionPerformed(evt);
            }
        });

        radioViajeIda_Regreso.setText("Viaje de ida y de regreso ");
        radioViajeIda_Regreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioViajeIda_RegresoActionPerformed(evt);
            }
        });

        comboNumeroAdutos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel3)
                                .addGap(101, 101, 101)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(txtCiudad_origen, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(109, 109, 109)
                                .addComponent(txtCiudad_destino, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radioViajeIda)
                                .addGap(99, 99, 99)
                                .addComponent(radioViajeIda_Regreso))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel5))
                                    .addComponent(jdcFecha_ida, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(76, 76, 76)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jdcFecha_regreso, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))))
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(6, 6, 6)
                                .addComponent(jLabel10)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel11))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(comboNumeroAdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboNumeroNiños, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(comboNumeroBebes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(273, 273, 273))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13)
                                .addComponent(comboSillasAdultos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(49, 49, 49)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel12)
                                .addComponent(txtcc, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jLabel14)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(comboSillasNiños, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(180, 180, 180)
                            .addComponent(btbReservar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel15)
                        .addComponent(comboSillasBebes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(130, 130, 130)
                            .addComponent(btnCancelar)
                            .addGap(115, 115, 115)
                            .addComponent(btbVolver))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnAnterior)
                                    .addGap(43, 43, 43)
                                    .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtPagar)
                                    .addGap(59, 59, 59)
                                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCiudad_origen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCiudad_destino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioViajeIda)
                    .addComponent(radioViajeIda_Regreso))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdcFecha_ida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdcFecha_regreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(comboNumeroNiños, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboNumeroAdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(comboNumeroBebes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel13)
                        .addGap(6, 6, 6)
                        .addComponent(comboSillasAdultos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(6, 6, 6)
                        .addComponent(txtcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addComponent(jLabel14)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboSillasNiños, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btbReservar))
                .addGap(7, 7, 7)
                .addComponent(jLabel15)
                .addGap(6, 6, 6)
                .addComponent(comboSillasBebes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSiguiente)
                    .addComponent(btnAnterior))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPagar)
                    .addComponent(btnBuscar))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelar)
                    .addComponent(btbVolver))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCiudad_origenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCiudad_origenActionPerformed

    }//GEN-LAST:event_txtCiudad_origenActionPerformed

    private void txtCiudad_destinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCiudad_destinoActionPerformed
        // TODO add your handling code here
    }//GEN-LAST:event_txtCiudad_destinoActionPerformed

    private void btbReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbReservarActionPerformed
        String Ciudad_origen = txtCiudad_origen.getText();
        String Ciudad_destino = txtCiudad_destino.getText();
        Date Fecha_ida = jdcFecha_ida.getDate();
        Date Fecha_regreso = jdcFecha_regreso.getDate();
        int Numero_adultos = Integer.parseInt(comboNumeroAdutos.getItemAt(comboNumeroAdutos.getSelectedIndex()));
        int Numero_niños = Integer.parseInt(comboNumeroNiños.getItemAt(comboNumeroNiños.getSelectedIndex()));
        int Numero_bebes = Integer.parseInt(comboNumeroBebes.getItemAt(comboNumeroBebes.getSelectedIndex()));
        int Numero_SillasA = Integer.parseInt(comboSillasAdultos.getItemAt(comboSillasAdultos.getSelectedIndex()));
        int Numero_SillasN = Integer.parseInt(comboSillasNiños.getItemAt(comboSillasNiños.getSelectedIndex()));
        int Numero_SillasB = Integer.parseInt(comboSillasBebes.getItemAt(comboSillasBebes.getSelectedIndex()));
        String cc = txtcc.getText();

        String Ida_vuelta = "";
        if(radioViajeIda.isSelected()){
            Ida_vuelta = radioViajeIda.getText();

        }else if(radioViajeIda_Regreso.isSelected()){
            Ida_vuelta = radioViajeIda_Regreso.getText();

        }

        vuelos.add(new Vuelos(Ciudad_destino, Ciudad_origen, Fecha_regreso, Fecha_ida, Numero_adultos, Numero_niños, Numero_bebes, cc, Numero_SillasA, Numero_SillasB, Numero_SillasN,Ida_vuelta));

        JOptionPane.showMessageDialog(this, "Reserva guardada: " + vuelos.size());
        contador = 0;
        Limpiar();

    }//GEN-LAST:event_btbReservarActionPerformed

    private void btbVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbVolverActionPerformed
        InterfazClientes obj = new InterfazClientes();
        obj.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btbVolverActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String ccBuscar = JOptionPane.showInputDialog("Ingrese la Cedula que desea buscar");

        if (ccBuscar != "") {
            for (int i = 0; i < vuelos.size(); i++) {
                vuelo = vuelos.get(i);

                if (vuelo.getcc().equals(ccBuscar)) {
                    txtCiudad_destino.setText(vuelo.getCiudad_destino());
                    txtCiudad_origen.setText(vuelo.getCuidad_origen());
                    jdcFecha_ida.setDate(vuelo.getFecha_ida());
                    jdcFecha_regreso.setDate(vuelo.getFecha_regreso());
                    comboNumeroAdutos.setSelectedIndex(vuelo.getNumero_Adultos());
                    comboNumeroNiños.setSelectedIndex(vuelo.getNumero_Niños());
                    comboNumeroBebes.setSelectedIndex(vuelo.getNumero_Bebes());
                    comboSillasAdultos.setSelectedIndex(vuelo.getNumero_sillasA());
                    comboSillasNiños.setSelectedIndex(vuelo.getNumero_sillasN());
                    comboSillasBebes.setSelectedIndex(vuelo.getNumero_sillasB());
                    txtcc.setText(vuelo.getcc());
                }
            }
        } else {
            JOptionPane.showInputDialog("Elemento invalido");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtccActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtccActionPerformed

    private void txtPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPagarActionPerformed

        InterfazPago obj = new InterfazPago();
        obj.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_txtPagarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        vuelos.remove(vuelo);

        JOptionPane.showMessageDialog(this, "La reserva ha sido eliminada");
        contador = 0;
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        if (contador < vuelos.size()) {
            vuelo = vuelos.get(contador);

            txtCiudad_destino.setText(vuelo.getCiudad_destino());
            txtCiudad_origen.setText(vuelo.getCuidad_origen());
            jdcFecha_ida.setDate(vuelo.getFecha_ida());
            jdcFecha_regreso.setDate(vuelo.getFecha_regreso());
            comboNumeroAdutos.setSelectedIndex(vuelo.getNumero_Adultos());
            comboNumeroNiños.setSelectedIndex(vuelo.getNumero_Niños());
            comboNumeroBebes.setSelectedIndex(vuelo.getNumero_Bebes());
            comboSillasAdultos.setSelectedIndex(vuelo.getNumero_sillasA());
            comboSillasNiños.setSelectedIndex(vuelo.getNumero_sillasN());
            comboSillasBebes.setSelectedIndex(vuelo.getNumero_sillasB());
            txtcc.setText(vuelo.getcc());

            contador++;
    }//GEN-LAST:event_btnSiguienteActionPerformed
    }
    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        if (contador >= -1) {
            vuelo = vuelos.get(contador);

            txtCiudad_destino.setText(vuelo.getCiudad_destino());
            txtCiudad_origen.setText(vuelo.getCuidad_origen());
            jdcFecha_ida.setDate(vuelo.getFecha_ida());
            jdcFecha_regreso.setDate(vuelo.getFecha_regreso());
            comboNumeroAdutos.setSelectedIndex(vuelo.getNumero_Adultos());
            comboNumeroNiños.setSelectedIndex(vuelo.getNumero_Niños());
            comboNumeroBebes.setSelectedIndex(vuelo.getNumero_Bebes());
            comboSillasAdultos.setSelectedIndex(vuelo.getNumero_sillasA());
            comboSillasNiños.setSelectedIndex(vuelo.getNumero_sillasN());
            comboSillasBebes.setSelectedIndex(vuelo.getNumero_sillasB());
            txtcc.setText(vuelo.getcc());

            contador--;
        }
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void radioViajeIdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioViajeIdaActionPerformed
        String Ida_vuelta = "";
        if(radioViajeIda.isSelected()){
            Ida_vuelta = radioViajeIda.getText();
            this.jdcFecha_ida.setVisible(true);

        }else if(radioViajeIda_Regreso.isSelected()){
            Ida_vuelta = radioViajeIda_Regreso.getText();
            this.jdcFecha_regreso.setVisible(true);
            this.jdcFecha_ida.setVisible(true);

        }

    }//GEN-LAST:event_radioViajeIdaActionPerformed
 public void Limpiar() {
        txtCiudad_destino.setText("");
        txtCiudad_origen.setText("");
        txtcc.setText("");
        jdcFecha_ida.setDate(Date.from(Instant.now()));
        jdcFecha_regreso.setDate(Date.from(Instant.now()));
        comboNumeroAdutos.setSelectedIndex(0);
        comboNumeroNiños.setSelectedIndex(0);
        comboNumeroBebes.setSelectedIndex(0);
        comboSillasAdultos.setSelectedIndex(0);
        comboSillasNiños.setSelectedIndex(0);
        comboSillasBebes.setSelectedIndex(0);
        txtcc.setText("");

    }
    private void radioViajeIda_RegresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioViajeIda_RegresoActionPerformed
        String Ida_vuelta = "";
        if(radioViajeIda.isSelected()){
            Ida_vuelta = radioViajeIda.getText();
            this.jdcFecha_ida.setVisible(true);

        }else if(radioViajeIda_Regreso.isSelected()){
            Ida_vuelta = radioViajeIda_Regreso.getText();
            this.jdcFecha_regreso.setVisible(true);
            this.jdcFecha_ida.setVisible(true);
        }
    }//GEN-LAST:event_radioViajeIda_RegresoActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazVuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazVuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazVuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazVuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazVuelos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbReservar;
    private javax.swing.JButton btbVolver;
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JComboBox<String> comboNumeroAdutos;
    private javax.swing.JComboBox<String> comboNumeroBebes;
    private javax.swing.JComboBox<String> comboNumeroNiños;
    private javax.swing.JComboBox<String> comboSillasAdultos;
    private javax.swing.JComboBox<String> comboSillasBebes;
    private javax.swing.JComboBox<String> comboSillasNiños;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private com.toedter.calendar.JDateChooser jdcFecha_ida;
    private com.toedter.calendar.JDateChooser jdcFecha_regreso;
    private javax.swing.JRadioButton radioViajeIda;
    private javax.swing.JRadioButton radioViajeIda_Regreso;
    private javax.swing.JTextField txtCiudad_destino;
    private javax.swing.JTextField txtCiudad_origen;
    private javax.swing.JButton txtPagar;
    private javax.swing.JTextField txtcc;
    // End of variables declaration//GEN-END:variables

    private static class vuelos {

        private static void add(Vuelos vuelos) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public vuelos() {
        }
    }
}
