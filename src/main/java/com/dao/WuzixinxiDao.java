package com.dao;

import com.entity.WuzixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WuzixinxiVO;
import com.entity.view.WuzixinxiView;


/**
 * 物资信息
 * 
 * @author 
 * @email 
 * @date 2021-05-16 23:57:33
 */
public interface WuzixinxiDao extends BaseMapper<WuzixinxiEntity> {
	
	List<WuzixinxiVO> selectListVO(@Param("ew") Wrapper<WuzixinxiEntity> wrapper);
	
	WuzixinxiVO selectVO(@Param("ew") Wrapper<WuzixinxiEntity> wrapper);
	
	List<WuzixinxiView> selectListView(@Param("ew") Wrapper<WuzixinxiEntity> wrapper);

	List<WuzixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<WuzixinxiEntity> wrapper);
	
	WuzixinxiView selectView(@Param("ew") Wrapper<WuzixinxiEntity> wrapper);
	
}
