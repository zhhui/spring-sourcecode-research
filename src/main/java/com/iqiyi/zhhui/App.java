package com.iqiyi.zhhui;

import com.iqiyi.zhhui.service.TalkService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {

  public static void main(String[] args) {
    System.out.println("Hello World!");

    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    TalkService someBean= (TalkService) context.getBean("talkService");
    someBean.sayHello();

  }
}
