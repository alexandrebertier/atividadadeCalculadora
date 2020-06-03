package com.alexandre;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn7 = new JButton("7");
		btn7.setBounds(10, 54, 89, 44);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setBounds(95, 54, 89, 44);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setBounds(182, 54, 89, 44);
		contentPane.add(btn9);
		
		JButton btnNdivisao = new JButton("/");
		btnNdivisao.setBounds(269, 54, 89, 44);
		contentPane.add(btnNdivisao);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn4.setBounds(10, 98, 89, 44);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setBounds(95, 98, 89, 44);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setBounds(182, 98, 89, 44);
		contentPane.add(btn6);
		
		JButton btnmultipli = new JButton("*");
		btnmultipli.setBounds(269, 98, 89, 44);
		contentPane.add(btnmultipli);
		
		JButton btn1 = new JButton("1");
		btn1.setBounds(10, 142, 89, 44);
		contentPane.add(btn1);
		
		
		JButton btn0 = new JButton("0");
		btn0.setBounds(10, 184, 89, 44);
		contentPane.add(btn0);
		
		JButton btn2 = new JButton("2");
		btn2.setBounds(95, 142, 89, 44);
		contentPane.add(btn2);
		
		JButton btnponto = new JButton(".");
		btnponto.setBounds(95, 184, 89, 44);
		contentPane.add(btnponto);
		
		JButton btn3 = new JButton("3");
		btn3.setBounds(182, 142, 89, 44);
		contentPane.add(btn3);
		
		JButton btnmenos = new JButton("-");
		btnmenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnmenos.setBounds(269, 142, 89, 44);
		contentPane.add(btnmenos);
		
		JButton btnigual = new JButton("=");
		btnigual.setBounds(182, 184, 89, 44);
		contentPane.add(btnigual);
		
		JButton btnmais = new JButton("+");
		btnmais.setBounds(269, 184, 89, 44);
		contentPane.add(btnmais);
		
		textField = new JTextField();
		textField.setBounds(10, 33, 348, 20);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
