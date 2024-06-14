package groupby.ui;

import groupby.dao.DocumentDAO;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class FrameTest {

    private JFrame frame;
    private JTextField nameField;
    private JTextField phoneField;
    private JTextField addressField;
    private JTextField distanceField;
    private JTextField memoField;
    private JTable table;
    private DefaultTableModel tableModel;
    private DocumentDAO documentDAO;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    FrameTest window = new FrameTest();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public FrameTest() {
        documentDAO = new DocumentDAO();
        initialize();
        loadAllData();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new GridLayout(5, 2));
        JPanel buttonPanel = new JPanel(new GridLayout(1, 4));

        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(buttonPanel, BorderLayout.CENTER);

        inputPanel.add(new JLabel("이름:"));
        nameField = new JTextField();
        inputPanel.add(nameField);

        inputPanel.add(new JLabel("전화번호:"));
        phoneField = new JTextField();
        inputPanel.add(phoneField);

        inputPanel.add(new JLabel("주소:"));
        addressField = new JTextField();
        inputPanel.add(addressField);

        inputPanel.add(new JLabel("거리:"));
        distanceField = new JTextField();
        inputPanel.add(distanceField);

        inputPanel.add(new JLabel("메모:"));
        memoField = new JTextField();
        inputPanel.add(memoField);

        JButton insertButton = new JButton("정보저장");
        insertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    insertRestaurant();
                    JOptionPane.showMessageDialog(frame, "정보가 저장되었습니다.");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "정보 저장 중 오류가 발생했습니다: " + ex.getMessage(), "오류", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        buttonPanel.add(insertButton);

        JButton updateButton = new JButton("정보변경");
        updateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    updateRestaurant();
                    JOptionPane.showMessageDialog(frame, "정보가 변경되었습니다.");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "정보 변경 중 오류가 발생했습니다: " + ex.getMessage(), "오류", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        buttonPanel.add(updateButton);

        JButton deleteButton = new JButton("정보삭제");
        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    deleteRestaurant();
                    JOptionPane.showMessageDialog(frame, "정보가 삭제되었습니다.");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "정보 삭제 중 오류가 발생했습니다: " + ex.getMessage(), "오류", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        buttonPanel.add(deleteButton);

        JButton searchButton = new JButton("맛집검색");
        searchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    searchRestaurants();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "검색 중 오류가 발생했습니다: " + ex.getMessage(), "오류", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        buttonPanel.add(searchButton);

        tableModel = new DefaultTableModel();
        table = new JTable(tableModel);
        table.setDefaultEditor(Object.class, null);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane, BorderLayout.SOUTH);
    }

    private void loadAllData() {
        String query = "SELECT name, phone, address, distance, memo FROM restaurants";
        documentDAO.executeQuery(query, tableModel);
    }

    private void insertRestaurant() {
        String name = nameField.getText();
        String phone = phoneField.getText();
        String address = addressField.getText();
        int distance = Integer.parseInt(distanceField.getText());
        String memo = memoField.getText();

        documentDAO.insertRestaurant(name, phone, address, distance, memo);
        loadAllData();
    }

    private void updateRestaurant() {
        String name = nameField.getText();
        String phone = phoneField.getText();
        String address = addressField.getText();
        int distance = Integer.parseInt(distanceField.getText());
        String memo = memoField.getText();

        documentDAO.updateRestaurant(name, phone, address, distance, memo);
        loadAllData();
    }

    private void deleteRestaurant() {
        String phone = phoneField.getText();

        documentDAO.deleteRestaurant(phone);
        loadAllData();
    }

    private void searchRestaurants() {
        String name = nameField.getText();
        String distanceText = distanceField.getText();

        String query;
        if (!name.isEmpty()) {
        	query = "SELECT name, phone, address, distance, memo FROM restaurants WHERE name LIKE '%" + name + "%'";
        } else if (!distanceText.isEmpty()) {
            int distance = Integer.parseInt(distanceText);
            query = "SELECT name, phone, address, distance, memo FROM restaurants WHERE distance <= " + distance;
        } else {
            query = "SELECT name, phone, address, distance, memo FROM restaurants";
        }

        documentDAO.executeQuery(query, tableModel);
    }
}
           
