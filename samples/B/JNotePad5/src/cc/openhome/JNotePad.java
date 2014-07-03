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

    private JPopupMenu popUpMenu;

    private TextDAO textDAO;

    private JFileChooser fileChooser;

    public JNotePad(TextDAO textDAO) {
        this.textDAO = textDAO;
    }

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
        // 蹦現選單
        popUpMenu = editMenu.getPopupMenu();
        // 開啟檔案對話方塊
        fileChooser = new JFileChooser();
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

        // 按下視窗關閉鈕事件處理
        addWindowListener(
                new WindowAdapter() {
                    public void windowClosing(WindowEvent event) {
                        closeWindow(event);
                    }
                }
        );

        initMenuListener();

        // 編輯區鍵盤事件
        textArea.addKeyListener(
                new KeyAdapter() {
                    public void keyTyped(KeyEvent event) {
                        jtextAreaActionPerformed(event);
                    }
                }
        );

        // 編輯區滑鼠事件
        textArea.addMouseListener(
                new MouseAdapter() {
                    public void mouseReleased(MouseEvent event) {
                        if (event.getButton() == MouseEvent.BUTTON3) {
                            popUpMenu.show(editMenu, event.getX(), event.getY());
                        }
                    }

                    public void mouseClicked(MouseEvent e) {
                        if (e.getButton() == MouseEvent.BUTTON1) {
                            popUpMenu.setVisible(false);
                        }
                    }
                }
        );

    }

    private void initMenuListener() {
        menuOpen.addActionListener(this::openFile); // 選單 - 開啟舊檔
        menuSave.addActionListener(this::saveFile); // 選單 - 儲存檔案
        menuSaveAs.addActionListener(this::saveFileAs); // 選單 - 另存新檔
        menuClose.addActionListener(this::closeFile); // 選單 - 關閉檔案
        menuCut.addActionListener(this::cut); // 選單 - 剪下
        menuCopy.addActionListener(this::copy); // 選單 - 複製
        menuPaste.addActionListener(this::paste); // 選單 - 貼上
        menuAbout.addActionListener(event -> { // 選單 - 關於
            JOptionPane.showOptionDialog(null, // 顯示對話方塊
                    "JNotePad 0.1\n來自 http://openhome.cc",
                    "關於JNotePad",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null, null, null);
        });
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

    private void closeWindow(WindowEvent event) {
    }

    private void openFile(ActionEvent event) {
        if (stateBar.getText().equals("未修改")) {     // 文件是否為儲存狀態
            showFileDialog();    // 開啟舊檔
        } else {
            int option = JOptionPane.showConfirmDialog( // 顯示對話方塊
                    null, "檔案已修改，是否儲存？",
                    "儲存檔案？", JOptionPane.YES_NO_OPTION,
                    JOptionPane.WARNING_MESSAGE, null);
            switch (option) {
                case JOptionPane.YES_OPTION: // 確認檔案儲存
                    saveFile(event); // 儲存檔案
                    break;
                case JOptionPane.NO_OPTION:  // 放棄檔案儲存
                    showFileDialog();
                    break;
            }
        }
    }

    private void showFileDialog() {
        int option = fileChooser.showDialog(null, null); // 檔案選取對話方塊

        // 使用者按下確認鍵
        if (option == JFileChooser.APPROVE_OPTION) {
            try {
                setTitle(fileChooser.getSelectedFile().toString());  // 設定文件標題
                textArea.setText("");          // 清除前一次文件
                stateBar.setText("未修改");    // 設定狀態列

                String text = textDAO.read( // 讀取檔案
                        fileChooser.getSelectedFile().toString());
                textArea.setText(text);         // 附加至文字編輯區
            } catch (Throwable e) {
                JOptionPane.showMessageDialog(null, e.toString(),
                        "開啟檔案失敗", JOptionPane.ERROR_MESSAGE);
            }
        }

    }

    private void saveFile(ActionEvent event) {
    }

    private void saveFileAs(ActionEvent event) {
    }

    private void closeFile(ActionEvent event) {
    }

    private void cut(ActionEvent event) {
    }

    private void copy(ActionEvent event) {
    }

    private void paste(ActionEvent event) {
    }

    private void jtextAreaActionPerformed(KeyEvent event) {
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            new JNotePad().setVisible(true);
        });
    }
}
