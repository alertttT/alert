package com.neusoft.addressdao;

import com.neusoft.accountdao.DaoException;
import com.neusoft.entity.Address;
import com.neusoft.utils.PageModel;

/**
 * ��ַdao
 * @author Administrator
 *
 */
public interface AddressDao {

	/**
	 * ������ҵ�ַ��Ϣ
	 */
	public boolean insertAddress(Address ad) throws DaoException;
	
	/**
	 * �޸���ҵ�ַ��Ϣ
	 * @param 
	 * @return
	 * @throws DaoException
	 */
	public boolean updateAddress(Address ad) throws DaoException;
	
	/**
	 * ����idɾ����ҵ�ַ��Ϣ
	 * @param id
	 * @return
	 * @throws DaoException
	 */
	public boolean delAddress(int id) throws DaoException;
	
	/**
	 * ����id��ѯ��ҵ�ַ��Ϣ
	 * @param id
	 * @return
	 * @throws DaoException
	 */
	public Address selectAddress(int id) throws DaoException;
	
	/**
	 * ��ҳ��ѯ������ҵ�ַ��Ϣ
	 * @param pageNo
	 * @param pageSize
	 * @return
	 * @throws DaoException
	 */
	public PageModel<Address> selectAddress(int pageNo,int pageSize) throws DaoException;
	
	/**
	 * ��ȡ��ҵ�ַ����
	 * @return
	 * @throws DaoException
	 */
	public int getAddressTotalRecords() throws DaoException;
}
