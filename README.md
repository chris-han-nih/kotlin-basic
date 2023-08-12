Kotlin
---

## CLI
```bash
# 실행
$ ./gradlew run

# 실행 (감지)
$ ./gradlew -t run

# 빌드
$ ./gradlew build

# 테스트
$ ./gradlew test

# 테스트 커버리지
$ ./gradlew jacocoTestReport

# 테스트 커버리지 결과 확인
$ open build/reports/jacoco/test/html/index.html

# 린트
$ ./gradlew ktlintCheck

# 린트 자동 수정
$ ./gradlew ktlintFormat
```

## 리턴타입과 타입 추론
> Kotlin 함수의 리턴타입 추론은 함수의 Body가 단일표현식(Single expression)이고, {}블록이 아닐 때만 가능하다.

## 파라미터 정의하기
> Kotlin은 함수나 메서드에 파라미터의 타입을 명시하도록 한다.
> 

## 외부 반복과 아규먼트 매칭
> Kotlin은 외부 반복을 지원한다. 외부 반복은 함수의 파라미터를 명시적으로 지정하는 것을 말한다.
> 
### 레인지 클래스
> 레인지 클래스는 연속된 숫자를 표현하는 클래스이다. 레인지 클래스는 다음과 같이 선언한다.
```kotlin
val oneToTen = 1..10
val alpha = "A".."Z"
var aToe: CharRange = 'a'..'e'
```

### 정방향 반복
> 정방향 반복은 다음과 같이 선언한다.
```kotlin
for (i in 1..10) {
    println(i)
}
```

### 역방향 반복
> 역방향 반복은 다음과 같이 선언한다.
```kotlin
for (i in 10 downTo 1) {
    println(i)
}
```
