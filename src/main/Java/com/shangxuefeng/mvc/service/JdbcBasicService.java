package com.shangxuefeng.mvc.service;

import com.shangxuefeng.mvc.bean.City;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author shangxuefeng @date 2018/3/29
 */
public class JdbcBasicService {
    private DriverManagerDataSource dataSource;
    private JdbcTemplate jdbcTemplate;
    public JdbcBasicService(){
        dataSource=new DriverManagerDataSource();
                 dataSource.setDriverClassName("com.mysql.jdbc.Driver");
                 dataSource.setUrl("jdbc:mysql:///my_test");
                 dataSource.setUsername("root");
                 dataSource.setPassword("admin123");

        jdbcTemplate=new JdbcTemplate(dataSource);
    }


    public void basicSelect(){
        List<City> list = jdbcTemplate.query("select * from city", new RowMapper<City>() {
            public City mapRow(ResultSet rs, int rowNum) throws SQLException {
                City city = new City();
                city.setId(rs.getInt("id"));
                city.setName(rs.getString("name"));
                city.setDescription(rs.getString("description"));
                return city;
            }
        });

        System.out.println(list);
    }

    public static void main(String[] args){
        JdbcBasicService jdbcBasicService = new JdbcBasicService();
        jdbcBasicService.basicSelect();
    }

}
