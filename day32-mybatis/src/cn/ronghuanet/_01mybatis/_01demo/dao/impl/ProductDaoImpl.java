package cn.ronghuanet._01mybatis._01demo.dao.impl;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import cn.ronghuanet._01mybatis._01demo.dao.IProductDao;
import cn.ronghuanet._01mybatis._01demo.domain.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProductDaoImpl implements IProductDao{
	 
	@Override
	public Product selectById(Long ID) throws Exception {
		// 读取配置文件
		InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
		// 创建工厂
		SqlSessionFactory build = new SqlSessionFactoryBuilder().build(is);
		// 获取sqlsession
		SqlSession session = build.openSession();
		// 通过session 执行sql
		/*
		 * 第一个参数是: sql的路径
		 * 第二个参数是: id
		 */
		String sql = "cn.ronghuanet._01mybatis._01demo.mapper.ProductMapper.selectById";
		Product pro = session.selectOne(sql, ID);
		session.close();
		return pro;
	}

	@Override
	public List<Product> selectALL() throws Exception {
		Logger log = LoggerFactory.getLogger(ProductDaoImpl.class);
		log.error("selectById.............................");
		// 读取配置文件
		InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
		// 创建工厂
		SqlSessionFactory build = new SqlSessionFactoryBuilder().build(is);
		// 获取sqlsession
		SqlSession session = build.openSession();
		// 通过session 执行sql
		String sql = "cn.ronghuanet._01mybatis._01demo.mapper.ProductMapper.selectAll";
		List<Product> pro = session.selectList(sql);
		return pro;
	}

	@Override
	public void delete(Long id) throws Exception {
		//读取xml配置
		InputStream rs = Resources.getResourceAsStream("mybatis-config.xml");
		//创建工厂
		SqlSessionFactory build = new SqlSessionFactoryBuilder().build(rs);
		//获取sqlsession对象
		SqlSession session = build.openSession();
		//执行查询语句
		session.delete("cn.ronghuanet._01mybatis._01demo.mapper.ProductMapper.delete",id);


	}

	@Override
	public void update(Product p) throws Exception {
		InputStream res = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory build = new SqlSessionFactoryBuilder().build(res);
		SqlSession sqlSession = build.openSession();
		sqlSession.update("cn.ronghuanet._01mybatis._01demo.mapper.ProductMapper.updateById",p);

	}

	@Override
	public void save(Product p) throws Exception {
		InputStream res = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory build = new SqlSessionFactoryBuilder().build(res);
		SqlSession sqlSession = build.openSession();
		sqlSession.insert("cn.ronghuanet._01mybatis._01demo.mapper.ProductMapper.Save",p);
	}



}
