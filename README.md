# java-racingcar-precourse

## 구현 기능 목록

### 입력
- [O] 자동차 이름들을 쉼표(,) 기준으로 입력받는다. (1~5자, 공백/빈값/빈항목 금지)
- [O] 시도할 횟수를 입력받는다. (양의 정수만)

### 검증
- [O] 유효하지 않은 입력은 `IllegalArgumentException` 발생 후 프로그램 종료

### 게임 규칙
- [O] 각 라운드에서 자동차별로 `Randoms.pickNumberInRange(0, 9)` 실행
- [O] 값이 `>= 4`면 한 칸 전진

### 출력
- [O] 차수별 실행 결과를 정확한 포맷으로 출력: `이름 : ---`
- [O] 최대 전진 거리의 자동차(들)를 우승 처리
- [O] 우승자가 여럿이면 `,`로 구분해 출력: `최종 우승자 : pobi, jun`

### 설계/제약
- [O] 들여쓰기(depth) ≤ 2, 3항 연산자 금지, 한 메서드-한 책임
- [O] `Console.readLine()`, `Randoms.pickNumberInRange(0, 9)` 사용
- [O] JUnit5 + AssertJ로 핵심 로직 테스트