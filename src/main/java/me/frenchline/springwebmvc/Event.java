package me.frenchline.springwebmvc;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * @author swlee
 * @contact frenchline707@gmail.com
 * @since 2019-10-31
 */
@Getter @Setter
@Builder @NoArgsConstructor @AllArgsConstructor
public class Event {

    private String name; //이벤트의 이름

    private int limitOfEnrollment; //이벤트에 몇명이 참가할 수 있는지

    private LocalDateTime startDateTime; //이벤트가 언제 시작하는지

    private LocalDateTime endDateTime; //이벤트가 언제 끝나는지

}

/*
● Event라는 모델을 만들었다.
● 모델(Model)은 실제 우리가 어떠한 것을 전달하고자 애플리케이션에서 다루는 평범한 자바 객체(POJO)이다.
● 롬복 애노테이션에 대한 설명은 생략했으므로 레퍼런스를 통해 학습하자.
@Getter @Setter
@Builder @NoArgsConstructor @AllArgsConstructor
● 롬복 애노테이션을 사용하면 컴파일 시점에 자동으로 타겟 디렉토리(maven complie 시 생성됨)
 */
