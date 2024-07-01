package com.dao;

import com.entity.WuzirukuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WuzirukuVO;
import com.entity.view.WuzirukuView;


/**
 * 物资入库
 * 
 * @author 
 * @email 
 * @date 2021-05-16 23:57:33
 */
public interface WuzirukuDao extends BaseMapper<WuzirukuEntity> {
	
	List<WuzirukuVO> selectListVO(@Param("ew") Wrapper<WuzirukuEntity> wrapper);
	
	WuzirukuVO selectVO(@Param("ew") Wrapper<WuzirukuEntity> wrapper);
	
	List<WuzirukuView> selectListView(@Param("ew") Wrapper<WuzirukuEntity> wrapper);

	List<WuzirukuView> selectListView(Pagination page,@Param("ew") Wrapper<WuzirukuEntity> wrapper);
	
	WuzirukuView selectView(@Param("ew") Wrapper<WuzirukuEntity> wrapper);
	
}
