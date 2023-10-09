# Sketch-Me-Backend
&lt;Sketch Me>의 백엔드 파트 코드입니다.

# Git Convention 

Git Flow를 따라 간다. 

# Commit 메시지 구조

제목, 본문, 꼬리말 세 파트로 나누고, 각 파트는 빈 줄을 두어 구분한다.

`:` 뒤에만 space가 있음에 유의한다.

```
type: subject   

body

footer
```

# 커밋 분류 (type)

## 규칙

- 대분류를 `[]` 안에 넣어 맨 앞에 삽입한다.
- 커밋 분류는 대문자로 시작한다.

## 대분류

- FE : Frontend
- BE : Backend
- IF : Infra

## 소분류

- `Feat` : 새로운 기능 추가 (넓은 개념)
- `Modify` : 기존 기능 수정
- `Fix` : 버그 수정
- `Docs` : 문서 내용 변경
- `Style` : 포맷, 세미 콜론 수정 등 코드 수정이 아닌 스타일 관련 수정
- `Design` : css 등 UI 디자인 변경
- `Add` : 코드, 테스트, 예제, 문서 등 추가 생성 (좁은 개념)
- `Delete` : 코드 삭제
- `Rename` : 이름 변경, 위치 옮기는 작업
- `Refactor` : 코드 전면 수정
- `Test` : 테스트 코드 추가, 테스트 코드 리팩토링
- `Build` : 빌드 관련 파일 수정
- `CI` : CI 관련 설정 수정에 대한 커밋
- `Init` : 프로젝트 시작

