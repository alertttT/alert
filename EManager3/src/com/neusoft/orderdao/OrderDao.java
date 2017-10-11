package com.neusoft.orderdao;

import com.neusoft.accountdao.DaoException;
import com.neusoft.entity.Orderinfo;
import com.neusoft.utils.PageModel;

/**
 * ����dao
 * @author Administrator
 *
 */
public interface OrderDao {

	/**
	 * ���붩����Ϣ
	 */
	public boolean insertOrder(Orderinfo oi) throws DaoException;
	
	/**
	 * �޸Ķ�����Ϣ
	 * @param r
	 * @return
	 * @throws DaoException
	 */
	public boolean updateOrder(Orderinfo oi) throws DaoException;
	
	/**
	 * ����idɾ��������Ϣ
	 * @param id
	 * @return
	 * @throws DaoException
	 */
	public boolean delOrder(int id) throws DaoException;
	
	/**
	 * ����id��ѯ������Ϣ
	 * @param id
	 * @return
	 * @throws DaoException
	 */
	public Orderinfo selectOrder(int id) throws DaoException;
	
	/**
	 * ��ҳ��ѯ���ж�����Ϣ
	 * @param pageNo
	 * @param pageSize
	 * @return
	 * @throws DaoException
	 */
	public PageModel<Orderinfo> selectOrder(int pageNo,int pageSize) throws DaoException;
	
	/**
	 * ��ȡ��������
	 * @return
	 * @throws DaoException
	 */
	public int getOrderTotalRecords() throws DaoException;
}
