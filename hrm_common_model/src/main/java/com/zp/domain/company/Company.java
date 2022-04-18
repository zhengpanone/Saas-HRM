package com.zp.domain.company;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.Date;

/**
 * @Author: zhengpanone
 * @Description:
 * @Date:Created in 2021/07/06 21:20.
 * @Email zhengpanone@hotmail.com
 * @Modified By:
 */
@Entity
@Table(name = "co_company")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "企业实体类")
public class Company implements Serializable {
    //ID
    @Id
    @ApiModelProperty(value = "企业ID")
    private String id;
    /**
     * 公司名称
     */
    @NotEmpty(message = "企业名称不能为空")
    @ApiModelProperty(value = "企业名称",required = true)
    private String name;
    /**
     * 企业登录账号ID
     */
    @ApiModelProperty(value = "企业登录账号ID")
    private String managerId;
    /**
     * 当前版本
     */
    @ApiModelProperty("当前版本")
    private String version;
    /**
     * 续期时间
     */
    @ApiModelProperty("续期时间")
    private Date renewalDate;
    /**
     * 到期时间
     */
    @ApiModelProperty("到期时间")
    private Date expirationDate;
    /**
     * 公司地区
     */
    @ApiModelProperty("公司地区")
    private String companyArea;
    /**
     * 公司地址
     */
    @ApiModelProperty("公司地址")
    private String companyAddress;
    /**
     * 营业执照-图片ID
     */
    @ApiModelProperty("营业执照图片ID")
    private String businessLicenseId;
    /**
     * 法人代表
     */
    @ApiModelProperty("法人代表")
    private String legalRepresentative;
    /**
     * 公司电话
     */
    @ApiModelProperty("公司电话")
    private String companyPhone;
    /**
     * 邮箱
     */
    @ApiModelProperty("公司邮箱")
    private String mailbox;
    /**
     * 公司规模
     */
    @ApiModelProperty("公司规模")
    private String companySize;
    /**
     * 所属行业
     */
    @ApiModelProperty("所属行业")
    private String industry;
    /**
     * 备注
     */
    @ApiModelProperty("备注")
    private String remarks;
    /**
     * 审核状态
     */
    @ApiModelProperty("审核状态")
    private String auditState;
    /**
     * 状态
     */
    @ApiModelProperty("企业状态")
    private Integer state;
    /**
     * 当前余额
     */
    @ApiModelProperty("当前余额")
    private Double balance;
    /**
     * 创建时间
     */
    @ApiModelProperty("创建时间")
    private Date createTime;

}
