package cc.openhome;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JNotePad extends JFrame {
    private JMenuBar menuBar;
    private JMenu fileMenu;
    private JMenuItem menuOpen;
    private JMenuItem menuSave;
    private JMenuItem menuSaveAs;
    private JMenuItem menuClose;
    
    private JMenu editMenu;
    private JMenuItem menuCut;
    private JMenuItem menuCopy;
    private JMenuItem menuPaste;
    
    private JMenu aboutMenu;
    private JMenuItem menuAbout;

    private JTextArea textArea;
    private JLabel stateBar;
    
    public JNotePad() {
        initComponents();
        initEventListeners();
    }

    private void initComponents() {
        setTitle("新增純文字檔案");
        setSize(400, 300);
        initFileMenu();        
        initEditMenu();        
        initAboutMenu();
        initMenuBar();
        initTextArea();
        initStateBar();
    }

    private void initTextArea() {
        // 文字編輯區域
        textArea = new JTextArea();
        textArea.setFont(new Font("細明體", Font.PLAIN, 16));
        textArea.setLineWrap(true);
        JScrollPane panel = new JScrollPane(textArea,
                ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        
        getContentPane().add(panel, BorderLayout.CENTER);
    }

    private void initMenuBar() {
        // 選單列
        menuBar = new JMenuBar();
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(aboutMenu);
        // 設置選單列
        setJMenuBar(menuBar);
    }
    
    private void initStateBar() {
        // 狀態列
        stateBar = new JLabel("未修改");
        stateBar.setHorizontalAlignment(SwingConstants.LEFT); 
        stateBar.setBorder(
                BorderFactory.createEtchedBorder());
        getContentPane().add(stateBar, BorderLayout.SOUTH);        
    }

    private void initAboutMenu() {
        // 設置「關於」選單
        aboutMenu = new JMenu("關於");
        menuAbout = new JMenuItem("關於JNotePad");
        aboutMenu.add(menuAbout);
    }

    private void initEditMenu() {
        // 設置「編輯」選單
        editMenu = new JMenu("編輯");
        menuCut = new JMenuItem("剪下");
        menuCopy = new JMenuItem("複製");
        menuPaste = new JMenuItem("貼上");
        
        editMenu.add(menuCut);
        editMenu.add(menuCopy);
        editMenu.add(menuPaste);
    }

    private void initFileMenu() {
        // 設置「檔案」選單
        fileMenu = new JMenu("檔案");
        menuOpen = new JMenuItem("開啟舊檔");
        menuSave = new JMenuItem("儲存檔案");
        menuSaveAs = new JMenuItem("另存新檔");
        menuClose = new JMenuItem("關閉");
        
        fileMenu.add(menuOpen);
        fileMenu.addSeparator(); // 分隔線
        fileMenu.add(menuSave);
        fileMenu.add(menuSaveAs);
        fileMenu.addSeparator(); // 分隔線
        fileMenu.add(menuClose);
    }

    private void initEventListeners() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initAccelerator();
    }

    private void initAccelerator() {
        // 快速鍵設置
        menuOpen.setAccelerator(
                KeyStroke.getKeyStroke(
                        KeyEvent.VK_O,
                        InputEvent.CTRL_MASK));
        menuSave.setAccelerator(
                KeyStroke.getKeyStroke(
                        KeyEvent.VK_S,
                        InputEvent.CTRL_MASK));
        menuClose.setAccelerator(
                KeyStroke.getKeyStroke(
                        KeyEvent.VK_Q,
                        InputEvent.CTRL_MASK));
        menuCut.setAccelerator(
                KeyStroke.getKeyStroke(KeyEvent.VK_X,
                        InputEvent.CTRL_MASK));
        menuCopy.setAccelerator(
                KeyStroke.getKeyStroke(KeyEvent.VK_C,
                        InputEvent.CTRL_MASK));
        menuPaste.setAccelerator(
                KeyStroke.getKeyStroke(KeyEvent.VK_V,
                        InputEvent.CTRL_MASK));
    }
    
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            new JNotePad().setVisible(true);
        });
    }
}
