package com.fdy.oto.dao;

import com.fdy.oto.BaseTest;
import com.fdy.oto.dao.AreaDao;
import com.fdy.oto.entity.Area;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class AreaDaoTest extends BaseTest {
    @Autowired
    private AreaDao areaDao;
    @Test
    public void testQueryArea() {
        List<Area> areaList = areaDao.queryArea();

        assertEquals(2,areaList.size());
//        for (Area area : areaList) {
//            System.out.println(area.getAreaId());
//            System.out.println(area.getAreaName());
//            System.out.println(area.getCreateTime());
//            System.out.println(area.getLastEditTime());
//            System.out.println(area.getPriority());
//        }
    }
}
