package com.javarush.task.task21.task2111;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

/* 
Освобождаем ресурсы
*/

public class Solution {
    private Connection connection;

    public Solution(Connection connection) {
        this.connection = connection;
    }

    @Override
    protected void finalize() {
        if (connection != null) {

            try {
                super.finalize();
                connection.close();
                System.out.println("Closed BufferedReader in the finalizer");
            } catch (Throwable e) {
                e.printStackTrace();
                // ...
            }

        }
    }

    public List<User> getUsers() {
        String query = "select ID, DISPLAYED_NAME, LEVEL, LESSON from USER";

        List<User> result = new LinkedList<>();

//        Statement stmt = null;
//        ResultSet rs = null;

        try (Statement stmt = connection.createStatement(); ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                int id = rs.getInt("ID");
                String name = rs.getString("DISPLAYED_NAME");
                int level = rs.getInt("LEVEL");
                int lesson = rs.getInt("LESSON");

                result.add(new User(id, name, level, lesson));

            }
        } catch (SQLException e) {
            e.printStackTrace();
            result = null;
        } catch (Throwable t) {
            t.printStackTrace();
        }
//        finally {
//
//            try {
//                finalize();
//            } catch (Throwable t) {
//                t.printStackTrace();
//            }
//
//            if (stmt != null) {
//                try {
//                    stmt.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//            if (rs != null) {
//                try {
//                    rs.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
        return result;
    }

    public static class User {
        private int id;
        private String name;
        private int level;
        private int lesson;

        public User(int id, String name, int level, int lesson) {
            this.id = id;
            this.name = name;
            this.level = level;
            this.lesson = lesson;
        }

        @Override
        public String toString() {
            return "User{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", level=" + level +
                    ", lesson=" + lesson +
                    '}';
        }
    }

    public static void main(String[] args) {

    }
}
