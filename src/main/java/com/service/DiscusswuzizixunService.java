package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusswuzizixunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusswuzizixunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusswuzizixunView;


/**
 * 物资资讯评论表
 *
 * @author 
 * @email 
 * @date 2021-05-16 23:57:34
 */
public interface DiscusswuzizixunService extends IService<DiscusswuzizixunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusswuzizixunVO> selectListVO(Wrapper<DiscusswuzizixunEntity> wrapper);
   	
   	DiscusswuzizixunVO selectVO(@Param("ew") Wrapper<DiscusswuzizixunEntity> wrapper);
   	
   	List<DiscusswuzizixunView> selectListView(Wrapper<DiscusswuzizixunEntity> wrapper);
   	
   	DiscusswuzizixunView selectView(@Param("ew") Wrapper<DiscusswuzizixunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusswuzizixunEntity> wrapper);
   	
}

