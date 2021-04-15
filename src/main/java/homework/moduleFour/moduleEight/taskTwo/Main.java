package homework.moduleFour.moduleEight.taskTwo;

//Спроектируйте БД, хранящую информацию, например, о домашней библиотеке.
//Реализуйте функциональность добавления, поиска и удаления разнообразной информации из
//этой БД. При реализации используйте пул соединений и DAO.

import com.zaxxer.hikari.HikariDataSource;
import org.apache.log4j.BasicConfigurator;

import java.beans.PropertyVetoException;
import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws PropertyVetoException, SQLException {
        BasicConfigurator.configure();

        HikariDataSource ds = new HikariDataSource();
        ds.setJdbcUrl("jdbc:mysql://localhost/taskEight");
        ds.setUsername("root");
        ds.setPassword("qwertyktyf220677");


        try (Connection c = ds.getConnection();
             Statement st = c.createStatement()) {




            while (true){
                choseAction(c,st);
            }

        }

    }
    public static void choseAction(Connection c, Statement st) throws SQLException {

        Scanner input = new Scanner(System.in);
        int action = input.nextInt();
        switch (action){
            case 1: outPutTable(st);
            break;
            case 2: addTableEntry(st);


        }
    }

    private static void addTableEntry(Statement st) throws SQLException {
        
        st.execute("insert into planes values ('3', '2020-01-01', '300', '14000')");
    }

    public static void outPutTable(Statement st) throws SQLException {
        st.execute("select * from taskEight.planes");

        ResultSet resultSet = st.executeQuery("select * from taskEight.planes");
        while (resultSet.next()) {
            int plane_num = resultSet.getInt("plane_num");
            Date year_of_production = resultSet.getDate("year_of_production");
            int number_of_passengers = resultSet.getInt("number_of_passengers");
            int weight = resultSet.getInt("weight");

            System.out.println("\n================\n");
            System.out.println("plane_num: " + plane_num);
            System.out.println("year_of_production: " + year_of_production);
            System.out.println("number_of_passengers: " + number_of_passengers);
            System.out.println("weight: " + weight);
        }
    }
}
