package login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Auther: zhangtao
 * @Date: 2020/6/6 18:04
 * @Description:
 */
@Component
public class LoginServiceImpl implements ILoginService {
	String id = "";

	@Autowired(required = false)
	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String check(String userName, String password) {
		System.out.println("boy登录...");
		return "success";
	}

}
