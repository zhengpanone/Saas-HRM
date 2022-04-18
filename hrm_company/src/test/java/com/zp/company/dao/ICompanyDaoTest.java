package com.zp.company.dao;

import com.zp.domain.company.Company;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.Optional;

/**
 * @Author: zhengpanone
 * @Description:
 * @Date:Created in 2021/07/07 9:30.
 * @Email zhengpanone@hotmail.com
 * @Modified By:
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class ICompanyDaoTest {
    @Autowired
    private ICompanyDao companyDao;

    @Test
    public void testFindAll() {
        List<Company> all = companyDao.findAll();
        System.out.println(all);

    }

    @Test
    public void testFindById() {
        Optional<Company> byId = companyDao.findById("1");
        Company company = byId.get();
        System.out.println(company);
    }
}
