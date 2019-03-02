package com.fangzhongfeng.oa.identity.repository;

import java.util.List;
import java.util.Map;

import com.fangzhongfeng.oa.identity.domain.Dept;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * @author fangzhongfeng
 *
 */
public interface DeptRepository extends JpaRepository<Dept, Long>{
	
	@Query("select new Map(p.id as code , p.name as name) from Dept p")
	public List<Map<String, Object>> findDepts();
	
}







