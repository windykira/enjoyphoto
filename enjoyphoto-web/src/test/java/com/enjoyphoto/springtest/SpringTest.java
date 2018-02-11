package com.enjoyphoto.springtest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Administrator on 2018/2/1.
 */
/*@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/spring-test.xml")*/
public class SpringTest {


    @Test
    public void springTest() throws IOException {

        /*ClassPathResource resource = new ClassPathResource("config/spring-test.xml");
        InputStream inputStream = resource.getInputStream();
        assert inputStream != null;
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions(resource);*/

        ApplicationContext ac = new FileSystemXmlApplicationContext("classpath:config/spring-test.xml");

    }
}
