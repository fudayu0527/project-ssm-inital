package com.fdy.oto.service.impl;

import com.fdy.oto.dao.AreaDao;
import com.fdy.oto.entity.Area;
import com.fdy.oto.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreaServiceImpl implements AreaService {
    @Autowired
    private AreaDao areaDao;
    @Override
    public List<Area> getArealist() {
        return areaDao.queryArea();
    }

}
