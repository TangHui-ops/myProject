package cn.bdqn.service;

import cn.bdqn.mbg.model.Sys;
import cn.bdqn.mbg.model.SysExample;

import java.util.List;

public interface SysService {

   List<Sys> getByExample(SysExample example);

}
