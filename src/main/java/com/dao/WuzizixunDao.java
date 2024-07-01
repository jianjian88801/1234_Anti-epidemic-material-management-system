package com.dao;

import com.entity.WuzizixunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WuzizixunVO;
import com.entity.view.WuzizixunView;


/**
 * 物资资讯
 * 
 * @author 
 * @email 
 * @date 2021-05-16 23:57:34
 */
public interface WuzizixunDao extends BaseMapper<WuzizixunEntity> {
	
	List<WuzizixunVO> selectListVO(@Param("ew") Wrapper<WuzizixunEntity> wrapper);
	
	WuzizixunVO selectVO(@Param("ew") Wrapper<WuzizixunEntity> wrapper);
	
	List<WuzizixunView> selectListView(@Param("ew") Wrapper<WuzizixunEntity> wrapper);

	List<WuzizixunView> selectListView(Pagination page,@Param("ew") Wrapper<WuzizixunEntity> wrapper);
	
	WuzizixunView selectView(@Param("ew") Wrapper<WuzizixunEntity> wrapper);
	
}
