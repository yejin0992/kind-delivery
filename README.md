
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

**2. 음식(Food)**
- 음식(등록, 수정, 삭제)
- 음식 조회하기

**3. 식당(Restaurant)**
- 식당(등록, 수정, 삭제)

**4. 장바구니(Cart)**
- 음식 장바구니에 추가, 수정, 삭제
- 장바구니 확인

**5. 주문(Order)**
- 주문하기(취소하기)
- 주문내역 확인

----

#### ✔️ REST API 설계
<table>
  <tr>
    <th>기능</th>
    <th>Method</th>
    <th>URL</th>
  </tr>

  <tr>
    <td>음식 조회</td>
    <td>GET</td>
    <td>/food/{id}</td>
  </tr>

  <tr>
    <td>음식 저장</td>
    <td>POST</td>
    <td>/food/</td>
  </tr>

  <tr>
    <td>모든 음식 조회</td>
    <td>GET</td>
    <td>/foods</td>
  </tr>

  <tr>
    <td>음식 삭제</td>
    <td>DELETE</td>
    <td>/food/{id}</td>
  </tr>

  <tr>
    <td>음식점 조회</td>
    <td>GET</td>
    <td>/restaurant/{id}</td>
  </tr>

  <tr>
    <td>음식점 저장</td>
    <td>POST</td>
    <td>/restaurant/</td>
  </tr>

  <tr>
    <td>모든 음식점 조회</td>
    <td>GET</td>
    <td>/restaurants</td>
  </tr>

  <tr>
    <td>음식점 삭제</td>
    <td>DELETE</td>
    <td>/restaurant/{id}</td>
  </tr>
</table>

----
#### ✔️ ERD
![ERD](https://github.com/yejin0992/kind-delivery/assets/128785412/76f08916-8933-4b1b-9b17-3553e0fb885e)

