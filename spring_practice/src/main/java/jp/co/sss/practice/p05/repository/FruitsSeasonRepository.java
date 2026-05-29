package jp.co.sss.practice.p05.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jp.co.sss.practice.p05.entity.FruitsSeason;

@Repository
public interface FruitsSeasonRepository extends JpaRepository<FruitsSeason, Integer> {

	// season_month 列で並べ替え
	List<FruitsSeason> findAllByOrderBySeasonMonth();

	// fruit_id 列で並べ替え
	List<FruitsSeason> findAllByOrderByFruitId();

	// season_month 列で絞込検索、fruit_id 列で並べ替え
	List<FruitsSeason> findBySeasonMonthOrderByFruitId(Integer seasonMonth);

}
