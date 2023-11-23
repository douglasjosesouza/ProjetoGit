package com.gm2.cryptoApp.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.gm2.cryptoApp.DTO.CoinDTO;
import com.gm2.cryptoApp.entity.Coin;

@Repository
@EnableAutoConfiguration
public class CoinRepository {
	
	/*referencia as funcionalidades do JDBC, na instancia "jdbcTemplate"*/
	private JdbcTemplate jdbcTemplate;
	
	private static String INSERT = "insert into coin (name, datatime, price, quantity) values (?,?,?,?)";
	
	private static String SELECT_ALL="select name, sum(quantity) as quantity from coin group by name";
	
	/*construtor inicializa o jdbcTemplate*/
	public CoinRepository(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate; 
	}
	
	public Coin insert(Coin coin) {
		Object[] attr = new Object[] {
				coin.getName(),
				coin.getDatatime(),
				coin.getPrice(),
				coin.getQuantity()
		};
		jdbcTemplate.update(INSERT,attr);
		return coin;
		
	}
	
	public List<CoinDTO> getAll(){
		return jdbcTemplate.query(SELECT_ALL, new RowMapper<CoinDTO>(){
			@Override
			public CoinDTO mapRow(ResultSet rs, int rowNum) throws SQLException{
				
				CoinDTO coin = new CoinDTO();
				coin.setName(rs.getString("name"));
				coin.setQuantity(rs.getBigDecimal("quantity"));
				
				return coin;
				
			}
		});
	}

}
