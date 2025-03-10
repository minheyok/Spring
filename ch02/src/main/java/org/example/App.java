package org.example;

import org.example.config.AppConfig;
import org.example.sub1.Greeting;
import org.example.sub1.Hello;
import org.example.sub1.Welcome;
import org.example.sub2.computer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

/**
 * 날짜 : 2025/03/10
 * 이름 : 장민혁
 * 내용 : Spring IoC/DI 실습하기
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        //기존 객체 생성 방식
        Hello hi = new Hello();
        Welcome w = new Welcome();
        Greeting g = new Greeting();

        hi.show();
        w.show();
        g.show();

        /// //////////////////////////////////////////////////////////////////////////////////
        // 스프링 컨테이터 객체 생성
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Hello helloBeen = context.getBean(Hello.class);
        helloBeen.show();

        Welcome welcomeBeen = (Welcome) context.getBean("welcome");
        welcomeBeen.show();


        Greeting greetingBeen = (Greeting)  context.getBean("ggg");
        greetingBeen.show();



        /// /////////////////////////////////////////////////////
        // ioc/di 기법을 이용한 객체 실습
        computer Computer = (computer) context.getBean("com");
        Computer.show();



    }
}
