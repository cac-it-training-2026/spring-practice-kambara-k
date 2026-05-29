package jp.co.sss.practice.p05.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jp.co.sss.practice.p05.entity.FruitsSeason;

@Repository
public interface FruitsSeasonRepository extends JpaRepository<FruitsSeason, Integer> {

	List<FruitsSeason> findAllByOrderBySeasonMonth();

}
