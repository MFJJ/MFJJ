package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 客户信息对象 kpl_csvceshi
 * 
 * @author ruoyi
 * @date 2020-08-19
 */
public class KplCsvceshi extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** null */
    private Long id;

    /** 客户姓名 */
    @Excel(name = "客户姓名")
    private String name;

    /** 客户性别 */
    @Excel(name = "客户性别")
    private String sex;

    /** 手机号码 */
    @Excel(name = "手机号码")
    private String phone;

    /** 楼盘地址 */
    @Excel(name = "楼盘地址")
    private String address;

    /** 来访次数 */
    @Excel(name = "来访次数")
    private Long frequency;

    /** 客户类别 */
    @Excel(name = "客户类别")
    private Long category;

    /** 营销员 */
    @Excel(name = "营销员")
    private String salesman;

    /** 设计师 */
    @Excel(name = "设计师")
    private String designer;

    /** 客服 */
    @Excel(name = "客服")
    private String customer;

    /** 注释备注 */
    @Excel(name = "注释备注")
    private String comment;

    /** 状态 */
    private Long status;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setSex(String sex) 
    {
        this.sex = sex;
    }

    public String getSex() 
    {
        return sex;
    }
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }
    public void setFrequency(Long frequency) 
    {
        this.frequency = frequency;
    }

    public Long getFrequency() 
    {
        return frequency;
    }
    public void setCategory(Long category) 
    {
        this.category = category;
    }

    public Long getCategory() 
    {
        return category;
    }
    public void setSalesman(String salesman) 
    {
        this.salesman = salesman;
    }

    public String getSalesman() 
    {
        return salesman;
    }
    public void setDesigner(String designer) 
    {
        this.designer = designer;
    }

    public String getDesigner() 
    {
        return designer;
    }
    public void setCustomer(String customer) 
    {
        this.customer = customer;
    }

    public String getCustomer() 
    {
        return customer;
    }
    public void setComment(String comment) 
    {
        this.comment = comment;
    }

    public String getComment() 
    {
        return comment;
    }
    public void setStatus(Long status) 
    {
        this.status = status;
    }

    public Long getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("sex", getSex())
            .append("phone", getPhone())
            .append("address", getAddress())
            .append("frequency", getFrequency())
            .append("category", getCategory())
            .append("salesman", getSalesman())
            .append("designer", getDesigner())
            .append("customer", getCustomer())
            .append("comment", getComment())
            .append("createTime", getCreateTime())
            .append("status", getStatus())
            .toString();
    }
}
