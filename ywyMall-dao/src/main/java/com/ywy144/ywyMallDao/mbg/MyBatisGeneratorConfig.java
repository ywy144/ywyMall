package com.ywy144.ywyMallDao.mbg;

import org.mybatis.generator.config.*;

public class MyBatisGeneratorConfig {

    private static final String URL = "jdbc:mysql://localhost:3306/spring_boot_demo?useSSL=false&serverTimezone=UTC";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "144lujia";
    private static final String DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";

    public static Configuration buildConfiguration() {
        Context context = new Context(ModelType.CONDITIONAL);
        context.setId("simple");
        context.setTargetRuntime("MyBatis3DynamicSql"); // 影响生成的方法，简化版为MyBatis3Simple

        context.addProperty("javaFileEncoding", "UTF-8");

        CommentGeneratorConfiguration commentGeneratorConfig = new CommentGeneratorConfiguration();
        commentGeneratorConfig.addProperty("suppressAllComments", "true");
        context.setCommentGeneratorConfiguration(commentGeneratorConfig);

        JDBCConnectionConfiguration jdbcConnectionConfig = new JDBCConnectionConfiguration();
        jdbcConnectionConfig.setDriverClass(DRIVER_CLASS);
        //注意代码配置中JDBC连接字符串中的参数分隔符不需要再像xml配置文件中那样使用转义符
        jdbcConnectionConfig.setConnectionURL(URL);
        jdbcConnectionConfig.setUserId(USERNAME);
        jdbcConnectionConfig.setPassword(PASSWORD);
        jdbcConnectionConfig.addProperty("nullCatalogMeansCurrent", "true");//MySQL无法识别table标签中schema类的配置，所以在URL上指明目标数据库，并追加nullCatalogMeansCurrent属性为true
        jdbcConnectionConfig.addProperty("remarksReporting", "true");//针对oracle数据库无法读取表和字段备注
        jdbcConnectionConfig.addProperty("useInformationSchema", "true");//针对mysql数据库无法读取表和字段备注
        context.setJdbcConnectionConfiguration(jdbcConnectionConfig);

        JavaModelGeneratorConfiguration javaModelGeneratorConfig = new JavaModelGeneratorConfiguration();
        javaModelGeneratorConfig.setTargetProject("ywyMall-dao/src/main/java");//目标项目(源码主路径)
        javaModelGeneratorConfig.setTargetPackage("com.ywy144.ywymalldao.entity");//目标包(Model类文件存放包)
        context.setJavaModelGeneratorConfiguration(javaModelGeneratorConfig);

        /*SqlMapper生成器配置(*Mapper.xml类文件)，要javaClient生成器类型配合*/
        SqlMapGeneratorConfiguration sqlMapGeneratorConfig = new SqlMapGeneratorConfiguration();
        sqlMapGeneratorConfig.setTargetProject("ywyMall-dao/src/main/resources");//目标项目(源码主路径)
        sqlMapGeneratorConfig.setTargetPackage("mappers");//目标包(*Mapper.xml类文件存放包)
        context.setSqlMapGeneratorConfiguration(sqlMapGeneratorConfig);

        /*JavaClient生成器配置(*Mapper.java类文件)*/
        JavaClientGeneratorConfiguration javaClientGeneratorConfig = new JavaClientGeneratorConfiguration();
        javaClientGeneratorConfig.setConfigurationType("XMLMAPPER");//JavaClient生成器类型(主要有ANNOTATEDMAPPER、MIXEDMAPPER、XMLMAPPER，要Context的TargetRuntime配合)
        javaClientGeneratorConfig.setTargetProject("ywyMall-dao/src/main/java");//目标项目(源码主路径)
        javaClientGeneratorConfig.setTargetPackage("com.ywy144.ywymalldao.mapper");//目标包(*Mapper.java类文件存放包)
        context.setJavaClientGeneratorConfiguration(javaClientGeneratorConfig);

        /*表生成配置*/
        TableConfiguration tableConfig = getTableConfiguration("product_base_info", "ProductBaseInfo", context);
        context.addTableConfiguration(tableConfig);

        Configuration config = new Configuration();
        config.addContext(context);

        return config;
    }

    public static TableConfiguration getTableConfiguration(String tableName, String domainObjectName, Context context) {
        TableConfiguration tableConfig = new TableConfiguration(context);
        tableConfig.setTableName(tableName); // %:所有表
        tableConfig.setDomainObjectName(domainObjectName);
        GeneratedKey generatedKey = new GeneratedKey("id", "JDBC", true, null);//设置主键列和生成方式
        tableConfig.setGeneratedKey(generatedKey);
        tableConfig.setCountByExampleStatementEnabled(true);
        tableConfig.setDeleteByExampleStatementEnabled(true);
        tableConfig.setSelectByExampleStatementEnabled(true);
        tableConfig.setUpdateByExampleStatementEnabled(true);
        tableConfig.setSelectByExampleQueryId("true");
        return tableConfig;
    }
}
