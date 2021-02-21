package sensori;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import sensori.models.Metrics;

import javax.swing.*;
import java.sql.*;
import java.util.List;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@Configuration
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) throws SQLException {

        SpringApplication.run(Application.class, args);

        Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\User\\IdeaProjects\\sensori\\aranet.db");;
        ResultSet resultSet = null;
        Statement statement = null;
        try {
            Class.forName("org.sqlite.JDBC");
            connection.setAutoCommit(false);
            System.out.println("Opened database successfully");
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM metrics");
            while (resultSet.next()) {
                System.out.println("ISBN NAME:"
                        + resultSet.getString("metric_name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
//                resultSet.close();
//                statement.close();
//                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder applicationBuilder) {
        return applicationBuilder.sources(Application.class);
    }
}