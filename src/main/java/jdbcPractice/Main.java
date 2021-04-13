package jdbcPractice;


import java.sql.*;


public class Main {
    static final String PASSWORD = "qwertyktyf220677";
    static final String USERNAME = "root";
    static final String URL = "jdbc:mysql://localhost/lr3";



    public static void main(String[] args) throws SQLException {


        Connection connection = getConnection(URL, USERNAME, PASSWORD);

        try {
            connection.createStatement().execute("select * from LR3.aeroport_workers");

            Statement st = connection.createStatement();

            String sql = "select * from LR3.aeroport_workers";

            ResultSet resultSet = st.executeQuery(sql);

            while (resultSet.next()) {
                int worker_num = resultSet.getInt("worker_num");
                String fio = resultSet.getString("fio");
                Date born_date = resultSet.getDate("born_date");
                Date year_of_employment = resultSet.getDate("year_of_employment");
                String adres = resultSet.getString("adres");
                String position = resultSet.getString("position");
                String phone_number = resultSet.getString("phone_number");
                int experience = resultSet.getInt("experience");
                String city = resultSet.getString("city");
                String gender = resultSet.getString("gender");

                System.out.println("\n================\n");
                System.out.println("worker_num: " + worker_num);
                System.out.println("fio: " + fio);
                System.out.println("born_date: " + born_date);
                System.out.println("year_of_employment: " + year_of_employment);
                System.out.println("adres: " + adres);
                System.out.println("position: " + position);
                System.out.println("phone_number: " + phone_number);
                System.out.println("experience: " + experience);
                System.out.println("city: " + city);
                System.out.println("gender: " + gender);


            }


        } catch (Exception e) {
            System.out.println("Something went wrong =(");
        } finally {
            if (connection != null) {
                connection.close();
            }
        }

    }

    public static Connection getConnection(String URL, String USERNAME, String PASSWORD) throws SQLException {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        }catch (Exception e){
            System.out.println("Connection failed!");
        }
        return connection;
    }
}
