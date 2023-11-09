package io.hugang.demo.generator.config;

import cn.hutool.core.util.StrUtil;

/**
 * 数据库类型 枚举
 */
public enum DbType {
    MySQL("com.mysql.cj.jdbc.Driver"),
    Oracle("oracle.jdbc.driver.OracleDriver"),
    PostgreSQL("org.postgresql.Driver"),
    SQLServer("com.microsoft.sqlserver.jdbc.SQLServerDriver"),
    Clickhouse("com.clickhouse.jdbc.ClickHouseDriver");

    private final String driverClass;

    DbType(String driverClass) {
        this.driverClass = driverClass;
    }

    public String getDriverClass() {
        return driverClass;
    }

    public static DbType getValue(String dbType) {
        if (StrUtil.equalsAny(dbType, "MySQL")) {
            return MySQL;
        }

        if (StrUtil.equalsAny(dbType, "Oracle")) {
            return Oracle;
        }

        if (StrUtil.equalsAny(dbType, "PostgreSQL")) {
            return PostgreSQL;
        }

        if (StrUtil.equalsAny(dbType, "SQLServer", "Microsoft SQL Server")) {
            return SQLServer;
        }

        if (StrUtil.equalsAny(dbType, "Clickhouse")) {
            return Clickhouse;
        }

        return null;
    }
}
