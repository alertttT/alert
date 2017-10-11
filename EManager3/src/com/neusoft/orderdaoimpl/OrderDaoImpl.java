package com.neusoft.orderdaoimpl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.neusoft.accountdao.DaoException;
import com.neusoft.entity.Orderinfo;
import com.neusoft.orderdao.OrderDao;
import com.neusoft.utils.PageModel;
import com.neusoft.utils.UtilC3P0;

public class OrderDaoImpl implements OrderDao {

	Connection conn = null;
	QueryRunner qr = new QueryRunner();
	
	@Override
	public boolean insertOrder(Orderinfo oi) throws DaoException {
		String sql = "insert into orderinfo(id,orderno,orderstatus,paystatus,ordertime,paytime,addrinfo,mask,num,totalprice,pid) values(seq_oderinfo.nextval,?,?,?,sysdate,sysdate,?,?,?,?,?)";
		try {
			conn = UtilC3P0.getConnection();
			int count = qr.update(conn, sql, oi.getOrderno(),oi.getOrderstatus(),oi.getPaystatus(),oi.getAddrinfo(),oi.getMask(),oi.getNum(),oi.getTotalprice(),oi.getPid());
			if ( count > 0 ) {
				return true;
			}
		} catch (SQLException e) {
			throw new DaoException("���붩����Ϣ����",e);
		}
		return false;
	}

	@Override
	public boolean updateOrder(Orderinfo oi) throws DaoException {
		String sql = "update orderinfo set orderno=?, orderstatus=?,paystatus=?,ordertime=?,paytime=?,addrinfo=?,mask=?,num=?,totalprice=?,pid=? where id = ?";
		try {
			conn = UtilC3P0.getConnection();
			int count = qr.update(conn, sql, oi.getOrderno(),oi.getOrderstatus(),oi.getPaystatus(),oi.getOrdertime(),oi.getPaytime(),oi.getAddrinfo(),oi.getMask(),oi.getId(),oi.getNum(),oi.getTotalprice(),oi.getPid());
			if ( count > 0) {
				return true;
			}
		} catch (SQLException e) {
			throw new DaoException("�޸Ķ�����Ϣ����",e);
		}
		return false;
	}

	@Override
	public boolean delOrder(int id) throws DaoException {
		String sql = "delete from orderinfo where id = ?";
		try {
			conn = UtilC3P0.getConnection();
			int count = qr.update(conn, sql, id);
			if ( count > 0) {
				return true;
			}
		} catch (SQLException e) {
			throw new DaoException("ɾ��������Ϣ����",e);
		}
		return false;
	}

	@Override
	public Orderinfo selectOrder(int id) throws DaoException {
		String sql = "select id,orderno,orderstatus,paystatus,ordertime,paytime,addrinfo,mask,num,totalprice,pid from orderinfo where id = ?";
		Orderinfo oi = null;
		try {
			conn = UtilC3P0.getConnection();
			oi = qr.query(conn, sql, new BeanHandler<Orderinfo>(Orderinfo.class), id);
		} catch (SQLException e) {
			throw new DaoException("��ѯ������Ϣ����",e);
		}
		return oi;
	}

	@Override
	public PageModel<Orderinfo> selectOrder(int pageNo, int pageSize) throws DaoException {
		PageModel<Orderinfo> pageModel = new PageModel<Orderinfo>();
		List<Orderinfo> list = new ArrayList<Orderinfo>();
		try {
			conn = UtilC3P0.getConnection();
			StringBuffer sbSql = new StringBuffer();
			sbSql.append("select * from ")
				.append("( ")
				.append("select rownum as rn, t.* ")
				.append("from ( ")
				.append("select * from orderinfo ")
				.append(") t where rownum <= ? ")
				.append(") where rn > ? ");
			String sql = sbSql.toString();
			list = qr.query(conn, sql, new BeanListHandler<Orderinfo>(Orderinfo.class),pageNo * pageSize,(pageNo - 1) * pageSize);
			pageModel.setTotalRecords(getOrderTotalRecords());
			pageModel.setList(list);
		} catch (SQLException e) {
			throw new DaoException("��ҳ����ʧ��!",e);
		}
		return pageModel;
	}

	@Override
	public int getOrderTotalRecords() throws DaoException {
		String sql = "select count(id) from orderinfo ";
		int num = 0; 
		try {
			conn = UtilC3P0.getConnection();
			Object obj = qr.query(conn, sql, new ScalarHandler<Object>());
			num = Integer.parseInt(obj.toString());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return num;
	}
	
	

}
