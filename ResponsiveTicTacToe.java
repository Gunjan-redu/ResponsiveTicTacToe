package com.tictactoe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JEditorPane;
import javax.swing.JScrollBar;
import javax.swing.JInternalFrame;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ResponsiveTicTacToe {

	private JFrame frame;
	private JTextField xCount;
	private JTextField oCount;
	private String startGame = "X";
	private int oCount1 = 0;
	private int xCount1 = 0;
	private int b1=10;
	private int b2=10;
	private int b3=10;
	private int b4=10;
	private int b5=10;
	private int b6=10;
	private int b7=10;
	private int b8=10;
	private int b9=10;
	private int i=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ResponsiveTicTacToe window = new ResponsiveTicTacToe();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ResponsiveTicTacToe() {
		initialize();
	}
	
	public void winningGame() {
		
		if(b1 == 1 && b2 ==1 && b3==1 || b4 == 1 && b5 ==1 && b6==1 || b7 == 1 && b8 ==1 && b9==1 || b1 == 1 && b4 ==1 && b7==1 || b2 == 1 && b5 ==1 && b8==1 || b3 == 1 && b6 ==1 && b9==1 || b1 == 1 && b5 ==1 && b9==1 || b3 == 1 && b5 ==1 && b3==7) { 
			JOptionPane.showMessageDialog(frame, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			xCount1++;
			xCount.setText(String.valueOf(xCount1));
		}
		
		else if(b1 == 0 && b2 ==0 && b3==0 || b4 == 0 && b5 ==0 && b6==0 || b7 == 0 && b8 ==0 && b9==0 || b1 == 0 && b4 ==0 && b7==0 || b2 == 0 && b5 ==0 && b8==0 || b3 == 0 && b6 ==0 && b9==0 || b1 == 0 && b5 ==0 && b9==0 || b3 == 0 && b5 ==0 && b3==0) { 
			JOptionPane.showMessageDialog(frame, "Player Y Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			oCount1++;
			oCount.setText(String.valueOf(oCount1));
		}
		else if(i == 9) {
			JOptionPane.showMessageDialog(frame, "No one Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	private void choosePlayer() {
		if(startGame.equalsIgnoreCase("X"))
		{
			startGame = "O";
		}
		else {
			startGame = "X";
		}
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(new Color(169, 169, 169));
		frame.setBounds(100, 100, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(3, 5, 2, 2));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JButton btn1 = new JButton("");
		btn1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				btn1.setText(startGame);
				if(startGame.equalsIgnoreCase("X")) {
					btn1.setForeground(Color.RED);
					b1= 1;
					i++;
				}else {
					btn1.setForeground(Color.BLUE);
					b1 = 0;
					i++;
				}
				choosePlayer();
				winningGame();
			}
		});
		btn1.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 18));
		panel_1.add(btn1, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JButton btn2 = new JButton("");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn2.setText(startGame);
				if(startGame.equalsIgnoreCase("X")) {
					btn2.setForeground(Color.RED);
					b2 = 1;
					i++;
				}else {
					btn2.setForeground(Color.BLUE);
					b2 = 0;
					i++;
				}
				choosePlayer();
				winningGame();
			}
		});
		btn2.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 18));
		panel_2.add(btn2, BorderLayout.CENTER);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JButton btn3 = new JButton("");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn3.setText(startGame);
				if(startGame.equalsIgnoreCase("X")) {
					btn3.setForeground(Color.RED);
					b3 = 1;
					i++;
				}else {
					btn3.setForeground(Color.BLUE);
					b3 = 0;
					i++;
				}
				choosePlayer();
				winningGame();
			}
		});
		btn3.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 18));
		panel_3.add(btn3, BorderLayout.CENTER);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Player X");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel_4.add(lblNewLabel, BorderLayout.CENTER);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_1_1);
		panel_1_1.setLayout(new BorderLayout(0, 0));
		
		xCount = new JTextField();
		xCount.setHorizontalAlignment(SwingConstants.CENTER);
		xCount.setFont(new Font("Tahoma", Font.BOLD, 18));
		xCount.setText("0");
		panel_1_1.add(xCount, BorderLayout.CENTER);
		xCount.setColumns(10);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBackground(new Color(100, 149, 237));
		panel_1_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_1_2);
		panel_1_2.setLayout(new BorderLayout(0, 0));
		
		JButton btn4 = new JButton("");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn4.setText(startGame);
				if(startGame.equalsIgnoreCase("X")) {
					btn4.setForeground(Color.RED);
					b4 = 1;
					i++;
				}else {
					btn4.setForeground(Color.BLUE);
					b4 = 0;
					i++;
				}
				choosePlayer();
				winningGame();
			}
		});
		btn4.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 18));
		panel_1_2.add(btn4, BorderLayout.CENTER);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_1_3);
		panel_1_3.setLayout(new BorderLayout(0, 0));
		
		JButton btn5 = new JButton("");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn5.setText(startGame);
				if(startGame.equalsIgnoreCase("X")) {
					btn5.setForeground(Color.RED);
					b5 = 1;
					i++;
				}else {
					btn5.setForeground(Color.BLUE);
					b5 =0;
					i++;
				}
				choosePlayer();
				winningGame();
			
			}
		});
		btn5.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 18));
		panel_1_3.add(btn5, BorderLayout.CENTER);
		
		JPanel panel_1_4 = new JPanel();
		panel_1_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_1_4);
		panel_1_4.setLayout(new BorderLayout(0, 0));
		
		JButton btn6 = new JButton("");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn6.setText(startGame);
				if(startGame.equalsIgnoreCase("X")) {
					btn6.setForeground(Color.RED);
					b6 = 1;
					i++;
				}else {
					btn6.setForeground(Color.BLUE);
					b6 =0;
					i++;
				}
				choosePlayer();
				winningGame();
				
			}
		});
		btn6.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 18));
		panel_1_4.add(btn6, BorderLayout.CENTER);
		
		JPanel panel_1_5 = new JPanel();
		panel_1_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_1_5);
		panel_1_5.setLayout(new BorderLayout(0, 0));
		
		JLabel lblPlayer = new JLabel("Player O");
		lblPlayer.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayer.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel_1_5.add(lblPlayer, BorderLayout.CENTER);
		
		JPanel panel_1_6 = new JPanel();
		panel_1_6.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_1_6);
		panel_1_6.setLayout(new BorderLayout(0, 0));
		
		oCount = new JTextField();
		oCount.setText("0");
		oCount.setHorizontalAlignment(SwingConstants.CENTER);
		oCount.setFont(new Font("Tahoma", Font.BOLD, 18));
		oCount.setColumns(10);
		panel_1_6.add(oCount, BorderLayout.CENTER);
		
		JPanel panel_1_7 = new JPanel();
		panel_1_7.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_1_7);
		panel_1_7.setLayout(new BorderLayout(0, 0));
		
		JButton btn7 = new JButton("");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn7.setText(startGame);
				if(startGame.equalsIgnoreCase("X")) {
					btn7.setForeground(Color.RED);
					b7 = 1;
					i++;
				}else {
					btn7.setForeground(Color.BLUE);
					b7 = 0;
					i++;
				}
				choosePlayer();
				winningGame();
				
			}
		});
		btn7.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 18));
		panel_1_7.add(btn7, BorderLayout.CENTER);
		
		JPanel panel_1_2_1 = new JPanel();
		panel_1_2_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_1_2_1);
		panel_1_2_1.setLayout(new BorderLayout(0, 0));
		
		JButton btn8 = new JButton("");
		btn8.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 18));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn8.setText(startGame);
				if(startGame.equalsIgnoreCase("X")) {
					btn8.setForeground(Color.RED);
					b8 = 1;
					i++;
				}else {
					btn8.setForeground(Color.BLUE);
					b8 = 0;
					i++;
				}
				choosePlayer();
				winningGame();
				
			}
		});
		panel_1_2_1.add(btn8, BorderLayout.CENTER);
		
		JPanel panel_1_8 = new JPanel();
		panel_1_8.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_1_8);
		panel_1_8.setLayout(new BorderLayout(0, 0));
		
		JButton btn9 = new JButton("");
		btn9.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 18));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn9.setText(startGame);
				if(startGame.equalsIgnoreCase("X")) {
					btn9.setForeground(Color.RED);
					b9 =1 ;
					i++;
				}else {
					btn9.setForeground(Color.BLUE);
					b9 = 0;
					i++;
				}
				choosePlayer();
				winningGame();
				
			}
		});
		panel_1_8.add(btn9, BorderLayout.CENTER);
		
		JPanel panel_1_2_2 = new JPanel();
		panel_1_2_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_1_2_2);
		panel_1_2_2.setLayout(new BorderLayout(0, 0));
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn1.setText(null);
				btn2.setText(null);
				btn3.setText(null);
				btn4.setText(null);
				btn5.setText(null);
				btn6.setText(null);
				btn7.setText(null);
				btn8.setText(null);
				btn9.setText(null);
				b1=10;
				b2=10;
				b3=10;
				b4=10;
				b5=10;
				b6=10;
				b7=10;
				b8=10;
				b9=10;
				
			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 16));
		panel_1_2_2.add(btnReset, BorderLayout.CENTER);
		
		JPanel panel_1_2_3 = new JPanel();
		panel_1_2_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_1_2_3);
		panel_1_2_3.setLayout(new BorderLayout(0, 0));

		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame, "Confirm you want to exit","TicTacToe", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 16));
		panel_1_2_3.add(btnExit, BorderLayout.CENTER);
	}

}
