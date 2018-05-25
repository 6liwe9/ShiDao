package com.shidao.web.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shidao.web.dao.FoodMapper;
import com.shidao.web.model.Food;

/**
 * @author liwez
 *
 */
/**
 * @author liwez
 *
 */
@Service
public class FoodService {
	@Autowired
	FoodMapper foodMapper;

	public List getRecommendFood() {
		// TODO Auto-generated method stub
		List ret=new ArrayList<Map>();
		List<Food> foods=foodMapper.selectRecommendFood();
		for(Food f:foods) {
			Map mF=new HashMap<String,String>();
			mF.put("fId", f.getfId());
			mF.put("fImg", f.getfImg());
			mF.put("fName", f.getfName());
			mF.put("fDes", f.getfDes());
			mF.put("fPrice", f.getfPriceOut());
			mF.put("fRate", f.getfAllrating());
			ret.add(mF);
		}
		return ret;
	}

	public Object getFoodDetail(Long fid) {
		// TODO Auto-generated method stub
		return foodMapper.selectByPrimaryKey(fid);
	}
	
}
