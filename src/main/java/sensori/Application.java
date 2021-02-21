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

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@Configuration
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) throws SQLException {

       JdbcTemplate jdbcTemplate = null;
        SpringApplication.run(Application.class, args);
        Connection c = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:C:/Users/User/IdeaProjects/sensori/aranet.db");
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        System.out.println("Opened database successfully");
        assert false;
        List<Metrics> sensors = jdbcTemplate.query("SELECT * from sensors",
                (resultSet, rowNum) -> new Metrics(resultSet.getString("metric_name")));

        sensors.forEach(System.out::println);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder applicationBuilder) {
        return applicationBuilder.sources(Application.class);
    }
}