package jp.co.sss.practice.p05.bean;

public class FruitsSeasonBean {

	Integer fruitId;
	String fruitName;
	Integer seasonMonth;

	/**
	 * @return fruitId
	 */
	public Integer getFruitId() {
		return fruitId;
	}

	/**
	 * @param fruitId
	 *            セットする fruitId
	 */
	public void setFruitId(Integer fruitId) {
		this.fruitId = fruitId;
	}

	/**
	 * @return fruitName
	 */
	public String getFruitName() {
		return fruitName;
	}

	/**
	 * @param fruitName
	 *            セットする fruitName
	 */
	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}

	/**
	 * @return seasonMonths
	 */
	public Integer getSeasonMonth() {
		return seasonMonth;
	}

	/**
	 * @param seasonMonths
	 *            セットする seasonMonths
	 */
	public void setSeasonMonth(Integer seasonMonths) {
		this.seasonMonth = seasonMonths;
	}

}
