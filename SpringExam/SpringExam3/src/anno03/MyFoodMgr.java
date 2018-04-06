package anno03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//setter, toString()추가
@Component("myFood")  //default : myFoodMgr로 설정됨
//myFood객체생성
public class MyFoodMgr{
	@Autowired //@Autowired란? 이 맴버변수들을 값을 자동으로 주입해달라
	@Qualifier(value="unFavoriteFood") //얘가 favoriteFood이름을 무시하고 unFavoriteFood를 강제주입 
	private Food favoriteFood;     // setter 생략가능
	@Autowired
	private Food unFavoriteFood;
	                 
	
	@Override
	public String toString() {
		return "[좋아하는 음식=" + favoriteFood + ", 싫어하는음식=" + unFavoriteFood + "]";
	}
}
