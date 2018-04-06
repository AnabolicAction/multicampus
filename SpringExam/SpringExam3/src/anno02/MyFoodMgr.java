package anno02;

//setter, toString()추가
public class MyFoodMgr{
	private Food favoriteFood;
	private Food unFavoriteFood;
	                 
	public void setFavoriteFood(Food favoriteFood) {
		this.favoriteFood = favoriteFood;
	}
	public void setUnFavoriteFood(Food unFavoriteFood) {
		this.unFavoriteFood = unFavoriteFood;
	}
	@Override
	public String toString() {
		return "[좋아하는 음식=" + favoriteFood + ", 싫어하는음식=" + unFavoriteFood + "]";
	}
}
