package com.fdy.oto.service;

import com.fdy.oto.BaseTest;
import com.fdy.oto.entity.Area;
import com.fdy.oto.service.impl.AreaServiceImpl;
import com.sun.org.apache.xml.internal.serialize.LineSeparator;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AreaServiceTest extends BaseTest {

    @Autowired
    private AreaService areaService;

    @Test
    public void testGetAreaList() {
        List<Area> areaList = areaService.getArealist();
        System.out.println(areaList.get(0).getAreaName());
        assertEquals("西苑", areaList.get(0).getAreaName());
    }
}
