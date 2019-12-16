package database;

import java.sql.*;

public class DataBaseConnection {
    private String USERNAME = "root";
    private String PASSWORD = "root";
    private String CONNECTION = "jdbc:mysql://localhost:3316/quizgame?serverTimezone=UTC";
    private Connection connection;
    private Statement statement;

    public DataBaseConnection() {
        try {this.statement=statement();} catch (Exception e) {
            System.out.println(e);}
    }


    private Statement statement() throws Exception {
        this.connection= DriverManager.getConnection(CONNECTION, USERNAME, PASSWORD);
        this.statement=connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        return statement;
    }

    public Statement getStatement() {
        return statement;
    }
}


