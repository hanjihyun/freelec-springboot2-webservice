# freelec-springboot2-webservice
### 스프링 부트와 AWS로 혼자 구현하는 웹 서비스
## 1. Gradle Project를 Spring boot Project로 변경하기

## mavenCentral, jcentr 비교
# mavenCentral
- 저장소
- 본인이 만든 라이브러리를 업로드하기 위해서 많은 설정 필요
# jcenter
- mavenCentral 문제점 개선
- 라이브러리 업로드 간단 
- jcenter에 라이브러리를 업로드 하면 mavenCentral에도 업로드 될 수 있도록 자동화 가능


## lombok (2021-01-18)
- Getter, Setter, 기본생성자, toString등을 어노테이션으로 자동생성해준다.
# assertThat
- assertj라는 테스트 검증 라이브러리의 검증 메소드
  검증하고 싶은 대상을 메소드 인자로 받는다.
  메소드 체이닝이 지원되어 isEqualTo와 같이 메소드를 이어서 사용할 수 잇다.
# isEqualTo
- assertj의 동등 비교 메소드
- assertThat에 있는 값과 isEqualTo의 값을 비교해서 같을 때 성공
# @RequestParam
- 외부에서 API로 넘긴 파라미터 가져오는 어노테이션
# param
- API테스트할 때 사용될 요청 파라미터 설정
- String만 허용
# jsonPath 
- JSON응답값 필드별로 검증할 수 있는 메소드
- $기준으로 필드명 명시
