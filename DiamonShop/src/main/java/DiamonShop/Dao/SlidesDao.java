package DiamonShop.Dao;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import DiamonShop.Entity.MapperSlides;
import DiamonShop.Entity.Slides;

@Repository
<<<<<<< HEAD
public class SlidesDao extends BaseDao{
=======
public class SlidesDao {
	@Autowired
	public JdbcTemplate _jdbcTemplate;
>>>>>>> branch 'master' of https://github.com/DHMaiKhanhdeveloper/ShopMVC.git
	
	public List<Slides> GetDataSlide(){
		List<Slides> list = new ArrayList<Slides>();
		String sql = "SELECT * FROM slides";
		list = _jdbcTemplate.query(sql, new MapperSlides());
		return list;
	} 
}
