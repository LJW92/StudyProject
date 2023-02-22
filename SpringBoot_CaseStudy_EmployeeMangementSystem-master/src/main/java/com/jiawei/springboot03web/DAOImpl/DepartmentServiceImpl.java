package com.jiawei.springboot03web.DAOImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jiawei.springboot03web.DAOinterface.DepartmentService;
import com.jiawei.springboot03web.mapper.DepartmentMapper;
import com.jiawei.springboot03web.pojo.Department;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    DepartmentMapper departmentMapper;

    @Override
    public List<Department> getDepartments() {
        return departmentMapper.getAllDpt();
    }

    @Override
    public Department getDepartmentById(Integer id) {
        return departmentMapper.getDptById(id);
    }
}
