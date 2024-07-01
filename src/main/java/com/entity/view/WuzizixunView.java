package com.entity.view;

import com.entity.WuzizixunEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 物资资讯
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-16 23:57:34
 */
@TableName("wuzizixun")
public class WuzizixunView  extends WuzizixunEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WuzizixunView(){
	}
 
 	public WuzizixunView(WuzizixunEntity wuzizixunEntity){
 	try {
			BeanUtils.copyProperties(this, wuzizixunEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
