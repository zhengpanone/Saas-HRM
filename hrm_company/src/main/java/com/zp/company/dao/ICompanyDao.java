package com.zp.company.dao;

import com.zp.domain.company.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @Author: zhengpanone
 * @Description:
 * @Date:Created in 2021/07/07 9:29.
 * @Email zhengpanone@hotmail.com
 * @Modified By:
 */
public interface ICompanyDao extends JpaRepository<Company, String>, JpaSpecificationExecutor<Company> {

}
