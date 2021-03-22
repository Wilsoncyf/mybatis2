package com.kkb.mybatis.sqlsource;

import java.util.List;

import com.kkb.mybatis.sqlsource.iface.SqlSource;

public class StaticSqlSource implements SqlSource {

	private String sql;

	private List<ParameterMapping> parameterMappings;

	public StaticSqlSource(String sql, List<ParameterMapping> parameterMappings) {
		super();
		this.sql = sql;
		this.parameterMappings = parameterMappings;
	}

	@Override
	public BoundSql getBoundSql(Object paramObject) {
		return new BoundSql(sql, parameterMappings);
	}

}
