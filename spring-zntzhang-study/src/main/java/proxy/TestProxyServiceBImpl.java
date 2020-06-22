package proxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Auther: zhangtao
 * @Date: 2020/6/17 11:08
 * @Description:
 */
@Transactional
@Service("testProxyServiceB")
public class TestProxyServiceBImpl implements ITestProxyService{
	@Autowired
	private ITestProxyService testProxyServiceA;
}
