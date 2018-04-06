package anno03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//setter, toString()�߰�
@Component("myFood")  //default : myFoodMgr�� ������
//myFood��ü����
public class MyFoodMgr{
	@Autowired //@Autowired��? �� �ɹ��������� ���� �ڵ����� �����ش޶�
	@Qualifier(value="unFavoriteFood") //�갡 favoriteFood�̸��� �����ϰ� unFavoriteFood�� �������� 
	private Food favoriteFood;     // setter ��������
	@Autowired
	private Food unFavoriteFood;
	                 
	
	@Override
	public String toString() {
		return "[�����ϴ� ����=" + favoriteFood + ", �Ⱦ��ϴ�����=" + unFavoriteFood + "]";
	}
}
