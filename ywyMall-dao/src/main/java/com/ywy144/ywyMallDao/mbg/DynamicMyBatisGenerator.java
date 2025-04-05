package com.ywy144.ywyMallDao.mbg;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.*;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DynamicMyBatisGenerator {


    public static void main(String[] args) throws SQLException, InvalidConfigurationException, IOException, InterruptedException {
        List<String> warnings = new ArrayList<>();
        boolean overwrite = true;
        Configuration config = MyBatisGeneratorConfig.buildConfiguration();
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
        for (String warning : warnings) {
            System.out.println(warning);
        }
    }
}
