import login.ILoginService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: zhangtao
 * @Date: 2020/6/6 18:12
 * @Description:
 */
public class App {
	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		ILoginService loginService = (ILoginService) applicationContext.getBean("loginService");
		loginService.check("boy", "123");
	}

}