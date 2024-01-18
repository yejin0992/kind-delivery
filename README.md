
#### ✔️ 프로젝트 소개
프로젝트명 : kind-delivery (배달어플)

기간 : 2024.01.16 ~ (진행중)

----
#### ✔️ 도메인별로 분류
**1. 사용자(User)**
- 회원가입
- 로그인
- 회원정보 조회
- 회원정보 수정
- 아이디/비밀번호 찾기
- 회원탈퇴
- 찜 목록 조회
- 리뷰 모아보기

**2. 주소(Address)**
- 주소지 관리(등록, 추가, 수정, 삭제)

**3. 음식(Food)**
- 음식(등록, 수정, 삭제)
- 메뉴 장바구니에 추가
- 음식 조회하기
- 음식 주문하기
- 음식 결제하기

**4. 식당(Restaurant)**
- 식당(등록, 수정, 삭제)
- 식당 찜하기
- 리뷰 (등록, 수정, 삭제)
- 찜(등록, 수정, 삭제)
- 별점 (등록, 수정, 삭제)
- 카테고리별로 보기
- 별점 순으로 식당 추천받기
- 식당 검색하기

**5. 장바구니(Cart)**
- 음식 장바구니에 추가, 수정, 삭제
- 장바구니 확인

**6. 주문(Order)**
- 주문하기(취소하기)
- 주문내역 확인

**7. 배달(Delivery)**
- 배달 정보 확인

**8. 결제(Payment)**
- 결제하기(취소하기)
----

#### ✔️ REST API 설계
음식조회 /findFood/{key} -> GET

음식등록/saveFood -> POST

----
#### ✔️ ERD
![스크린샷 2024-01-18 102526](https://github.com/yejin0992/kind-delivery/assets/128785412/013807d9-0766-45c8-aeef-f18213367d8a)
