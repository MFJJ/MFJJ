package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.KplCsvceshi;

/**
 * 客户信息Mapper接口
 * 
 * @author ruoyi
 * @date 2020-08-19
 */
public interface KplCsvceshiMapper 
{
    /**
     * 查询客户信息
     * 
     * @param id 客户信息ID
     * @return 客户信息
     */
    public KplCsvceshi selectKplCsvceshiById(Long id);

    /**
     * 查询客户信息列表
     * 
     * @param kplCsvceshi 客户信息
     * @return 客户信息集合
     */
    public List<KplCsvceshi> selectKplCsvceshiList(KplCsvceshi kplCsvceshi);

    /**
     * 新增客户信息
     * 
     * @param kplCsvceshi 客户信息
     * @return 结果
     */
    public int insertKplCsvceshi(KplCsvceshi kplCsvceshi);

    /**
     * 修改客户信息
     * 
     * @param kplCsvceshi 客户信息
     * @return 结果
     */
    public int updateKplCsvceshi(KplCsvceshi kplCsvceshi);

    /**
     * 删除客户信息
     * 
     * @param id 客户信息ID
     * @return 结果
     */
    public int deleteKplCsvceshiById(Long id);

    /**
     * 批量删除客户信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteKplCsvceshiByIds(String[] ids);
}
