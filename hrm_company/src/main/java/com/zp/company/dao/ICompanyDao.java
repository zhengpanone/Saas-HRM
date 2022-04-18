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
 * JpaRepository<实体类,主键>
 *  JapSpecificationExecutor<实体类>
 */
public interface ICompanyDao extends JpaRepository<Company, String>, JpaSpecificationExecutor<Company> {

}
