package com.a;

import java.awt.BorderLayout;

import java.awt.Dimension;

import java.awt.Toolkit;

import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JMenu;

import javax.swing.JMenuBar;

import javax.swing.JMenuItem;

import javax.swing.JPanel;

import javax.swing.JPopupMenu;

import javax.swing.JToolBar;

public class System {

	static final int WIDTH = 600;

	static final int HEIGHT = 400;

	JPopupMenu pop;

	JMenuItem item1;

	JMenuItem item2;

	JFrame f;

	JPanel p;

	JToolBar bar;

	public System() {

		f = new JFrame("发动机远程监控与智能诊断系统");

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenuBar menubar1 = new JMenuBar();

		f.setJMenuBar(menubar1);

		JMenu menu1 = new JMenu("发动机类型");

		JMenu menu2 = new JMenu("故障诊断");

		JMenu menu3 = new JMenu("帮助");

		JMenu menu4 = new JMenu("关于我们");

		menubar1.add(menu1);

		menubar1.add(menu2);

		menubar1.add(menu3);

		menubar1.add(menu4);

		f.setVisible(true);

		f.setSize(WIDTH, HEIGHT);

	}

	public static void main(String[] args)

	{

		new System();

	}

}