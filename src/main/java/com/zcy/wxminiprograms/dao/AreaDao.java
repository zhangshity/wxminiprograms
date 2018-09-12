package com.zcy.wxminiprograms.dao;

import com.zcy.wxminiprograms.entity.Area;

import java.util.List;

/**
 * @ Author: chunyang.zhang
 * @ Description:   dao层
 * @ Date: Created in 15:05 2018/9/11
 * @ Modified: By:
 */

public interface AreaDao {

    //列出区域列表
    List<Area> queryArea();

    //根据id查询单个区域
    Area queryAreaById(int areaId);

    //插入区域信息
    int insertArea(Area area);

    //更新区域信息
    int updateArea(Area area);

    //根据id删除单个区域信息
    int deleteArea(int areaId);



}
