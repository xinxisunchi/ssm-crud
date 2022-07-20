package com.atguigu.crud.controller;

/**
 * 处理和部门有关的请求
 * @author schi
 * @Description
 * @create 2022-07-19-10:30
 */
import com.atguigu.crud.bean.Department;
import com.atguigu.crud.bean.Msg;
import com.atguigu.crud.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    /*返回所有部门信息*/
    @RequestMapping("/depts")
    @ResponseBody
    public Msg getDepts(){
        List<Department> list = departmentService.getDepts();
        return Msg.success().add("depts",list);
    }

}