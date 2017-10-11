package com.neusoft.prodao;

import java.util.List;
import java.util.Map;

import com.neusoft.accountdao.DaoException;
import com.neusoft.entity.T_Product_List;
import com.neusoft.utils.PageModel;

/**
 * ��Ʒ��Ϣdao
 * @author Administrator
 *
 */
public interface ProductDao {
	
	/**
	 * �����Ʒ��Ϣ
	 * @param pro
	 * @return
	 * @throws DaoException
	 */
	public boolean addPro(T_Product_List pro) throws DaoException;
	
	
	/**
	 * �޸���Ʒ��Ϣ
	 * @param pro
	 * @return
	 * @throws DaoException
	 */
	public boolean updatePro(T_Product_List pro) throws DaoException;
	
	
	/**
	 * ɾ����Ʒ��Ϣ
	 * @param pid
	 * @return
	 * @throws DaoException
	 */
	public boolean delPro(int pid) throws DaoException;	//pro_item_no
	
	/**
	 * ����id��ѯ��Ʒ
	 * @param pid
	 * @return
	 * @throws DaoException
	 */
	public T_Product_List showProById(int pid) throws DaoException;
	
	
	/**
	 * ����hot��ѯ��Ʒ
	 * @param pid
	 * @return
	 * @throws DaoException
	 */
	public PageModel<T_Product_List> showProByHot(int pageNo,int pageSize) throws DaoException;
	
	/**
	 * �����ۿ۲�ѯ��Ʒ
	 * @param pid
	 * @return
	 * @throws DaoException
	 */
	public PageModel<T_Product_List> showProByZK(int pageNo,int pageSize) throws DaoException;
	
	/**
	 * �������߲�ѯ��Ʒ
	 * @param pid
	 * @return
	 * @throws DaoException
	 */
	public PageModel<T_Product_List> showProByOnline(int pageNo,int pageSize) throws DaoException;
	
	
	
	/**
	 * ��ҳ��ѯ��Ʒ��Ϣ
	 * @param pageNo
	 * @param pageSize
	 * @return
	 * @throws DaoException
	 */
	public PageModel<T_Product_List> showPro(int pageNo,int pageSize) throws DaoException;
	
	/**
	 * ��ȡ��Ʒ����
	 * @return
	 * @throws DaoException
	 */
	public int getProTotalRecords() throws DaoException;
	
	/**
	 * ��ȡOnline��Ʒ����
	 * @return
	 * @throws DaoException
	 */
	public int getOnlineProTotalRecords() throws DaoException;
	
	/**
	 * ��ȡZK��Ʒ����
	 * @return
	 * @throws DaoException
	 */
	public int getZKProTotalRecords() throws DaoException;
	
	/**
	 * ��ȡHot��Ʒ����
	 * @return
	 * @throws DaoException
	 */
	public int getHotProTotalRecords() throws DaoException;
	
	/**
	 * ��ѯ��Ʒһ�����
	 * @return
	 * @throws DaoException
	 */
	public Map<Integer,String> showProOneCate() throws DaoException;
	
	/**
	 * ��ѯ��Ʒ�������
	 * @param pid
	 * @return
	 * @throws DaoException
	 */
	public Map<Integer,String> showProTowCate(int pid) throws DaoException;
}
