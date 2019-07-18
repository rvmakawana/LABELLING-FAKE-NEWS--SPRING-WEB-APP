package com.example.demo.Repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.Entity.Fake;

public interface TruthRepo  extends CrudRepository<Fake, Integer>{
	
	@Transactional
	@Modifying(clearAutomatically = true)
	@Query("update Fake f set f.score =?1,f.impac  =?2 where f.id=?2")
	public void setFakeInfoById(int score,int impac ,int id);
	
	public Fake findById(int id);
	public Fake findTop1ByScoreIsNull();
	
	@Query(  value = "SELECT * FROM fake5001 u WHERE u.impac is null  limit 1",  nativeQuery = true)
	public Fake findByScore();

}
