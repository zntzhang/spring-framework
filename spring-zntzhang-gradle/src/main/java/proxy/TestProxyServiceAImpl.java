package proxy;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @Auther: zhangtao
 * @Date: 2020/6/17 11:08
 * @Description:
 */
@Transactional
@Service("testProxyServiceA")
public class TestProxyServiceAImpl implements ITestProxyService{
	@Resource
	private ITestProxyService testProxyServiceB;

	@Override
	public void testA() {

	}

	@Override
	public void testB() {
		testProxyServiceB.testA();
		System.out.println("");
	}
}
