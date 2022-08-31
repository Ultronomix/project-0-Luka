package com.revature.project0.users;

import com.revature.project0.common.datasource.ConnectionFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

// DAO = Data Access Object
public class UserDAO {

    public List<User> getAllUsers() {

        String sql = "SELECT au.id, au.given_name, au.surname, au.email, au.username, au.role_id, ur.role " +
                     "FROM app_users au " +
                     "JOIN user_roles ur " +
                     "ON au.role_id = ur.id";

        List<User> allUsers = new ArrayList<>();

        try (Connection conn = ConnectionFactory.getInstance().getConnection()) {

            // JDBC Statement objects are vulnerable to SQL injection
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                User user = new User();
                user.setId(rs.getString("id"));
                user.setUserName(rs.getString("user_name"));
                user.setPaycheck(rs.getInt("paycheck"));
                allUsers.add(user);
            }

        } catch (SQLException e) {
            System.err.println("Something went wrong when communicating with the database");
            e.printStackTrace();
        }

        return allUsers;

    }

    public String save(User user) {

        String sql = "INSERT INTO app_users (given_name, surname, email, username, password, role_id) " +
                     "VALUES (?, ?, ?, ?, ?, '5a2e0415-ee08-440f-ab8a-778b37ff6874')";

        try (Connection conn = ConnectionFactory.getInstance().getConnection()) {

            PreparedStatement pstmt = conn.prepareStatement(sql, new String[] {"id"});
            pstmt.setString(1, user.getId());
            pstmt.setString(2, user.getUserName());
            pstmt.setInt(3, user.getPaycheck());

            pstmt.executeUpdate();

            ResultSet rs = pstmt.getGeneratedKeys();
            rs.next();
            user.setId(rs.getString("id"));

        } catch (SQLException e) {
            System.err.println("Something went wrong when communicating with the database");
            e.printStackTrace();
        }

        return user.getId();

    }
}
