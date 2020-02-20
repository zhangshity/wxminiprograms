package com.zcy.wxminiprograms.service;

import com.zcy.wxminiprograms.entity.Area;

import java.util.List;

/**
 * @ Author: chunyang.zhang
 * @ Description:    Service 层接口，对应Area实体类
 * @ Date: Created in 17:28 2018/9/11
 * @ Modified: By:
 */

public interface AreaService {

    //区域列表
    List<Area> getAreaList();

    //通过id查询单个area
    Area getAreaById(int areaId);

    //插入area
    boolean addArea(Area area);

    //更新area
    boolean modifyArea(Area area);

    //删除area
    boolean deleteArea(int areaId);
}
