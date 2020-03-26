package com.fh.controller;

import com.fh.model.Phone;
import com.fh.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("phone")
public class PhoneController {


    @Autowired
    private PhoneService phoneService;

    @RequestMapping("bac")
    @ResponseBody
    public void queryList(){
        List<Phone> list=phoneService.queryList();
        for (Phone phone : list) {
            System.out.println(phone);
        }
    }

}
