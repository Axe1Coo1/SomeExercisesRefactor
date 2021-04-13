package homework.moduleFour.moduleEight.taskOne;

//Создайте таблицу в БД и с помощью JDBC выполните следующие действия
// извлеките информацию из таблицы с помощью подготовленного запроса;
// обновите несколько записей в таблице;
// выберите конкретную запись в таблице;
// вставьте новую запись в таблицу;
// удалите таблицу.

import java.sql.*;

import static jdbcPractice.Main.getConnection;

public class Main {
    static final String PASSWORD = "qwertyktyf220677";
    static final String USERNAME = "root";
    static final String URL = "jdbc:mysql://localhost/taskEight";


    public static void main(String[] args) throws SQLException {

        String sql = "create table planes\n" +
                "(\n" +
                "plane_num int not null primary key,\n" +
                "year_of_production date not null,\n" +
                "number_of_passengers int(5),\n" +
                "weight int(5) );\n";

        String sqlAddRecord = "insert into planes values ('3', '2020-01-01', '300', '14000')";

        String sqlUpdate = "update planes\n" +
                "set weight = 32000\n" +
                "where  plane_num = 3;";

        String sqlDropTable = "drop table planes";


        String select = "select * from taskEight.planes";

//        executeSql(sql);
//        executeSql(sqlAddRecord);
        executeSqlSelect(select);
//        executeSql(sqlDropTable);
//        executeSqlSelect(select);
        executeSql(sqlUpdate);
        executeSqlSelect(select);


    }


    public static Statement executeSql(String sql) throws SQLException {

        try (Connection connection = getConnection(URL, USERNAME, PASSWORD);
             Statement st = connection.createStatement()) {
            st.execute(sql);
            return st;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }


    public static void executeSqlSelect(String sql) throws SQLException {

        try(Connection connection = getConnection(URL, USERNAME, PASSWORD);
            Statement st = connection.createStatement()) {
            st.execute(sql);
            ResultSet resultSet = st.executeQuery(sql);
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


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
