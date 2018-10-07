package com.sda.chatappserver.wwkwkdmg;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import javax.sql.DataSource;


//@Configuration
@ComponentScan(basePackages = {"com.sda.chatappserver.wwkwkdmg.repository"})
//@EnableTransactionManagement
@SpringBootTest
public class WwkwkdmgApplicationTests {

    @Test
    @Bean
    public DataSource dataSource() {
        return new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.H2).addScript("classpath:sql/schema.sql")
                .addScript("classpath:sql/test-data.sql")
                .build();
    }

    /*@Test
    public void contextLoads() {
    }*/

}
