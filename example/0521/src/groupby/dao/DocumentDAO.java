package groupby.dao;

import groupby.util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class DocumentDAO {

    public void executeQuery(String query, DefaultTableModel model) {
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;

        try {
            conn = DBConnection.getConnection();
            pstm = conn.prepareStatement(query);
            rs = pstm.executeQuery();

            int columnCount = rs.getMetaData().getColumnCount();

            model.setColumnCount(0);
            for (int i = 1; i <= columnCount; i++) {
                model.addColumn(rs.getMetaData().getColumnName(i));
            }

            model.setRowCount(0);
            while (rs.next()) {
                Object[] row = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    row[i - 1] = rs.getString(i);
                }
                model.addRow(row);
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (pstm != null) pstm.close();
                if (conn != null) conn.close(); // 연결을 닫습니다.
            } catch (SQLException e) {
                throw new RuntimeException(e.getMessage());
            }
        }
    }

    public void insertRestaurant(String name, String phone, String address, int distance, String memo) {
        String query = "INSERT INTO restaurants (name, phone, address, distance, memo) VALUES (?, ?, ?, ?, ?)";
        executeUpdate(query, name, phone, address, distance, memo);
    }

    public void updateRestaurant(String name, String phone, String address, int distance, String memo) {
        String query = "UPDATE restaurants SET name=?, address=?, distance=?, memo=? WHERE phone=?";
        executeUpdate(query, name, address, distance, memo, phone);
    }

    public void deleteRestaurant(String phone) {
        String query = "DELETE FROM restaurants WHERE phone=?";
        executeUpdate(query, phone);
    }

    private void executeUpdate(String query, Object... params) {
        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = DBConnection.getConnection();
            pstm = conn.prepareStatement(query);

            for (int i = 0; i < params.length; i++) {
                pstm.setObject(i + 1, params[i]);
            }
            pstm.executeUpdate();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        } finally {
            try {
                if (pstm != null) pstm.close();
                if (conn != null) conn.close(); // 연결을 닫습니다.
            } catch (SQLException e) {
                throw new RuntimeException(e.getMessage());
            }
        }
    }
}
