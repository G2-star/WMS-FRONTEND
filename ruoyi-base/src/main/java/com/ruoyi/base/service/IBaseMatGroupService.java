package com.ruoyi.base.service;

import java.util.List;

import com.ruoyi.base.domain.BaseMatGroup;

/**
 * 物料组Service接口
 *
 * @author ruoyi
 * @date 2022-07-23
 */
public interface IBaseMatGroupService {
    /**
     * 查询物料组
     *
     * @param groupId 物料组主键
     * @return 物料组
     */
    public BaseMatGroup selectBaseMatGroupByGroupId(Long groupId);

    /**
     * 查询物料组
     *
     * @param groupCode
     * @return 物料组
     */
    public String selectBaseMatGroupNameByGroupCode(String groupCode);

    /**
     * 查询物料组列表
     *
     * @param baseMatGroup 物料组
     * @return 物料组集合
     */
    public List<BaseMatGroup> selectBaseMatGroupList(BaseMatGroup baseMatGroup);

    /**
     * 新增物料组
     *
     * @param baseMatGroup 物料组
     * @return 结果
     */
    public int insertBaseMatGroup(BaseMatGroup baseMatGroup);

    /**
     * 修改物料组
     *
     * @param baseMatGroup 物料组
     * @return 结果
     */
    public int updateBaseMatGroup(BaseMatGroup baseMatGroup);

    /**
     * 批量删除物料组
     *
     * @param groupIds 需要删除的物料组主键集合
     * @return 结果
     */
    public int deleteBaseMatGroupByGroupIds(Long[] groupIds);

    /**
     * 删除物料组信息
     *
     * @param groupId 物料组主键
     * @return 结果
     */
    public int deleteBaseMatGroupByGroupId(Long groupId);
}
