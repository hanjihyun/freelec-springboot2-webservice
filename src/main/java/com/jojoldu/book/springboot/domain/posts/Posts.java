package com.jojoldu.book.springboot.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter //lombok annotation, 클래스 내 모든 필드의 Getter메소드 자동 생성
@NoArgsConstructor //lombok annotation , 기본 생성자 자동 추가 Public Posts(){}와 같은 효과
@Entity //JPA annotation
// @Entity는 기본값으로 클래스의 카멜케이스 이름을 언더스코어 네이밍(_)으로 테이블 이름을 매칭 SalesManager.java -> sales_manager table
public class Posts extends BaseTimeEntity { //Posts class - DB 테이블과 매칭될 클래스이다. : Entity 클래스라 한다
    //DB 데이터 작업을 할 때 실제 쿼리를 날리지 않고, Entity 클래스를 수정한다.

    //@GeneratedValue : PK의 생성규칙 나타냄
    // 2.0버전에서는 strategy = GenerationType.IDENTITY : auto_increment
    @Id //해당 필드의 PK를 나타냄
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //@Column : 테이블의 칼럼을 나타내며 굳이 선언하지 않아도 해당 클래스의 필드는 모두 칼럼이된다.
    //사용하는 이유? 기본 값 외에 추가로 변경이 필요한 옵션이 있을 때
    //문자열의 경우 VARCHAR(255)가 기본, 사이즈를 500으로 늘릴 때나 TEXT로 변경하거나
    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    //@Builder : 해당 클래스의 빌더 패턴 클래스를 생성
    //생성자 상단에 선언 시 생성자에 포함된 필드만 빌더에 포함
    @Builder
    public Posts(String title,String content,String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
