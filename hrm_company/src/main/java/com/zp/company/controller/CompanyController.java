package com.zp.company.controller;

import com.zp.common.entity.Result;
import com.zp.common.entity.ResultCode;
import com.zp.company.service.impl.CompanyServiceImpl;
import com.zp.domain.company.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: zhengpanone
 * @Description:
 * @Date:Created in 2021/07/07 10:18.
 * @Email zhengpanone@hotmail.com
 * @Modified By:
 */
@RestController
@RequestMapping(value = "/company")
public class CompanyController {
    @Autowired
    private CompanyServiceImpl companyService;

    /**
     * 保存企业
     *
     * @param company
     * @return
     */
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Result save(@RequestBody Company company) {
        companyService.save(company);
        return new Result(ResultCode.SUCCESS);
    }

    /**
     * 根据id更新企业
     *
     * @param id
     * @param company
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result update(@PathVariable String id, @RequestBody Company company) {
        company.setId(id);
        companyService.update(company);
        return new Result(ResultCode.SUCCESS);
    }

    /**
     * 根据ID删除企业
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result delete(@PathVariable String id) {
        companyService.deleteById(id);
        return new Result(ResultCode.SUCCESS);
    }

    /**
     * 根据id查询企业
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result findById(@PathVariable String id) {
        Company company = companyService.findById(id);
        return new Result(ResultCode.SUCCESS, company);
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public Result findAll() {
        List<Company> all = companyService.findAll();
        return new Result(ResultCode.SUCCESS, all);
    }
}
