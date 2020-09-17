package com.assetImportance;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author yxf
 */
@MapperScan("com.assetImportance.dao.mapper")
@SpringBootApplication
public class AssetImportanceApplication {

    public static void main(String[] args) {

        SpringApplication.run(AssetImportanceApplication.class, args);
    }

}
