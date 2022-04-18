package com.zp.company.controller;

import com.zp.common.entity.Result;
import com.zp.common.entity.ResultCode;
import com.zp.company.service.impl.CompanyServiceImpl;
import com.zp.domain.company.Company;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Null;
import javax.xml.stream.events.Comment;
import java.util.List;

/**
 * @Author: zhengpanone
 * @Description:
 * @Date:Created in 2021/07/07 10:18.
 * @Email zhengpanone@hotmail.com
 * @Modified By:
 */
@Api(tags = "企业相关接口")
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
    @PostMapping(value = "/")
    @ApiOperation("保存企业")
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
    @PutMapping(value = "/{id}")
    @ApiOperation("根据ID更新企业")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "企业ID", required = true, paramType = "path", dataType = "string")
    })
    public Result<Null> update(@PathVariable  String id, @RequestBody Company company) {
        company.setId(id);
        companyService.update(company);
        return new Result<>(ResultCode.SUCCESS);
    }

    /**
     * 根据ID删除企业
     *
     * @param id
     * @return
     */
    @DeleteMapping(value = "/{id}")
    @ApiOperation("根据ID删除企业")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "企业ID", required = true, paramType = "path", dataType = "string")
    })
    public Result<Null> delete(@PathVariable String id) {
        companyService.deleteById(id);
        return new Result<>(ResultCode.SUCCESS);
    }

    /**
     * 根据id查询企业
     *
     * @param id
     * @return
     */
    @GetMapping(value = "/{id}")
    @ApiOperation("根据ID查询企业")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "企业ID", required = true, paramType = "path", dataType = "string")
    })
    @ApiResponses(@ApiResponse(code = 1000, message = "操作成功！", response = Company.class))

    public Result<Company> findById(@PathVariable String id) {
        Company company = companyService.findById(id);
        return new Result<>(ResultCode.SUCCESS, company);
    }

    @GetMapping(value = "/")
    @ApiOperation("查找所有企业")
    public Result<List<Company>> findAll() {
        List<Company> all = companyService.findAll();
        return new Result<>(ResultCode.SUCCESS, all);
    }
}
