package com.neusoft.con_add_dao;

import java.util.List;

import com.neusoft.accountdao.DaoException;
import com.neusoft.entity.Account_Consumer;
import com.neusoft.entity.Consumer_Addr;
import com.neusoft.utils.PageModel;

/**
 * ��ҵ�ַDao
 * @author Administrator
 *
 */
public interface Consumer_Addr_Dao {
	
	/**
	 * ������ҵ�ַ��Ϣ
	 */
	public boolean insertCsmAddr(Consumer_Addr ca) throws DaoException;
	
	/**
	 * �޸���ҵ�ַ��Ϣ
	 * @param r
	 * @return
	 * @throws DaoException
	 */
	public boolean updateCsmAddr(Consumer_Addr ca) throws DaoException;
	
	/**
	 * ����idɾ����ҵ�ַ��Ϣ
	 * @param id
	 * @return
	 * @throws DaoException
	 */
	public boolean delCsmAddr(int id) throws DaoException;
	
	/**
	 * ����id��ѯ��ҵ�ַ��Ϣ
	 * @param id
	 * @return
	 * @throws DaoException
	 */
	public Consumer_Addr selectCsmAddrById(int id) throws DaoException;
	
	/**
	 * ��ѯ����
	 * @return
	 * @throws DaoException
	 */
	public List<Consumer_Addr> selectCsmAddrList() throws DaoException;
	
	/**
	 * ��ҳ��ѯ������ҵ�ַ��Ϣ
	 * @param pageNo
	 * @param pageSize
	 * @return
	 * @throws DaoException
	 */
	public PageModel<Consumer_Addr> selectCsmAddrAll(int pageNo,int pageSize) throws DaoException;
	
	/**
	 * ��ȡ��ҵ�ַ����
	 * @return
	 * @throws DaoException
	 */
	public int getCsmAddrTotalRecords() throws DaoException;
	
	
}
