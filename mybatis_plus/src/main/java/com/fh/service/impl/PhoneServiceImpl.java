package com.fh.service.impl;

import com.fh.mapper.PhoneDao;
import com.fh.mapper.PhoneMapper;
import com.fh.model.Phone;
import com.fh.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhoneServiceImpl implements PhoneService {
    @Autowired
    private PhoneDao phoneMapper;

    @Override
    public List<Phone> queryList() {
        return phoneMapper.selectList(null);
    }
}
