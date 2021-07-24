package com.jojoldu.book.springboot.domain.user;

import com.jojoldu.book.springboot.domain.posts.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class User extends BaseTimeEntity {
    //@GeneratedValue : PK의 생성규칙 나타냄
    // 2.0버전에서는 strategy = GenerationType.IDENTITY : auto_increment
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @Column
    private String picture;

    //@Enumerated : JPA로 DB로 저장할 때 Enum 값을 어떤 형태로 저장할지 결정
    // 기본은 int - 숫자로 저장하면 그 의미를 알기 힘들어서 String으로 저장
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;

    @Builder
    public User(Long id, String name, String email, String picture, Role role) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.picture = picture;
        this.role = role;
    }

    public User update(String name, String picture){
        this.name = name;
        this.picture = picture;
        return this;
    }
    public String getRoleKey() {
        return this.role.getKey();
    }


}
