package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WuzizixunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WuzizixunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WuzizixunView;


/**
 * 物资资讯
 *
 * @author 
 * @email 
 * @date 2021-05-16 23:57:34
 */
public interface WuzizixunService extends IService<WuzizixunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WuzizixunVO> selectListVO(Wrapper<WuzizixunEntity> wrapper);
   	
   	WuzizixunVO selectVO(@Param("ew") Wrapper<WuzizixunEntity> wrapper);
   	
   	List<WuzizixunView> selectListView(Wrapper<WuzizixunEntity> wrapper);
   	
   	WuzizixunView selectView(@Param("ew") Wrapper<WuzizixunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WuzizixunEntity> wrapper);
   	
}

