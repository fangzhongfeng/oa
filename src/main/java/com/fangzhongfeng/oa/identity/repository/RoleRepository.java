package com.fangzhongfeng.oa.identity.repository;

import com.fangzhongfeng.oa.identity.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author fangzhongfeng
 *
 */
public interface RoleRepository extends JpaRepository<Role, Long> , JpaSpecificationExecutor<Role>{

}







