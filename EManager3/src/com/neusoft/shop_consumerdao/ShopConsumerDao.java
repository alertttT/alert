package com.neusoft.shop_consumerdao;

import com.neusoft.accountdao.DaoException;
import com.neusoft.entity.Shoppinginfo_Consumer;
import com.neusoft.utils.PageModel;

/**
 * ��Ҹ�����Ϣdao
 * @author Administrator
 *
 */
public interface ShopConsumerDao {

	/**
	 * ������Ҹ�����Ϣ
	 */
	public boolean insertShopCsm(Shoppinginfo_Consumer sc) throws DaoException;
	
	/**
	 * �޸���Ҹ�����Ϣ
	 * @param r
	 * @return
	 * @throws DaoException
	 */
	public boolean updateShopCsm(Shoppinginfo_Consumer sc) throws DaoException;
	
	/**
	 * ����idɾ����Ҹ�����Ϣ
	 * @param id
	 * @return
	 * @throws DaoException
	 */
	public boolean delShopCsm(int id) throws DaoException;
	
	/**
	 * ����id��ѯ��Ҹ�����Ϣ
	 * @param id
	 * @return
	 * @throws DaoException
	 */
	public Shoppinginfo_Consumer selectShopCsmById(int id) throws DaoException;
	
	/**
	 * ��ҳ��ѯ������Ҹ�����Ϣ
	 * @param pageNo
	 * @param pageSize
	 * @return
	 * @throws DaoException
	 */
	public PageModel<Shoppinginfo_Consumer> selectShopCsmAll(int pageNo,int pageSize) throws DaoException;
	
	/**
	 * ��ȡ��Ҹ�������
	 * @return
	 * @throws DaoException
	 */
	public int getShopCsmTotalRecords() throws DaoException;
}
