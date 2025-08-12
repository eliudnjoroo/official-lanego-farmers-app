/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lane;

import java.awt.HeadlessException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class sales extends javax.swing.JFrame {

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        home_Btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        items_BeingSold_tbl = new javax.swing.JTable();
        search_inp = new javax.swing.JTextField();
        no_of_items_inpt = new javax.swing.JTextField();
        clearBtn = new javax.swing.JButton();
        addItem_Btn = new javax.swing.JButton();
        subTotals_lbl = new javax.swing.JLabel();
        subTotal_inpt = new javax.swing.JTextField();
        moneyGiven_lbl = new javax.swing.JLabel();
        change_lbl = new javax.swing.JLabel();
        change_typing_impt = new javax.swing.JTextField();
        change_returned_inpt = new javax.swing.JTextField();
        custno_inpt = new javax.swing.JTextField();
        cust_phone_lbl = new javax.swing.JLabel();
        cancel_Operation_Btn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        items_inDB_Tbl = new javax.swing.JTable();
        search_lbl = new javax.swing.JLabel();
        selectedItem_lbl = new javax.swing.JLabel();
        selectedItem_inpt = new javax.swing.JTextField();
        price_lbl = new javax.swing.JLabel();
        price_input = new javax.swing.JTextField();
        no_of_input_Lbl = new javax.swing.JLabel();
        cashBtn = new javax.swing.JButton();
        mpesaBtn = new javax.swing.JButton();
        creditBtn = new javax.swing.JButton();
        paymentMode_Inpt = new javax.swing.JTextField();
        grandTatoal_lbl = new javax.swing.JLabel();
        grandTotal_inpt = new javax.swing.JTextField();
        completeSale = new javax.swing.JButton();
        next_change_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        itemEdit_inp = new javax.swing.JTextField();
        specEdit_inp = new javax.swing.JTextField();
        quantEdit_inp = new javax.swing.JTextField();
        priceEdit_inp = new javax.swing.JTextField();
        subTotalEdit_inp = new javax.swing.JTextField();
        cancelEdit_btn = new javax.swing.JButton();
        saveEdit_btn = new javax.swing.JButton();
        removeFromList_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("lanego sales sotware");

        home_Btn.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        home_Btn.setText("HOME");
        home_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_BtnActionPerformed(evt);
            }
        });

        items_BeingSold_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "item", "specifics", "quantity", "@ price", "sub total", "id", "hist id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        items_BeingSold_tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                items_BeingSold_tblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(items_BeingSold_tbl);
        if (items_BeingSold_tbl.getColumnModel().getColumnCount() > 0) {
            items_BeingSold_tbl.getColumnModel().getColumn(5).setMaxWidth(400);
            items_BeingSold_tbl.getColumnModel().getColumn(6).setMaxWidth(1);
        }

        search_inp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_inpActionPerformed(evt);
            }
        });
        search_inp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search_inpKeyReleased(evt);
            }
        });

        no_of_items_inpt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no_of_items_inptActionPerformed(evt);
            }
        });

        clearBtn.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        clearBtn.setText("clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        addItem_Btn.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        addItem_Btn.setMnemonic('a');
        addItem_Btn.setText("add item");
        addItem_Btn.setToolTipText("add the selected item to list");
        addItem_Btn.setEnabled(false);
        addItem_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItem_BtnActionPerformed(evt);
            }
        });

        subTotals_lbl.setText("Sub total");

        subTotal_inpt.setEditable(false);
        subTotal_inpt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subTotal_inptActionPerformed(evt);
            }
        });

        moneyGiven_lbl.setText("money given by customer. ");

        change_lbl.setText("change");

        change_typing_impt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                change_typing_imptKeyReleased(evt);
            }
        });

        change_returned_inpt.setEditable(false);
        change_returned_inpt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                change_returned_inptActionPerformed(evt);
            }
        });

        custno_inpt.setText("0");
        custno_inpt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                custno_inptMouseClicked(evt);
            }
        });
        custno_inpt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custno_inptuActionPerformed(evt);
            }
        });

        cust_phone_lbl.setText("customer phone number");

        cancel_Operation_Btn.setText("cancel operation");
        cancel_Operation_Btn.setEnabled(false);
        cancel_Operation_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_Operation_BtnActionPerformed(evt);
            }
        });

        items_inDB_Tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "item", "specifics", "buying price", "selling price", "quant. available", "id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        items_inDB_Tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                items_inDB_TblMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(items_inDB_Tbl);
        if (items_inDB_Tbl.getColumnModel().getColumnCount() > 0) {
            items_inDB_Tbl.getColumnModel().getColumn(5).setPreferredWidth(0);
        }

        search_lbl.setText("search box.");

        selectedItem_lbl.setText("selected item");

        selectedItem_inpt.setEditable(false);
        selectedItem_inpt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectedItem_inptActionPerformed(evt);
            }
        });

        price_lbl.setText("price");

        price_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                price_inputActionPerformed(evt);
            }
        });

        no_of_input_Lbl.setText("number of items.");

        cashBtn.setText("cash");
        cashBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashBtnActionPerformed(evt);
            }
        });

        mpesaBtn.setText("mpesa");
        mpesaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mpesaBtnActionPerformed(evt);
            }
        });

        creditBtn.setText("credit");
        creditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditBtnActionPerformed(evt);
            }
        });

        paymentMode_Inpt.setEditable(false);

        grandTatoal_lbl.setText("grand total");

        grandTotal_inpt.setEditable(false);
        grandTotal_inpt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grandTotal_inptActionPerformed(evt);
            }
        });

        completeSale.setText("complete the sale");
        completeSale.setEnabled(false);
        completeSale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completeSaleActionPerformed(evt);
            }
        });

        next_change_btn.setText("next");
        next_change_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next_change_btnActionPerformed(evt);
            }
        });

        jLabel1.setText("item");

        jLabel2.setText("specifics");

        jLabel3.setText("quantity");

        jLabel4.setText("price");

        jLabel5.setText("subtotal");

        itemEdit_inp.setEditable(false);
        itemEdit_inp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEdit_inpActionPerformed(evt);
            }
        });

        specEdit_inp.setEditable(false);

        quantEdit_inp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                quantEdit_inpKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                quantEdit_inpKeyReleased(evt);
            }
        });

        priceEdit_inp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                priceEdit_inpKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                priceEdit_inpKeyReleased(evt);
            }
        });

        subTotalEdit_inp.setEditable(false);
        subTotalEdit_inp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subTotalEdit_inpActionPerformed(evt);
            }
        });

        cancelEdit_btn.setText("cancel");
        cancelEdit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelEdit_btnActionPerformed(evt);
            }
        });

        saveEdit_btn.setText("save");
        saveEdit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveEdit_btnActionPerformed(evt);
            }
        });

        removeFromList_btn.setText("remove from list");
        removeFromList_btn.setEnabled(false);
        removeFromList_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeFromList_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(price_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(price_input, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(no_of_input_Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(no_of_items_inpt, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(search_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(search_inp, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(home_Btn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(moneyGiven_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(change_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cust_phone_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(subTotals_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(grandTatoal_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(change_typing_impt, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(next_change_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(mpesaBtn)
                            .addGap(20, 20, 20)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(creditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(custno_inpt, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                    .addComponent(change_returned_inpt, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(cashBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(paymentMode_Inpt, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(2, 2, 2))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(115, 115, 115)
                            .addComponent(completeSale, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(subTotal_inpt, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(selectedItem_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(selectedItem_inpt, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(259, 259, 259)
                                .addComponent(addItem_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(grandTotal_inpt, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(cancel_Operation_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(itemEdit_inp, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(specEdit_inp, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(removeFromList_btn)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(quantEdit_inp, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(priceEdit_inp, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(cancelEdit_btn))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(subTotalEdit_inp, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                                        .addComponent(saveEdit_btn))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel_Operation_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(home_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(search_inp, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(search_lbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(selectedItem_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(selectedItem_inpt))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(no_of_items_inpt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(no_of_input_Lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(price_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(price_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clearBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addItem_Btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(subTotal_inpt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(subTotals_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(grandTatoal_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(grandTotal_inpt))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(moneyGiven_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(change_typing_impt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(next_change_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(change_returned_inpt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(change_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(custno_inpt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cust_phone_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeFromList_btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cashBtn)
                    .addComponent(mpesaBtn)
                    .addComponent(creditBtn)
                    .addComponent(paymentMode_Inpt)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(cancelEdit_btn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(completeSale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(itemEdit_inp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(specEdit_inp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantEdit_inp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priceEdit_inp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subTotalEdit_inp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveEdit_btn))
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void home_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home_BtnActionPerformed
        close();
    }//GEN-LAST:event_home_BtnActionPerformed

    private void no_of_items_inptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no_of_items_inptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_no_of_items_inptActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        clear();
        removeFromList_btn.setEnabled(false);
    }//GEN-LAST:event_clearBtnActionPerformed

    private void change_returned_inptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_change_returned_inptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_change_returned_inptActionPerformed

    private void custno_inptuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custno_inptuActionPerformed
        clear2();
        removeFromList_btn.setEnabled(false);// TODO add your handling code here:
    }//GEN-LAST:event_custno_inptuActionPerformed

    private void subTotal_inptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subTotal_inptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subTotal_inptActionPerformed

    private void search_inpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_inpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_inpActionPerformed

    private void price_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_price_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_price_inputActionPerformed

    private void search_inpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_inpKeyReleased
        filterPimary();
    }//GEN-LAST:event_search_inpKeyReleased

    private void items_inDB_TblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_items_inDB_TblMouseClicked
        selectItem();
    }//GEN-LAST:event_items_inDB_TblMouseClicked

    private void cashBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashBtnActionPerformed
        paymentMode_Inpt.setText("cash");
        clear2();
        removeFromList_btn.setEnabled(false);
    }//GEN-LAST:event_cashBtnActionPerformed

    private void creditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditBtnActionPerformed
        paymentMode_Inpt.setText("debt");
        clear2();
        removeFromList_btn.setEnabled(false);
    }//GEN-LAST:event_creditBtnActionPerformed

    private void mpesaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mpesaBtnActionPerformed
        paymentMode_Inpt.setText("mpesa");
        clear2();
        removeFromList_btn.setEnabled(false);
    }//GEN-LAST:event_mpesaBtnActionPerformed

    private void cancel_Operation_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_Operation_BtnActionPerformed
        try {
            cancel_Operation();
        } catch (ClassNotFoundException ex) {
            System.getLogger(sales.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        } catch (SQLException ex) {
            System.getLogger(sales.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }//GEN-LAST:event_cancel_Operation_BtnActionPerformed

    private void grandTotal_inptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grandTotal_inptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grandTotal_inptActionPerformed

    private void next_change_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next_change_btnActionPerformed
        next_change();
    }//GEN-LAST:event_next_change_btnActionPerformed

    private void change_typing_imptKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_change_typing_imptKeyReleased
        checkChange();
    }//GEN-LAST:event_change_typing_imptKeyReleased

    private void selectedItem_inptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectedItem_inptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectedItem_inptActionPerformed

    private void completeSaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completeSaleActionPerformed
        verifyDetails();
    }//GEN-LAST:event_completeSaleActionPerformed

    private void addItem_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItem_BtnActionPerformed
        try {
            confnext();
        } catch (HeadlessException | ClassNotFoundException ex) {
            System.getLogger(sales.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }//GEN-LAST:event_addItem_BtnActionPerformed

    private void itemEdit_inpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEdit_inpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemEdit_inpActionPerformed

    private void items_BeingSold_tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_items_BeingSold_tblMouseClicked
        selectItem2();        // TODO add your handling code here:
    }//GEN-LAST:event_items_BeingSold_tblMouseClicked

    private void cancelEdit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelEdit_btnActionPerformed
        clear2();
        removeFromList_btn.setEnabled(false);
    }//GEN-LAST:event_cancelEdit_btnActionPerformed

    private void saveEdit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveEdit_btnActionPerformed
        try {
            saveEditedItem();// TODO add your handling code here:
        } catch (SQLException | ClassNotFoundException ex) {
            System.getLogger(sales.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }//GEN-LAST:event_saveEdit_btnActionPerformed

    private void custno_inptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_custno_inptMouseClicked
        clear2();
        removeFromList_btn.setEnabled(false);// TODO add your handling code here:
    }//GEN-LAST:event_custno_inptMouseClicked

    private void removeFromList_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeFromList_btnActionPerformed
        try {
            removeFromList();
        } catch (ClassNotFoundException | SQLException ex) {
            System.getLogger(sales.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }//GEN-LAST:event_removeFromList_btnActionPerformed

    private void quantEdit_inpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantEdit_inpKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantEdit_inpKeyPressed

    private void priceEdit_inpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priceEdit_inpKeyPressed
        try {
            int new_quant = Integer.parseInt(quantEdit_inp.getText());
            int new_price = Integer.parseInt(priceEdit_inp.getText());
            subTotalEdit_inp.setText(Integer.toString(new_quant * new_price));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "invalid input!!");
            priceEdit_inp.setText(itemForEdit_price);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_priceEdit_inpKeyPressed

    private void subTotalEdit_inpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subTotalEdit_inpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subTotalEdit_inpActionPerformed

    private void quantEdit_inpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantEdit_inpKeyReleased
        try {
            int new_quant = Integer.parseInt(quantEdit_inp.getText());
            int new_price = Integer.parseInt(priceEdit_inp.getText());
            subTotalEdit_inp.setText(Integer.toString(new_quant * new_price));
        } catch (NumberFormatException ex) {
            if (quantEdit_inp.getText().equals("")) {
                subTotalEdit_inp.setText("0");
                return;
            }
            JOptionPane.showMessageDialog(this, "invalid input!!");
            quantEdit_inp.setText(itemForEdit_quant);
        }     // TODO add your handling code here:
    }//GEN-LAST:event_quantEdit_inpKeyReleased

    private void priceEdit_inpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priceEdit_inpKeyReleased
        try {
            int new_quant = Integer.parseInt(quantEdit_inp.getText());
            int new_price = Integer.parseInt(priceEdit_inp.getText());
            subTotalEdit_inp.setText(Integer.toString(new_quant * new_price));
        } catch (NumberFormatException ex) {
            if (priceEdit_inp.getText().equals("")) {
                subTotalEdit_inp.setText("0");
                return;
            }
            JOptionPane.showMessageDialog(this, "invalid input!!");
            priceEdit_inp.setText(itemForEdit_quant);
        }  // TODO add your handling code here:
    }//GEN-LAST:event_priceEdit_inpKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addItem_Btn;
    private javax.swing.JButton cancelEdit_btn;
    private javax.swing.JButton cancel_Operation_Btn;
    private javax.swing.JButton cashBtn;
    private javax.swing.JLabel change_lbl;
    private javax.swing.JTextField change_returned_inpt;
    private javax.swing.JTextField change_typing_impt;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton completeSale;
    private javax.swing.JButton creditBtn;
    private javax.swing.JLabel cust_phone_lbl;
    private javax.swing.JTextField custno_inpt;
    private javax.swing.JLabel grandTatoal_lbl;
    private javax.swing.JTextField grandTotal_inpt;
    private javax.swing.JButton home_Btn;
    private javax.swing.JTextField itemEdit_inp;
    private javax.swing.JTable items_BeingSold_tbl;
    private javax.swing.JTable items_inDB_Tbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel moneyGiven_lbl;
    private javax.swing.JButton mpesaBtn;
    private javax.swing.JButton next_change_btn;
    private javax.swing.JLabel no_of_input_Lbl;
    private javax.swing.JTextField no_of_items_inpt;
    private javax.swing.JTextField paymentMode_Inpt;
    private javax.swing.JTextField priceEdit_inp;
    private javax.swing.JTextField price_input;
    private javax.swing.JLabel price_lbl;
    private javax.swing.JTextField quantEdit_inp;
    private javax.swing.JButton removeFromList_btn;
    private javax.swing.JButton saveEdit_btn;
    private javax.swing.JTextField search_inp;
    private javax.swing.JLabel search_lbl;
    private javax.swing.JTextField selectedItem_inpt;
    private javax.swing.JLabel selectedItem_lbl;
    private javax.swing.JTextField specEdit_inp;
    private javax.swing.JTextField subTotalEdit_inp;
    private javax.swing.JTextField subTotal_inpt;
    private javax.swing.JLabel subTotals_lbl;
    // End of variables declaration//GEN-END:variables

    ImageIcon icon = new ImageIcon("lan.jpg");
    String a = null;
    String d = null;
    String numberofitems = null;
    String buyingprice = null;
    String itemid = null;
    int fin = 0;
    String spec = null;
    String noitems = null;
    String sellingprice = null;
    String s4 = Integer.toString(fin);
    Connection con = null;
    Statement state = null;

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new sales().setVisible(true);
        });
    }

    public sales() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setIconImage(icon.getImage());
        popitems();
        //this.setExtendedState(getExtendedState()|JFrame.MAXIMIZED_BOTH);
    }

    private void close() {
        try {
            this.dispose();
            new mainwin_1().setVisible(true);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(sales.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void clear() {
        selectedItem_inpt.setText("");
        price_input.setText("");
        no_of_items_inpt.setText("");
        change_typing_impt.setText("");
        custno_inpt.setText("");
        paymentMode_Inpt.setText("");
        clear2();
        removeFromList_btn.setEnabled(false);
    }

    private void popitems() {
        addItem_Btn.setEnabled(true);
        try {
            Class.forName("org.sqlite.JDBC");
            DefaultTableModel model = (DefaultTableModel) items_inDB_Tbl.getModel();
            model.setRowCount(0);
            Connection con1 = DriverManager.getConnection("jdbc:sqlite:lng.db");
            Statement state14 = con1.createStatement();
            ResultSet rs2 = state14.executeQuery("select item3, spec3, atprice3, sellp3, quant3, transid3 from stocksell where transid3 > 0 order by transid3 desc;");
            while (rs2.next()) {
                String s0 = rs2.getString(1);
                String s1 = rs2.getString(2);
                String s2 = rs2.getString(3);
                String s3 = rs2.getString(4);
                String s4_ = rs2.getString(5);
                String s5 = rs2.getString(6);
                Object[] obj2 = {s0, s1, s2, s3, s4_, s5}; 
                DefaultTableModel model2 = (DefaultTableModel) items_inDB_Tbl.getModel();
                model2.addRow(obj2);
            }
            state14.close();
            rs2.close();
            con1.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(sales.class.getName()).log(Level.SEVERE, null, ex);
        }
        clear2();
        removeFromList_btn.setEnabled(false);
    }

    private void filterPimary() {
        String search = search_inp.getText().trim();
        try {
            Class.forName("org.sqlite.JDBC");
            DefaultTableModel model = (DefaultTableModel) items_inDB_Tbl.getModel();
            model.setRowCount(0);
            String sql = "SELECT item3, spec3, atprice3, sellp3, quant3, transid3 "
                    + "FROM stocksell "
                    + "WHERE transid3 > 0 "
                    + "AND (item3 LIKE ? OR spec3 LIKE ?) "
                    + "ORDER BY transid3 DESC";
            try (Connection con1 = DriverManager.getConnection("jdbc:sqlite:lng.db"); PreparedStatement pst = con1.prepareStatement(sql)) {
                String searchPattern = "%" + search + "%";
                pst.setString(1, searchPattern);
                pst.setString(2, searchPattern);
                try (ResultSet rs2 = pst.executeQuery()) {
                    while (rs2.next()) {
                        Object[] row = {
                            rs2.getString(1),
                            rs2.getString(2),
                            rs2.getString(3),
                            rs2.getString(4),
                            rs2.getString(5),
                            rs2.getString(6)
                        };
                        model.addRow(row);
                    }
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(sales.class.getName()).log(Level.SEVERE, null, ex);
        }
        clear2();
        removeFromList_btn.setEnabled(false);
    }

    public void attachlistener() {
        no_of_items_inpt.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) { // Ctrl+C → cancel
                if ((e.getModifiersEx() & KeyEvent.CTRL_DOWN_MASK) != 0 && e.getKeyCode() == KeyEvent.VK_C) {
                    try {
                        cancel_Operation();
                    } catch (ClassNotFoundException | SQLException ex) {
                        System.getLogger(sales.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
                    }
                } // Ctrl + S to complete sale
                else if ((e.getModifiersEx() & KeyEvent.CTRL_DOWN_MASK) != 0 && e.getKeyCode() == KeyEvent.VK_S) {
                    copleteSale();  // Or whatever method triggers the sale completion
                } // Ctrl + Alt + S → save edited item
                else if ((e.getModifiersEx() & KeyEvent.CTRL_DOWN_MASK) != 0 && (e.getModifiersEx() & KeyEvent.ALT_DOWN_MASK) != 0
                        && e.getKeyCode() == KeyEvent.VK_S) {
                    try {
                        saveEditedItem();
                    } catch (SQLException | ClassNotFoundException ex) {

                    }
                    e.consume();
                } // Ctrl+C → cancel
                else if ((e.getModifiersEx() & KeyEvent.CTRL_DOWN_MASK) != 0 && e.getKeyCode() == KeyEvent.VK_X) {
                    try {
                        if (!removeFromList_btn.isEnabled()) {
                            return;
                        }
                        removeFromList();
                    } catch (ClassNotFoundException | SQLException ex) {
                        System.getLogger(sales.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
                    }
                }
            }
        });
    }

    private void selectItem() {
        no_of_items_inpt.requestFocusInWindow();
        no_of_items_inpt.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    try {
                        confnext();
                    } catch (HeadlessException | ClassNotFoundException ex) {
                    }
                }
            }
        });
        attachlistener();
        removeFromList_btn.setEnabled(false);
        clear2();
        DefaultTableModel model = (DefaultTableModel) items_inDB_Tbl.getModel();
        a = model.getValueAt(items_inDB_Tbl.getSelectedRow(), 0).toString();
        d = model.getValueAt(items_inDB_Tbl.getSelectedRow(), 3).toString();
        numberofitems = model.getValueAt(items_inDB_Tbl.getSelectedRow(), 4).toString();
        buyingprice = model.getValueAt(items_inDB_Tbl.getSelectedRow(), 2).toString();
        itemid = model.getValueAt(items_inDB_Tbl.getSelectedRow(), 5).toString();
        spec = model.getValueAt(items_inDB_Tbl.getSelectedRow(), 1).toString();
        selectedItem_inpt.setText(a);
        price_input.setText(d);
    }

    int price = 0;

    public void confnext() throws HeadlessException, ClassNotFoundException {
        removeFromList_btn.setEnabled(false);
        clear2();
        noitems = no_of_items_inpt.getText();
        sellingprice = price_input.getText();
        if (sellingprice.length() > 0 && noitems.length() > 0) {
            try {
                int ochoice = Integer.parseInt(price_input.getText());
                price = Integer.parseInt(sellingprice);
                int quant = Integer.parseInt(noitems);
                int rchoice = Integer.parseInt(buyingprice);
                fin = quant * price;
                s4 = Integer.toString(fin);
                if (ochoice < rchoice) {
                    JOptionPane.showMessageDialog(this, "!!! cannot sell the item bellow sh." + buyingprice + " \ncoz it wiill result to a loss"
                            + " of sh." + (rchoice - ochoice));
                } else {
                    if (quant < 1) {
                        JOptionPane.showMessageDialog(this, "invalid number of items.\nmust be atleast 1 or above");
                    } else {
                        subTotal_inpt.setText(s4);
                        home_Btn.setEnabled(false);
                        complete();
                        popitems();
                        subTotal_inpt.setText(s4);
                        addItem_Btn.setEnabled(true);
                    }
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "invalid details.");
            } catch (SQLException ex) {
                Logger.getLogger(sales.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
        }
    }

    String idOfStockout2 = null;

    private void complete() throws ClassNotFoundException, SQLException {
        removeFromList_btn.setEnabled(false);
        clear2();
        Class.forName("org.sqlite.JDBC");
        con = DriverManager.getConnection("jdbc:sqlite:lng.db");
        state = con.createStatement();
        state.execute("begin transaction;");
        try {
            int ochoice = Integer.parseInt(price_input.getText());
            int quant = Integer.parseInt(no_of_items_inpt.getText());
            int sum = Integer.parseInt(numberofitems);
            int rchoice = Integer.parseInt(buyingprice);
            int rem = sum - quant;
            String finrem = Integer.toString(rem);
            String pricerem = Integer.toString((rem * rchoice));
            state.execute("update stockin set quantity1 = \"" + finrem + "\", totalprice1 = \"" + pricerem + "\" where transid1 = \"" + itemid + "\";");
            state.execute("update stocksell set quant3 = \"" + finrem + "\" where transid3 = \"" + itemid + "\";");
            String aa = selectedItem_inpt.getText();
            String bb = no_of_items_inpt.getText();
            String cc = spec;
            String dd = Integer.toString(ochoice);
            String ee = Integer.toString(fin);
            java.util.Date now = new java.util.Date();
            SimpleDateFormat form = new SimpleDateFormat("EE   dd / MMMM / Y      h:mm  a");
            String ff = form.format(now);
            String hh = paymentMode_Inpt.getText();
            state.execute("insert into stockout (item2 ,quantity2 ,quality2,atprice2 ,totalprice2 ,date2 ,state2 )"
                    + "values(\"" + aa + "\",\"" + bb + "\",\"" + cc + "\", \"" + dd + "\","
                    + "\"" + ee + "\", \"" + ff + "\",\"" + hh + "\");");
            ResultSet idOfStockout1 = state.executeQuery("select transid2 from stockout where "
                    + "item2 = \"" + aa + "\" and quantity2 = \"" + bb + "\" and quality2 = \"" + cc + "\" and atprice2 = \"" + dd
                    + "\" and totalprice2 = \"" + ee + "\" and date2 = \"" + ff + "\" and state2 = \"" + hh + "\";");
            idOfStockout2 = idOfStockout1.getString(1);
            state.close();
            addItem_Btn.setEnabled(true);
            addItemSoldToList();
            popitems();
        } catch (SQLException ex) {
            Logger.getLogger(sales.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void addItemSoldToList() {
        removeFromList_btn.setEnabled(false);
        clear2();
        try {
            Object[] obj3 = {a, spec, noitems, price, s4, itemid, idOfStockout2};
            DefaultTableModel model3 = (DefaultTableModel) items_BeingSold_tbl.getModel();
            model3.addRow(obj3);
            state.execute("commit; end transaction");
            subTotal_inpt.setText("");
            state.close();
            con.close();
            selectedItem_inpt.setText("");
            price_input.setText("");
            no_of_items_inpt.setText("");
            popitems();
            completeSale.setEnabled(true);
            cancel_Operation_Btn.setEnabled(true);
        } catch (SQLException ex) {
            Logger.getLogger(sales.class.getName()).log(Level.SEVERE, null, ex);
        }
        addItem_Btn.setEnabled(false);
        cancel_Operation_Btn.setEnabled(false);
        int rowc1 = items_BeingSold_tbl.getRowCount();
        int sum1 = 0;
        for (int i = 0; i < rowc1; i++) {
            sum1 = sum1 + Integer.parseInt(items_BeingSold_tbl.getValueAt(i, 4).toString());
        }
        cancel_Operation_Btn.setEnabled(true);
        grandTotal_inpt.setText(Integer.toString(sum1));
    }

    private void copleteSale() {
        removeFromList_btn.setEnabled(false);
        clear2();
        try {
            //string a is autoincrement.
            String b = paymentMode_Inpt.getText();
            java.util.Date now = new java.util.Date();
            SimpleDateFormat form = new SimpleDateFormat(" dd / MMMM / Y ");
            String c = form.format(now);
            java.util.Date now2 = new java.util.Date();
            SimpleDateFormat form1 = new SimpleDateFormat(" h:mm  a ");
            String d1 = form1.format(now2);
            java.util.Date now3 = new java.util.Date();
            SimpleDateFormat form3 = new SimpleDateFormat(" EEEE ");
            String e = form3.format(now3);
            String f = grandTotal_inpt.getText();
            login.loginpage usr = new login.loginpage();
            String g = usr.user;
            String h = custno_inpt.getText();

            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:lng.db");
            state = con.createStatement();
            state.execute("insert into saleshist (pm ,dt ,tm ,day ,wog ,sb ,cpn )"
                    + "values(\"" + b + "\",\"" + c + "\",\"" + d1 + "\", \"" + e + "\",\n"
                    + "\"" + f + "\", \"" + g + "\",\"" + h + "\");");

            String aa = grandTotal_inpt.getText();
            String bb = "0";
            //-----------------------------time
            java.util.Date now5 = new java.util.Date();
            SimpleDateFormat form5 = new SimpleDateFormat(" h:mm  a ");
            String dd = form5.format(now5);
            //-----------------------------month
            java.util.Date now4 = new java.util.Date();
            SimpleDateFormat form4 = new SimpleDateFormat(" dd/MMMM ");
            String ee = form4.format(now4);
            //-----------------------------year
            java.util.Date now6 = new java.util.Date();
            SimpleDateFormat form6 = new SimpleDateFormat(" Y ");
            String ff = form6.format(now6);
            try (Statement state5 = con.createStatement()) {
                state5.execute("insert into transhist (ai ,ao , day, tm, month, year) \n"
                        + "values(\"" + aa + "\",\"" + bb + "\",\"" + e + "\", \"" + dd + "\",\n"
                                + "\"" + ee + "\", \"" + ff + "\");");
            }

            clear();
            grandTotal_inpt.setText("");
            change_returned_inpt.setText("");
            state.close();
            con.close();
            completeSale.setEnabled(false);
            cancel_Operation_Btn.setEnabled(false);
            home_Btn.setEnabled(true);
            reset();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(sales.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void checkChange() {
        removeFromList_btn.setEnabled(false);
        clear2();
        String a = change_typing_impt.getText();
        change_returned_inpt.setText("");
        try {
            int b = Integer.parseInt(a);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "invalid input!!");
            change_typing_impt.setText("");
        }
    }

    private void next_change() {
        removeFromList_btn.setEnabled(false);
        clear2();
        try {
            int moneyfromcust = Integer.parseInt(change_typing_impt.getText());
            int costofgoods = Integer.parseInt(grandTotal_inpt.getText());
            int changetaken = moneyfromcust - costofgoods;

            if (changetaken < 0) {
                JOptionPane.showMessageDialog(this, "the money from customer is insufficient!!");
            } else {
                change_returned_inpt.setText(Integer.toString(changetaken));
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "no goods have being seleted for sale!!");
        }
    }

    public void verifyDetails() {
        removeFromList_btn.setEnabled(false);
        clear2();
        if (grandTotal_inpt.getText().length() > 0) {
            try {
                int moneyfromcust = Integer.parseInt(change_typing_impt.getText());
                int costofgoods = Integer.parseInt(grandTotal_inpt.getText());
                int changetaken = Integer.parseInt(change_returned_inpt.getText());
                String customernumber = custno_inpt.getText();
                copleteSale();
            } catch (NumberFormatException ex) {
                int moneyfromcust = 0;
                int costofgoods = 0;
                int changetaken = 0;
                String customernumber = custno_inpt.getText();
                copleteSale();
            }
        } else {
            completeSale.setEnabled(false);
            cancel_Operation_Btn.setEnabled(false);
            JOptionPane.showMessageDialog(this, "no sale has being made!!");
        }
    }

    String itemForEdit_name;
    String itemForEdit_spec;
    String itemForEdit_quant;
    String itemForEdit_price;
    String itemForEdit_subtotal;
    String selectedId = "0";
    String idOfStockout4;
    int selectedRow;

    private void selectItem2() {
        attachlistener();
        DefaultTableModel model = (DefaultTableModel) items_BeingSold_tbl.getModel();
        itemForEdit_name = model.getValueAt(items_BeingSold_tbl.getSelectedRow(), 0).toString();
        itemForEdit_spec = model.getValueAt(items_BeingSold_tbl.getSelectedRow(), 1).toString();
        itemForEdit_quant = model.getValueAt(items_BeingSold_tbl.getSelectedRow(), 2).toString();
        itemForEdit_price = model.getValueAt(items_BeingSold_tbl.getSelectedRow(), 3).toString();
        itemForEdit_subtotal = model.getValueAt(items_BeingSold_tbl.getSelectedRow(), 4).toString();
        selectedId = model.getValueAt(items_BeingSold_tbl.getSelectedRow(), 5).toString();
        idOfStockout4 = model.getValueAt(items_BeingSold_tbl.getSelectedRow(), 6).toString();
        selectedRow = items_BeingSold_tbl.getSelectedRow();
        itemEdit_inp.setText(itemForEdit_name);
        specEdit_inp.setText(itemForEdit_spec);
        quantEdit_inp.setText(itemForEdit_quant);
        priceEdit_inp.setText(itemForEdit_price);
        subTotalEdit_inp.setText(itemForEdit_subtotal);
        removeFromList_btn.setEnabled(true);
    }

    public void clear2() {
        itemEdit_inp.setText("");
        specEdit_inp.setText("");
        quantEdit_inp.setText("");
        priceEdit_inp.setText("");
        subTotalEdit_inp.setText("");
        selectedId = "0";
    }

    public void saveEditedItem() throws SQLException, ClassNotFoundException {
        Class.forName("org.sqlite.JDBC");
        con = DriverManager.getConnection("jdbc:sqlite:lng.db");
        if (Integer.parseInt(selectedId) < 1) {
            JOptionPane.showMessageDialog(this, "Nothing to save");
            clear2();
        } else {
            String new_itemForEdit_quant = quantEdit_inp.getText();
            String new_itemForEdit_price = priceEdit_inp.getText();
            if (new_itemForEdit_quant.equals(itemForEdit_quant) && new_itemForEdit_price.equals(itemForEdit_price)) {
                JOptionPane.showMessageDialog(this, "No changes has been made.");
            } else {
                int new_price = Integer.parseInt(new_itemForEdit_price);
                int old_quant = Integer.parseInt(itemForEdit_quant);
                int new_quant;
                try {
                    new_quant = Integer.parseInt(new_itemForEdit_quant);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(this, "Invalid changes in inputs!!.");
                    return;
                }
                int quant_change = old_quant - new_quant;
                try (Statement checkprice = con.createStatement()) {
                    ResultSet currQuant = checkprice.executeQuery("select atprice3 from stocksell where transid3 = " + selectedId + ";");
                    int price_inDb = Integer.parseInt((String) currQuant.getString(1));
                    int priceOk = new_price - price_inDb;
                    if (priceOk <= 0) {
                        JOptionPane.showMessageDialog(this, "!!! cannot sell the item bellow sh." + buyingprice + " \ncoz it wiill result to a loss"
                                + " of sh." + (price_inDb - new_price));
                        return;
                    }
                }
                if (new_quant < 1) {
                    JOptionPane.showMessageDialog(this, "quantity cannot be less than 1.");
                } else {
                    try (Statement removestate = con.createStatement()) {
                        ResultSet currQuant = removestate.executeQuery("select quant3 from stocksell where transid3 = " + selectedId + ";");
                        int count_inDb = Integer.parseInt((String) currQuant.getString(1));
                        int updated = count_inDb + quant_change;
                        removestate.execute("update stockin set quantity1 = \"" + updated + "\" where transid1 = \"" + selectedId + "\";");
                        removestate.execute("update stocksell set quant3 = \"" + updated + "\" where transid3 = \"" + selectedId + "\";");
                        removestate.execute("update stockout set quantity2 = \"" + new_quant + "\"  where transid2 = " + idOfStockout4 + ";");
                        DefaultTableModel model = (DefaultTableModel) items_BeingSold_tbl.getModel();
                        model.setValueAt(Integer.toString(new_quant), selectedRow, 2);
                        model.setValueAt(Integer.toString(new_price), selectedRow, 3);
                        model.setValueAt(subTotalEdit_inp.getText(), selectedRow, 4);
                        int rows = model.getRowCount();
                        int curRow = 0;
                        int newtotals = 0;
                        while (curRow < rows) {
                            int new_price1 = Integer.parseInt((String) model.getValueAt(curRow, 4));
                            newtotals += new_price1;
                            curRow++;
                        }
                        grandTotal_inpt.setText(Integer.toString(newtotals));
                        clear2();
                    }
                    con.close();
                    removeFromList_btn.setEnabled(false);
                    clear2();
                    popitems();
                }
            }
        }
    }

    public void removeFromList() throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        con = DriverManager.getConnection("jdbc:sqlite:lng.db");
        int newtotals;
        try (Statement remove = con.createStatement()) {
            ResultSet currQuant1 = remove.executeQuery("select quant3 from stocksell where transid3 = " + selectedId + ";");
            int count_inDb = Integer.parseInt((String) currQuant1.getString(1));
            int updated = count_inDb + Integer.parseInt(itemForEdit_quant);
            remove.execute("update stockin set quantity1 = \"" + updated + "\" where transid1 = \"" + selectedId + "\";");
            remove.execute("update stocksell set quant3 = \"" + updated + "\" where transid3 = \"" + selectedId + "\";");
            remove.execute("delete from stockout where transid2 = " + idOfStockout4 + ";");
            DefaultTableModel model = (DefaultTableModel) items_BeingSold_tbl.getModel();
            model.removeRow(selectedRow);
            clear2();
            int rows = model.getRowCount();
            int curRow = 0;
            newtotals = 0;
            while (curRow < rows) {
                int new_price = Integer.parseInt((String) model.getValueAt(curRow, 4));
                newtotals += new_price;
                curRow++;
            }
        }
        if (newtotals > 0) {
            grandTotal_inpt.setText(Integer.toString(newtotals));
        } else {
            reset();
        }
        con.close();
        popitems();
    }

    public void reset() {
        DefaultTableModel model = (DefaultTableModel) items_BeingSold_tbl.getModel();
        model.setRowCount(0);
        clear();
        clear2();
        grandTotal_inpt.setText("");
        subTotal_inpt.setText("");
        addItem_Btn.setEnabled(false);
        home_Btn.setEnabled(true);
        completeSale.setEnabled(false);
        cancel_Operation_Btn.setEnabled(false);
        removeFromList_btn.setEnabled(false);
        popitems();
    }

    private void cancel_Operation() throws ClassNotFoundException, SQLException {
        DefaultTableModel model = (DefaultTableModel) items_BeingSold_tbl.getModel();
        int rows = model.getRowCount();
        int curRow = 0;
        Class.forName("org.sqlite.JDBC");
        con = DriverManager.getConnection("jdbc:sqlite:lng.db");
        while (curRow < rows) {
            int quantity_camcel = Integer.parseInt((String) model.getValueAt(curRow, 2));
            int id_cancel = Integer.parseInt((String) model.getValueAt(curRow, 5));
            int idOfStockout3 = Integer.parseInt((String) model.getValueAt(curRow, 6));
            try (Statement revertstate = con.createStatement()) {
                ResultSet currQuant = revertstate.executeQuery("select quant3 from stocksell where transid3 = " + id_cancel + ";");
                int count_inDb = Integer.parseInt((String) currQuant.getString(1));
                int updated = count_inDb + quantity_camcel;
                revertstate.execute("update stockin set quantity1 = \"" + updated + "\" where transid1 = \"" + id_cancel + "\";");
                revertstate.execute("update stocksell set quant3 = \"" + updated + "\" where transid3 = \"" + id_cancel + "\";");
                revertstate.execute("delete from stockout where transid2 = " + idOfStockout3 + ";");
            }
            curRow++;
        }
        reset();
        con.close();
    }

}
