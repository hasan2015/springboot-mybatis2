package hx.dao;

import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import hx.model.User;

@Mapper
public interface TestDao {

	@Select("select * from user;")
	public Map<String, Object> find();

	@Insert("insert into user(id,name,age) " + "values(#{id},1,'nick',1)")
	public int insert(@Param("id") int id);

	@Select("select * from user where name = #{name}")
	User findUserByName(@Param("name") String name);
}