package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.KplCsvceshiMapper;
import com.ruoyi.system.domain.KplCsvceshi;
import com.ruoyi.system.service.IKplCsvceshiService;
import com.ruoyi.common.core.text.Convert;

/**
 * 客户信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-08-19
 */
@Service
public class KplCsvceshiServiceImpl implements IKplCsvceshiService 
{
    @Autowired
    private KplCsvceshiMapper kplCsvceshiMapper;

    /**
     * 查询客户信息
     * 
     * @param id 客户信息ID
     * @return 客户信息
     */
    @Override
    public KplCsvceshi selectKplCsvceshiById(Long id)
    {
        return kplCsvceshiMapper.selectKplCsvceshiById(id);
    }

    /**
     * 查询客户信息列表
     * 
     * @param kplCsvceshi 客户信息
     * @return 客户信息
     */
    @Override
    public List<KplCsvceshi> selectKplCsvceshiList(KplCsvceshi kplCsvceshi)
    {
        return kplCsvceshiMapper.selectKplCsvceshiList(kplCsvceshi);
    }

    /**
     * 新增客户信息
     * 
     * @param kplCsvceshi 客户信息
     * @return 结果
     */
    @Override
    public int insertKplCsvceshi(KplCsvceshi kplCsvceshi)
    {
        kplCsvceshi.setCreateTime(DateUtils.getNowDate());
        return kplCsvceshiMapper.insertKplCsvceshi(kplCsvceshi);
    }

    /**
     * 修改客户信息
     * 
     * @param kplCsvceshi 客户信息
     * @return 结果
     */
    @Override
    public int updateKplCsvceshi(KplCsvceshi kplCsvceshi)
    {
        return kplCsvceshiMapper.updateKplCsvceshi(kplCsvceshi);
    }

    /**
     * 删除客户信息对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteKplCsvceshiByIds(String ids)
    {
        return kplCsvceshiMapper.deleteKplCsvceshiByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除客户信息信息
     * 
     * @param id 客户信息ID
     * @return 结果
     */
    @Override
    public int deleteKplCsvceshiById(Long id)
    {
        return kplCsvceshiMapper.deleteKplCsvceshiById(id);
    }
}
