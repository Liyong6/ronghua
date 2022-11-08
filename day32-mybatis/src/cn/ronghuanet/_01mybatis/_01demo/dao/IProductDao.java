package cn.ronghuanet._01mybatis._01demo.dao;

import java.util.List;

import cn.ronghuanet._01mybatis._01demo.domain.Product;

public interface IProductDao {
	/**
	 * 根据id查一个
	 */
	Product selectById(Long id) throws Exception;
	/**
	 * 查询全部
	 */
	List<Product> selectALL() throws Exception;
	/**
	 * 删除
	 */
	void delete(Long id) throws Exception;

	/**
	 * 更新
	 */
	void update(Product p) throws Exception;
	
	/**
	 * 新增
	 */
	void save(Product p) throws Exception;

}
