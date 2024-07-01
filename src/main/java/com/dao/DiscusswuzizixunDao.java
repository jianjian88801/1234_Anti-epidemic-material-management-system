package com.dao;

import com.entity.DiscusswuzizixunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusswuzizixunVO;
import com.entity.view.DiscusswuzizixunView;


/**
 * 物资资讯评论表
 * 
 * @author 
 * @email 
 * @date 2021-05-16 23:57:34
 */
public interface DiscusswuzizixunDao extends BaseMapper<DiscusswuzizixunEntity> {
	
	List<DiscusswuzizixunVO> selectListVO(@Param("ew") Wrapper<DiscusswuzizixunEntity> wrapper);
	
	DiscusswuzizixunVO selectVO(@Param("ew") Wrapper<DiscusswuzizixunEntity> wrapper);
	
	List<DiscusswuzizixunView> selectListView(@Param("ew") Wrapper<DiscusswuzizixunEntity> wrapper);

	List<DiscusswuzizixunView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusswuzizixunEntity> wrapper);
	
	DiscusswuzizixunView selectView(@Param("ew") Wrapper<DiscusswuzizixunEntity> wrapper);
	
}
