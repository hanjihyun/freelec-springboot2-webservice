package com.jojoldu.book.springboot.config.auth;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.PARAMETER) //PARAMETER 로 선언된 객체에서만 사용
@Retention(RetentionPolicy.RUNTIME) 
public @interface LoginUser { //@interface : 이 파일을 어노테이션 클래스로 지정, LoginUSer라는 이름을 가진 어노테이션 생성
}
