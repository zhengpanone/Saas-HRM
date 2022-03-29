package com.zp.company;

import com.zp.common.utils.IdWorker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;

/**
 * @Author: zhengpanone
 * @Description:
 * @Date:Created in 2021/07/06 21:45.
 * @Email zhengpanone@hotmail.com
 * @Modified By:
 */
// 配置springboot的包扫描
@SpringBootApplication(scanBasePackages = "com.zp.company")
//配置JPA注解的扫描
@EntityScan(value = "com.zp.domain.company")
public class CompanyApplication {
    /**
     * 启动方法
     */
    public static void main(String[] args) {
        SpringApplication.run(CompanyApplication.class, args);
    }

    @Bean
    public IdWorker idWorker() {
        return new IdWorker();
    }
}
