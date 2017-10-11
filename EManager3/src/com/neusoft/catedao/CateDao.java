package com.neusoft.catedao;

import java.sql.Connection;
import java.util.List;

import com.neusoft.accountdao.DaoException;
import com.neusoft.entity.T_Pro_Category;
import com.neusoft.utils.PageModel;

/**
 * ���dao
 * @author Administrator
 *
 */
public interface CateDao {

	/**
	 * �������
	 * @param c
	 * @return
	 * @throws DaoException
	 */
	public boolean insertCate(T_Pro_Category c) throws DaoException;
	
	/**
	 * �޸������Ϣ   �������Id 
	 * @param c
	 * @return
	 * @throws DaoException
	 */
	public boolean updateCate(T_Pro_Category c) throws DaoException;
	
	/**
	 * ����idɾ�������Ϣ
	 * @param cid
	 * @return
	 * @throws DaoException
	 */
	public boolean delCateById(Connection conn,int cid) throws DaoException;
	
	/**
	 * �����Ƿ����ӽڵ㲢ɾ��
	 * @param cid
	 * @return
	 * @throws DaoException
	 */
	public boolean delCateByPid(Connection conn,int cid) throws DaoException;
	
	/**
	 * ����Idɾ��
	 */
	public boolean delCate(int cid);
	
	/**
	 * ��ѯ���������Ϣ
	 * @return
	 * @throws DaoException
	 */
	public PageModel<T_Pro_Category> selectCateList(int pageNo,int pageSize) throws DaoException;
	
	/**
	 * ����id��ѯ���������Ϣ
	 * @return
	 * @throws DaoException
	 */
	public T_Pro_Category selectCateById(int cid) throws DaoException;
	
	/**
	 * ��ѯ��¼����
	 * @return
	 * @throws DaoException
	 */
	public int getProTotalRecords() throws DaoException;

}
