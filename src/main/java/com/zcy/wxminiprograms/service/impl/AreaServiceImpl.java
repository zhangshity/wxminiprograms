package com.zcy.wxminiprograms.service.impl;


import com.zcy.wxminiprograms.dao.AreaDao;
import com.zcy.wxminiprograms.entity.Area;
import com.zcy.wxminiprograms.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * @ Author: chunyang.zhang
 * @ Description:  service 实现类
 * @ Date: Created in 17:44 2018/9/11
 * @ Modified: By:
 */

@Service
public class AreaServiceImpl implements AreaService {


    @Autowired
    private AreaDao areaDao;

    //查询所有Area
    @Override
    public List<Area> getAreaList() {
        return areaDao.queryArea();
    }

    //通过id查询单个Area
    @Override
    public Area getAreaById(int areaId) {
        return areaDao.queryAreaById(areaId);
    }


    //添加Area
    @Transactional//事务注解(配置在配置信息里）
    @Override
    public boolean addArea(Area area) {
        if (area.getAreaName() != null && !"".equals(area.getAreaName())) {
            area.setCreateTime(new Date());
            area.setLastEditTime(new Date());
            try {
                int effectedNum = areaDao.insertArea(area);
                if (effectedNum > 0) {
                    return true;
                } else {
                    throw new RuntimeException("插入Area信息失败！");
                }
            } catch (Exception e) {
                throw new RuntimeException("插入Area信息失败！" + e.getMessage());
            }
        } else {
            throw new RuntimeException("区域名称不能为空！");
        }
    }

    //修改Area
    @Override
    public boolean modifyArea(Area area) {
        //空值判断，主要是areaId不能为空
        if (area.getAreaId() != null && area.getAreaId() > 0) {
            //设置默认值
            area.setLastEditTime(new Date());
            try {
                //更新区域信息
                int effectedNum = areaDao.updateArea(area);
                if (effectedNum > 0) {
                    return true;
                } else {
                    throw new RuntimeException("更新区域信息失败！");
                }
            } catch (Exception e) {
                throw new RuntimeException("更新区域信息失败：" + e.toString());
            }
        } else {
            throw new RuntimeException("区域id不能为空！");
        }
    }

    //删除Area
    @Override
    public boolean deleteArea(int areaId) {
        if (areaId > 0) {
            try {
                //删除区域信息
                int effectedNum = areaDao.deleteArea(areaId);
                if (effectedNum > 0) {
                    return true;
                } else {
                    throw new RuntimeException("删除区域信息失败！");
                }
            } catch (Exception e) {
                throw new RuntimeException("删除区域信息失败" + e.toString());
            }
        } else {
            throw new RuntimeException("区域id不能为空");
        }
    }
}
