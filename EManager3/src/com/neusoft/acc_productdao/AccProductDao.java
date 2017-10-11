package com.neusoft.acc_productdao;

import com.neusoft.accountdao.DaoException;
import com.neusoft.entity.Account_Product;
import com.neusoft.utils.PageModel;

/**
 * �����ʺ���Ϣ
 * @author Administrator
 *
 */
public interface AccProductDao {
	/**
	 * ���������ʻ���Ϣ
	 */
	public boolean insertAccPro(Account_Product ap) throws DaoException;
	
	/**
	 * �޸������ʻ���Ϣ
	 * @param r
	 * @return
	 * @throws DaoException
	 */
	public boolean updateAccPro(Account_Product ap) throws DaoException;
	
	/**
	 * ����idɾ�������ʻ���Ϣ
	 * @param id
	 * @return
	 * @throws DaoException
	 */
	public boolean delAccPro(int id) throws DaoException;
	
	/**
	 * ����id��ѯ�����ʻ���Ϣ
	 * @param id
	 * @return
	 * @throws DaoException
	 */
	public Account_Product selectAccProById(int id) throws DaoException;
	
	/**
	 * ��ҳ��ѯ���������ʻ���Ϣ
	 * @param pageNo
	 * @param pageSize
	 * @return
	 * @throws DaoException
	 */
	public PageModel<Account_Product> selectAccProAll(int pageNo,int pageSize) throws DaoException;
	
	/**
	 * ��ȡ�����ʻ�����
	 * @return
	 * @throws DaoException
	 */
	public int getAccProTotalRecords() throws DaoException;
}
