package com.aidu.info.service.Impl;



import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aidu.info.dao.ISellerDao;
import com.aidu.info.pojo.Seller;
import com.aidu.info.service.SellerService;

import net.sf.json.JSONArray;


@Service 
public class SellerServiceImpl implements SellerService {
	
	@Resource
	private ISellerDao sellerMapper;
	
	@Override
	public String getAllSellers() {
			    
		List<Seller> items = sellerMapper.getAllSellers();
		
		System.out.println("enter");
		
		
		System.out.println(items.size());
		if(!items.isEmpty())
		{
			return JSONArray.fromObject(items).toString();
		}
		else
		{
			return null;
		}				 		
    }
	
}
