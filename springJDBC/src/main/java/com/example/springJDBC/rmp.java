package com.example.springJDBC;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class rmp implements RowMapper<One> {

    @Override
    public One mapRow(ResultSet rs, int rowNum) throws SQLException {
        One obj = new One();
        obj.setName(rs.getString(1));  
        obj.setEmail(rs.getString(2));  
        return obj;
    }
}
