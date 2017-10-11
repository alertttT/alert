package com.neusoft.productservice;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Map;

import com.neusoft.accountdao.DaoFactory;
import com.neusoft.entity.T_Product_List;
import com.neusoft.prodao.ProductDao;
import com.neusoft.utils.PageModel;
import com.neusoft.utils.UtilC3P0;

public class ProductService {

	Connection conn = null;
	ProductDao pd = DaoFactory.getInstance("prodaoimpl", ProductDao.class);
	
	/**
	 * �����Ʒ
	 * @param pro
	 * @return
	 */
	public boolean addPro(T_Product_List pro){
		return pd.addPro(pro);
	}
	
	//�޸�
	public boolean modiflyPro(T_Product_List pro){
		return pd.updatePro(pro);
	}
	
	//ɾ��
	public boolean delPro(int pid){
		return pd.delPro(pid);
	}
	
	//����id��ѯ
	public T_Product_List showProById(int pid){
		return pd.showProById(pid);
	}
	
	
	//��ҳ��ѯ��Ʒ
	public PageModel<T_Product_List> showProduct(int pageNo,int pageSize){
		PageModel<T_Product_List> pageModel = null;
			pageModel = pd.showPro(pageNo, pageSize);
	
		return pageModel;
	}
	
	
	//��������ҳ��ѯ
	public PageModel<T_Product_List> showHotProduct(int pageNo,int pageSize){
		PageModel<T_Product_List> pageModel = null;
			pageModel = pd.showProByHot(pageNo, pageSize);
		return pageModel;
	}
	
	public PageModel<T_Product_List> showOnlineProduct(int pageNo,int pageSize){
		PageModel<T_Product_List> pageModel = null;
			pageModel = pd.showProByOnline(pageNo, pageSize);
		return pageModel;
	}
	
	public PageModel<T_Product_List> shoZkProduct(int pageNo,int pageSize){
		PageModel<T_Product_List> pageModel = null;
			pageModel = pd.showProByZK(pageNo, pageSize);
		return pageModel;
	}
	
	
	
	
	
	/**
	 * ��ѯ�����˵�
	 * @param id
	 * @return
	 */
	public Map<Integer, String> showProTowCate(int id){
		return pd.showProTowCate(id);
	}
	
	public Map<Integer, String> showProOneCate(){
		return showProTowCate(1);
	}
}
