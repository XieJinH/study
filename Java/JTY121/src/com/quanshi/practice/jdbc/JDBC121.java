package com.quanshi.practice.jdbc;

import java.sql.*;

public class JDBC121 {
    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jty121?userSSL=false&serverTimezone=Asia/Shanghai&useUnicode=true&characterEncoding=utf-8", "root", "root");

            statement = connection.createStatement();

            String sql = "select * from students";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String name = resultSet.getString("name");
                String sex = resultSet.getString("sex");
                Integer age = resultSet.getInt("age");
                String major = resultSet.getString("major");
                Integer classNo = resultSet.getInt("class_no");

                System.out.println("name=" + name + " sex=" + sex + " age=" + age + " major=" + major + " classNo=" + classNo);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 关闭资源
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (connection != null) {
                    connection.close();
                }
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
