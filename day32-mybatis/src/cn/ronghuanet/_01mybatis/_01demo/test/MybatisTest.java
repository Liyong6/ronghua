package cn.ronghuanet._01mybatis._01demo.test;

import java.io.InputStream;

import cn.ronghuanet._01mybatis._01demo.domain.Product;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import cn.ronghuanet._01mybatis._01demo.dao.IProductDao;
import cn.ronghuanet._01mybatis._01demo.dao.impl.ProductDaoImpl;

public class MybatisTest {
	private IProductDao dao = new ProductDaoImpl();
	
	@Test
	public void test1() throws Exception {
		/*
		 * 想要启动框架 -- 就要获取核心对象
		 * sqlSession - sqlSessionFactory - sqlSessionFactoryBuilder - mybatis-config.xml
		 */
		// 读取文件
		String resource = "mybatis-config.xml";
		// 读取配置文件
		InputStream in = Resources.getResourceAsStream(resource);
		// 通过建造者 建造SqlSessionFactory工厂
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
		// 通过SqlSessionFactory工厂获取 SqlSession 对象
		SqlSession sqlSession = factory.openSession();
		System.out.println(sqlSession);
	}


	@Test
	public void testSelectById() throws Exception {
		System.out.println(dao.selectById(2L));
	}
	
	@Test
	public void testSelectAll() throws Exception {
		dao.selectALL().forEach(System.out::println);
	}

	@Test
	public void testDelete() throws Exception {
	dao.delete(1L);
	}

	@Test
	public void testUpdate() throws Exception {
		Product p = new Product();
		p.setId(20L);
		p.setDir_id(3L);
		p.setBrand("雷蛇");
		p.setSalePrice(99.0);
		p.setCostPrice(10.0);
		p.setSupplier("雷蛇");
		p.setProductName("雷蛇008");
		p.setCutoff(0.5);
		System.out.println(p);
		dao.update(p);

	}
	@Test
	public void testSave() throws Exception {
		Product p = new Product();
		p.setDir_id(3L);
		p.setBrand("雷蛇");
		p.setSalePrice(99.0);
		p.setCostPrice(10.0);
		p.setSupplier("雷蛇");
		p.setProductName("雷蛇181");
		p.setCutoff(0.8);
		System.out.println(p);
		dao.save(p);

	}
}
