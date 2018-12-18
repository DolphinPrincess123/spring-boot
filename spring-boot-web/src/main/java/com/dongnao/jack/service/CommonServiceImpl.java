package com.dongnao.jack.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.dongnao.jck.bean.ConsultContent;

@Service
public class CommonServiceImpl implements CommonService {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<ConsultContent> queryContent(Map map) {

		String sql = "select * from consule_content a where a.state=0 and a.type=1 order by a.itemindex ";

		return jdbcTemplate.query(sql, new RowMapper<ConsultContent>() {

			@Override
			public ConsultContent mapRow(ResultSet rs, int rowNum) throws SQLException {

				ConsultContent cc = new ConsultContent();
				cc.setContent(rs.getString("content"));

				cc.setId(rs.getInt("id"));
				cc.setItemIndex(rs.getInt("itemIndex"));
				cc.setState(rs.getInt("state"));
				cc.setType(rs.getString("type"));
				return cc;
			}

		});
	}

}
