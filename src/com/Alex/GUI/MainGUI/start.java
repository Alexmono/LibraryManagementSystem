package com.Alex.GUI.MainGUI;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class start extends Thread {

	/*
	 * choose user or manager login
	 */
	private static int loginType = 0;// 0-未选择状态， 1-uesrLogin，2-managerLogin

	public static void startup() {

		JFrame jFrame = new JFrame();
		jFrame.setSize(600, 450);
		jFrame.setLocation((Toolkit.getDefaultToolkit().getScreenSize().width - 600) / 2,
				(Toolkit.getDefaultToolkit().getScreenSize().height - 600) / 2);
		jFrame.setUndecorated(true);
		jFrame.setVisible(true);

		JPanel jPanel1 = new JPanel();
		jPanel1.setSize(600, 450);
		jPanel1.setBackground(new Color(28, 245, 205));
		jPanel1.setLayout(null);

		JPanel jPanel2 = new JPanel();
		jPanel2.setSize(600, 285); // 最终宽高(600,285)
		jPanel2.setLocation(0, 165); // 最终位置(0,165)
		jPanel2.setBackground(new Color(222, 222, 222));
		jPanel2.setLayout(null);

		/*
		 * 关闭按钮
		 */
		JButton closeButton = new JButton();
		closeButton.setSize(30, 30);
		closeButton.setLocation(570, 0);
		closeButton.setBorderPainted(false);
		closeButton.setBackground(Color.gray);// 之后替换颜色为图标
		closeButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		/*
		 * 最小化按钮
		 */
		JButton minimizeButton = new JButton();
		minimizeButton.setSize(30, 30);
		minimizeButton.setLocation(540, 0);
		minimizeButton.setBorderPainted(false);
		minimizeButton.setBackground(Color.cyan);// 之后替换颜色为图标
		minimizeButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jFrame.setExtendedState(JFrame.ICONIFIED);// 最小化窗口
				// jFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);//最大化窗口
			}
		});
		/*
		 * 返回choose界面
		 */
		JButton getBackButton = new JButton("<");
		getBackButton.setSize(45, 30);
		getBackButton.setLocation(0, 0);
		getBackButton.setBorderPainted(false);
		getBackButton.setBackground(Color.orange);

		/*
		 * 选择登录方式
		 */
		JButton userLogin = new JButton("用户登录");
		JButton managerLogin = new JButton("管理员登录");
		/*
		 * 用户登录按钮设定
		 */
		userLogin.setSize(200, 70);
		userLogin.setLocation(200, 130);
		userLogin.setBorderPainted(false);
		userLogin.setBackground(Color.magenta);
		userLogin.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 23));
		/*
		 * 图书管理员登录按钮设定
		 */
		managerLogin.setSize(200, 70);
		managerLogin.setLocation(200, 250);
		managerLogin.setBorderPainted(false);
		managerLogin.setBackground(Color.magenta);
		managerLogin.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 23));

		jFrame.add(jPanel1);
		jPanel1.add(closeButton);
		jPanel1.add(minimizeButton);
		jPanel1.add(userLogin);
		jPanel1.add(managerLogin);

		/*
		 * 账号输入组件
		 */
		Border border = BorderFactory.createLineBorder(new Color(28, 245, 205));

		JLabel accountNumber = new JLabel("账户：");
		accountNumber.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 22));
		accountNumber.setForeground(Color.gray);
		accountNumber.setLocation(70, 50);
		accountNumber.setSize(70, 45);
		// 输入accountNumber
		JTextField accountnumber = new JTextField();
		accountnumber.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
		accountnumber.setSize(350, 45);
		accountnumber.setBorder(border);
		accountnumber.setLocation(140, 50);

		JLabel passWord = new JLabel("密码：");
		passWord.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 22));
		passWord.setForeground(Color.gray);
		passWord.setLocation(70, 115);
		passWord.setSize(70, 45);
		// 输入密码
		JPasswordField password = new JPasswordField();
		password.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
		password.setSize(350, 45);
		password.setSize(350, 45);
		password.setBorder(border);
		password.setLocation(140, 115);
		// 登录按钮
		JButton loginButton = new JButton("登录");
		loginButton.setSize(120, 50);
		loginButton.setLocation(240, 190);
		loginButton.setBorderPainted(false);
		loginButton.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
		loginButton.setBackground(new Color(28, 245, 205));
		loginButton.setForeground(Color.white);

		/*
		 * 添加按钮事件
		 */

		// 用户登录按钮事件
		userLogin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jPanel1.remove(userLogin);
				jPanel1.remove(managerLogin);
				jPanel1.setSize(600, 165);
				jFrame.add(jPanel2);
				jPanel1.add(getBackButton);
				loginType = 1;
				jPanel2.add(accountNumber);
				jPanel2.add(accountnumber);
				jPanel2.add(password);
				jPanel2.add(passWord);
				jPanel2.add(loginButton);
			}
		});

		// 图书管理员登录按钮事件
		managerLogin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jPanel1.remove(userLogin);
				jPanel1.remove(managerLogin);
				jPanel1.setSize(600, 165);
				jFrame.add(jPanel2);
				jPanel1.add(getBackButton);
				loginType = 2;
				jPanel2.add(accountNumber);
				jPanel2.add(accountnumber);
				jPanel2.add(password);
				jPanel2.add(passWord);
				jPanel2.add(loginButton);
			}
		});

		// 返回按钮事件 返回 choose
		getBackButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jFrame.remove(jPanel2);
				jPanel1.setSize(600, 450);
				jPanel1.add(userLogin);
				jPanel1.add(managerLogin);
				jPanel1.remove(getBackButton);
				loginType = 0;
				jPanel2.remove(passWord);
				jPanel2.remove(password);
				jPanel2.remove(accountNumber);
				jPanel2.remove(accountnumber);
				jPanel2.remove(loginButton);
			}
		});
	}
}
