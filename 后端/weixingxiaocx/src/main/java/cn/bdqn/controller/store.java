package cn.bdqn.controller;


import cn.bdqn.mbg.model.Store;

import cn.bdqn.mbg.model.StoreExample;
import cn.bdqn.service.StoreService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/i")
public class store {
    @Autowired
    private StoreService storeService;

    //查询
    @GetMapping("/Store")
    public Store selectByPrimaryKey(Integer storeId) {
        return storeService.selectByPrimaryKey(storeId);
    }

    //添加
    @PostMapping("/int")
    public Boolean insertSelective(Store record) {
        int a= storeService.insertSelective(record);
        if (a>0)
            return true;
        else
            return false;
    }

    //删除
    @DeleteMapping("/delete")
    public Boolean deleteByExample(StoreExample example) {
        int b= storeService.deleteByExample(example);
        if (b>0)
            return  true;

        else
            return false;

    }

    //删除
    @DeleteMapping("/deletea")
    public Boolean deleteByPrimaryKey(Integer storeId){
        int c=storeService.deleteByPrimaryKey(storeId);
        if (c>0)
            return  true;
        else
            return false;
    }

    //添加
    @PostMapping("/inta")
    public  Boolean insert(Store record){
        int d=storeService.insert(record);
        if (d>0)
            return true;
        else
            return  false;
    }



    //查询
    @GetMapping("/storea")
    public List<Store> selectByExample(StoreExample example){
        return storeService.selectByExample(example);
    }



//更新

    public Boolean updateByExampleSelective(@Param("record") Store record, @Param("example") StoreExample example){
        int e=storeService.updateByExampleSelective(record,example);
        if (e>0)
            return  true;
        else
            return false;
    }


    public Boolean updateByExample(@Param("record") Store record, @Param("example") StoreExample example){
        int f=storeService.updateByExample(record,example);
        if (f>0)
            return true;
        else
            return  false;
    }

    public Boolean updateByPrimaryKeySelective(Store record){
        int g=storeService.updateByPrimaryKeySelective(record);
        if (g>0)
            return true;
        else
            return false;
    }


    public Boolean updateByPrimaryKey(Store record){
        int h=storeService.updateByPrimaryKey(record);
        if (h>0)
            return true;
        else
            return false;
    }

    public int countByExample(StoreExample example){
        return storeService.countByExample(example);
    }

        }
