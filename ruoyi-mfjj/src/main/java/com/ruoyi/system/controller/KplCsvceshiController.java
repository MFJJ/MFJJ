package com.ruoyi.system.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.KplCsvceshi;
import com.ruoyi.system.service.IKplCsvceshiService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 客户信息Controller
 * 
 * @author ruoyi
 * @date 2020-08-19
 */
@Controller
@RequestMapping("/system/csvceshi")
public class KplCsvceshiController extends BaseController
{
    private String prefix = "system/csvceshi";

    @Autowired
    private IKplCsvceshiService kplCsvceshiService;

    @RequiresPermissions("system:csvceshi:view")
    @GetMapping()
    public String csvceshi()
    {
        return prefix + "/csvceshi";
    }

    /**
     * 查询客户信息列表
     */
    @RequiresPermissions("system:csvceshi:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(KplCsvceshi kplCsvceshi)
    {
        startPage();
        List<KplCsvceshi> list = kplCsvceshiService.selectKplCsvceshiList(kplCsvceshi);
        return getDataTable(list);
    }

    /**
     * 导出客户信息列表
     */
    @RequiresPermissions("system:csvceshi:export")
    @Log(title = "客户信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(KplCsvceshi kplCsvceshi)
    {
        List<KplCsvceshi> list = kplCsvceshiService.selectKplCsvceshiList(kplCsvceshi);
        ExcelUtil<KplCsvceshi> util = new ExcelUtil<KplCsvceshi>(KplCsvceshi.class);
        return util.exportExcel(list, "csvceshi");
    }

    /**
     * 新增客户信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存客户信息
     */
    @RequiresPermissions("system:csvceshi:add")
    @Log(title = "客户信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(KplCsvceshi kplCsvceshi)
    {
        return toAjax(kplCsvceshiService.insertKplCsvceshi(kplCsvceshi));
    }

    /**
     * 修改客户信息
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        KplCsvceshi kplCsvceshi = kplCsvceshiService.selectKplCsvceshiById(id);
        mmap.put("kplCsvceshi", kplCsvceshi);
        return prefix + "/edit";
    }

    /**
     * 修改保存客户信息
     */
    @RequiresPermissions("system:csvceshi:edit")
    @Log(title = "客户信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(KplCsvceshi kplCsvceshi)
    {
        return toAjax(kplCsvceshiService.updateKplCsvceshi(kplCsvceshi));
    }

    /**
     * 删除客户信息
     */
    @RequiresPermissions("system:csvceshi:remove")
    @Log(title = "客户信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(kplCsvceshiService.deleteKplCsvceshiByIds(ids));
    }
}
