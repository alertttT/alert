package com.neusoft.ruldao;

import com.neusoft.accountdao.DaoException;
import com.neusoft.entity.Rule;
import com.neusoft.utils.PageModel;

/**
 * ���ӿ�
 * @author Administrator
 *
 */
public interface RulDao {

	/**
	 * ��������Ϣ
	 */
	public boolean insertRul(Rule r) throws DaoException;
	
	/**
	 * �޸Ĺ����Ϣ
	 * @param r
	 * @return
	 * @throws DaoException
	 */
	public boolean updateRul(Rule r) throws DaoException;
	
	/**
	 * ����idɾ�������Ϣ
	 * @param id
	 * @return
	 * @throws DaoException
	 */
	public boolean delRul(int id) throws DaoException;
	
	/**
	 * ����id��ѯ�����Ϣ
	 * @param id
	 * @return
	 * @throws DaoException
	 */
	public Rule selectRulById(int id) throws DaoException;
	
	/**
	 * ��ҳ��ѯ���й����Ϣ
	 * @param pageNo
	 * @param pageSize
	 * @return
	 * @throws DaoException
	 */
	public PageModel<Rule> selectRuleAll(int pageNo,int pageSize) throws DaoException;
	
	/**
	 * ��ȡ�������
	 * @return
	 * @throws DaoException
	 */
	public int getRuleTotalRecords() throws DaoException;
}
