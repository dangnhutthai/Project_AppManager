/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
package Connection;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class MySQLConnect {
    public static Connection getJDBCConnection() throws SQLException {
        final String url = "jdbc:mysql://localhost:3306/test";
        final String user = "root";
        final String password = "dangnhutthai";
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
        @SuppressWarnings("null")
		public static void main(String[] args) throws SQLException {
        Connection connection = getJDBCConnection();
        
        if (connection != null) {
            System.out.println("Data connection successful");
        } else {
            System.out.println("Data connection failed");
        }
//        try {
//        	Statement st = connection.createStatement();
//        	String sql = "insert into sanPham value ('SP26', 'K�NH R�M HOI XAU', '12600000','H�nh d?ng h�nh Tr�n v?i s? h?p d?n c?a trang ph?c th? thao', 'M�u N�u', 'L02')";
//        	int check = st.executeUpdate(sql);
//        	System.out.println("S? d�ng thay ??i: " + check);
//        	if(check > 0) {
//        		System.out.println("add success!");
//        		
//        	}else {
//        		System.out.println("add fail!!");
//        	}
//        }catch(SQLException e) {
//        	e.printStackTrace();
//        }
        Statement stmt = null;
        ResultSet rs = null;
        try {
        	stmt = connection.createStatement();
        	rs = stmt.executeQuery("SELECT foo FROM bar");
        	if(stmt.execute("SELECT foo FROM bar")) {
        		rs = stmt.getResultSet();        	
        		}
        }catch(SQLException e) {
        	
        }
        finally {
        	if (rs!=null) {
        		try {
        			rs.close();
        		}catch(SQLException sqle) {
        			stmt = null;
        		}
        	}
        }
        CallableStatement cstmt = null;
        cstmt = connection.prepareCall("{call sp_SortPriceByType(?)}");
        cstmt.setString(1, "Nam");
        ResultSet rss = cstmt.executeQuery();
        System.out.println("Danh sach cac loai kinh Nu");
        while(rss.next()) {
        	String nameproducts = rss.getString("ten_san_pham");
        	String priceproducts = rss.getString("gia_san_pham");
        	System.out.println(nameproducts +"\t"+ priceproducts);
        }
        
        
            new sign_log.SignUp().setVisible(true);
    }
}
