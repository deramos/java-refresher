package com.kairos.java.jdbc;

import java.sql.*;

public class JDBCExample {
    /*
        import package
        load and register
        create connection
        create statement
        execute statement
        process the results
        close
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:postgresql://localhost:5432/jdbc-demo";
        String uName = "postgres";
        String password = "k0l0";
        String query = "select * from student";

        Class.forName("org.postgresql.Driver");
        Connection conn = DriverManager.getConnection(url, uName, password);
        System.out.println("Connection Established");
        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        while(resultSet.next()){
            System.out.println(resultSet.getInt("sid") + ": "
                    + resultSet.getString("sname") + ", scored "
                    + resultSet.getInt("marks"));
        }

        conn.close();
        System.out.println("Connection Closed");
    }
}
