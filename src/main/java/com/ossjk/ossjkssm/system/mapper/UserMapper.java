package com.ossjk.ossjkssm.system.mapper;

import java.util.List;
import java.util.Map;

import com.ossjk.core.base.mapper.BaseMapper;
import com.ossjk.ossjkssm.system.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper extends BaseMapper<User> {
	/**
	 * 登录
	 * @param username
	 * @return
	 */
	User selectByName(String username);


    /**
     * 记录登录时间和ip
     * @param username
     * @param loginip
     * @return
     */
/*	int loginipAndtime(@Param(value = "username") String username,@Param(value = "loginip") String loginip);*/

	/**
	 * 记录登录时间和ip
	 * @param map
	 * @return
	 */
	int loginipAndtime(Map map);

	/**
	 * 查询user表数据，带条件
	 * @param username
	 * @return
	 */
    /*
    There is no getter for property named 'name' in 'class java.lang.String'
    如果出现以上报错，那就是没有加注解@Param(value = "name")。
    */
/*	List<User> selectAll(@Param(value = "username") String username,@Param(value = "ogid") Integer ogid);*/

	/**
	 * 查询user表数据，用map函数，以后添加属性的时候改代码会很方便
	 * @param map
	 * @return
	 */
	List<User> selectAll(Map map);

	/**
	 * 根据id，批量删除数据
	 * @param ids
	 * @return
	 */
	int batchDelete(Integer[] ids);
	
	
}