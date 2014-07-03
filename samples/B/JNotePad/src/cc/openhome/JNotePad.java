package cc.openhome;

import javax.swing.JFrame;

public class JNotePad extends JFrame {
    public JNotePad() {
        initComponents();
        initEventListeners();
    }

    private void initComponents() {
        setTitle("新增純文字檔案");
        setSize(400, 300);
    }

    private void initEventListeners() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            new JNotePad().setVisible(true);
        });
    }
}
