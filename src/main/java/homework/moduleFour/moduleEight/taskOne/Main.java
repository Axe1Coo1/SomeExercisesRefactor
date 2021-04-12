package homework.moduleFour.moduleEight.taskOne;

//Создайте таблицу в БД и с помощью JDBC выполните следующие действия
// извлеките информацию из таблицы с помощью подготовленного запроса;
// обновите несколько записей в таблице;
// выберите конкретную запись в таблице;
// вставьте новую запись в таблицу;
// удалите таблицу.

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import static jdbcPractice.Main.getConnection;

public class Main {
    static final String PASSWORD = "qwertyktyf220677";
    static final String USERNAME = "root";
    static final String URL = "jdbc:mysql://localhost/taskEight";


    public static void main(String[] args) throws SQLException {
        createTable();


    }

    public static void createTable() throws SQLException {
        Connection connection = null;
        Statement st = null;
        try {
            System.out.println("Creating connection to database...");
            connection = getConnection();

            System.out.println("Creating table in selected database...");
            st = connection.createStatement();

            String sql = "create table planes\n" +
                    "(\n" +
                    "plane_num int not null primary key,\n" +
                    "year_of_production date not null,\n" +
                    "number_of_passengers int(5),\n" +
                    "weight int(5) );\n";

            st.execute(sql);
            System.out.println("Table successfully created...");



        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            if(st != null){
                st.close();
            }
            if(connection != null){
                connection.close();
            }
        }


    }

}
