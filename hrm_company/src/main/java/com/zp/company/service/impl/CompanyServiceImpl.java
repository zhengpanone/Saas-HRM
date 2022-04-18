package com.zp.company.service.impl;

import com.zp.common.utils.IdWorker;
import com.zp.company.dao.ICompanyDao;
import com.zp.company.enums.AuditStateEnum;
import com.zp.company.service.ICompanyService;
import com.zp.domain.company.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: zhengpanone
 * @Description:
 * @Date:Created in 2021/07/07 10:01.
 * @Email zhengpanone@hotmail.com
 * @Modified By:
 */
@Service
public class CompanyServiceImpl implements ICompanyService {
    @Autowired
    private ICompanyDao companyDao;
    @Autowired
    private IdWorker idWorker;

    /**
     * 保存企业
     * 1. 配置idwork到工程
     * 2. 在service中注入idwork
     * 3. 通过idwork生产id
     * 4. 保存企业
     *
     * @param company 企业
     */
    public void save(Company company) {
        String id = idWorker.nextId() + "";
        company.setId(id);
        company.setAuditState(AuditStateEnum.UN_AUDIT_STATE.getValue()); // 0: 未审核, 1: 已审核
        company.setState(0); // 0: 未激活, 1: 已激活
        companyDao.save(company);
    }

    /**
     * 更新企业
     *
     * @param company
     */
    public void update(Company company) {
        Company byId = companyDao.findById(company.getId()).get();
        byId.setName(company.getName());
        companyDao.save(byId);
    }

    /**
     * 删除企业
     *
     * @param id
     */
    public void deleteById(String id) {
        companyDao.deleteById(id);
    }

    /**
     * 根据ID查询
     *
     * @param id
     * @return
     */
    public Company findById(String id) {
        return companyDao.findById(id).get();

    }

    /**
     * 查询企业列表
     *
     * @return
     */
    public List<Company> findAll() {
        return companyDao.findAll();
    }
}
