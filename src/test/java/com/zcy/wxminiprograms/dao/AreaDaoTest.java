package com.zcy.wxminiprograms.dao;

import com.zcy.wxminiprograms.entity.Area;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class AreaDaoTest {

    @Autowired
    private AreaDao areaDao;

    @Test
    public void queryArea() {
        List<Area> areaList = areaDao.queryArea();
        assertEquals(2, areaList.size());

    }

    @Test
    public void queryAreaById() {
        Area area = areaDao.queryAreaById(1);
//        assertNotNull(area);
        assertEquals("东苑", area.getAreaName());
    }

    @Test
    public void insertArea() {
        Area area = new Area();
        area.setAreaName("西苑");
        area.setPriority(2);
        int result = areaDao.insertArea(area);
        assertEquals(1, result);
    }

    @Test
    public void updateArea() {

        Area area = new Area();
        area.setAreaName("南苑");
//        area.setPriority(3);
        area.setAreaId(3);
        area.setLastEditTime(new Date());
        int result = areaDao.updateArea(area);
        assertEquals(1, result);

    }

    @Test
    public void deleteArea() {

        int result = areaDao.deleteArea(3);
        assertEquals(1, result);
    }
}