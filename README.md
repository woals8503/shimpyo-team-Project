# Shimpyo back-end
# 📑 목차

- [프로젝트 개요](#-프로젝트-개요)
- [프로젝트 기간](#-프로젝트-기간)
- [멤버 구성](#-멤버-구성)
- [개발 환경](#-개발-환경)
- [기술 스택](#-기술-스택)
- [주요 기능 및 상세](#-주요-기능-및-상세)

# 👋 프로젝트 개요
#### 쉼표는 숙소를 직접 등록하거나 예약할 수 있는 통합 숙박예약 서비스입니다.
### [쉼표 바로가기](http://shimpyo.o-r.kr/)
* 비용 문제로 인하여 xxxx.xx.xx 까지 운영됩니다.

# 📅 프로젝트 기간
> 2023. 06 ~ 2023. 07

# 👪 멤버 구성
| 이름  | 역할 | 기능                              |
|-----|----|---------------------------------|
| 이지환 | 팀장 | AWS EC2 서버 구축, 배포 자동화, 숙소, 관심숙소 |
| 이호석 | 팀원 | 배포 자동화, JSON 응답 모듈화, 예약, 결제, 리뷰 |
| 한재민 | 팀원 | DB설계, 회원(JWT , SMS 인증, 소셜 로그인)  |

# 💻 개발 환경
### Architecture
![development_map](https://github.com/Project-Shimpyo/backend/assets/119032680/89dc4c0b-9515-43ee-9250-b0a2c1c2c77c)
### ERD
![KakaoTalk_20230717_170522640](https://github.com/Project-Shimpyo/backend/assets/47111722/610b6480-d23d-496b-9564-8a1a0d3ab376)
### API
[API 명세서 바로가기](https://docs.google.com/spreadsheets/d/1lcUy45KENA28HkA6w2CRJwkndWbBS591vnjQbwSXX9s/edit?usp=sharing)

# 🔧 기술 스택
- Java 11
- Spring Boot 2.7, Spring Security, Spring Data JPA, Querydsl
- MySQL, Git, GitHub, GitHub Actions
- AWS EC2, AWS RDS, AWS S3, AWS CodeDeploy

# 💻 주요 기능 및 상세
### - 회원 관리

| 기능   | 내용                                                                     |
|------|------------------------------------------------------------------------|
| 회원가입 | 개인 정보를 입력받아서 회원가입을 하거나 소셜 로그인(네이버, 구글)을 통하여 추가 정보를 입력받아서 회원가입을 할 수 있다. |
| 로그인  | 스프링 시큐리티와 JWT 토큰을 이용하여 아이디와 비밀번호를 입력해 로그인하거나, 소셜 로그인으로 로그인할 수 있다.      |
|      |                                                                        | 

### 숙소

| 기능        | 내용                                                              |
|-----------|-----------------------------------------------------------------|
| 숙소 등록     | 회원은 누구나 숙소를 등록할 수 있으며, 숙소 및 객실에 대한 정보를 유동적으로 등록할 수 있다.          |
| 숙소 목록     | 예약 가능한 숙소 목록을 보여주며, 숙소 유형, 지역, 일정, 인원 수 등을 통한 조건부 검색이 가능하다.     |
| 숙소 상세 정보  | 숙소 및 객실에 대한 정보를 상세하게 확인할 수 있으며 해당 정보를 토대로 예약 및 리뷰 현황을 확인할 수 있다. |
| 등록한 숙소 목록 | 자신이 등록한 숙소 목록을 확인 할 수 있다.                                       |

### 결제, 예약

| 기능    | 내용                                                                                                                   |
|-------|----------------------------------------------------------------------------------------------------------------------|
| 결제 및 예약 | 예약하고 싶은 숙소의 날짜를 선택하고 결제 페이지 진입시 결제 준비 페이지가 화면에 나타난다. 결제하기 버튼 선택시 포트원을 이용한 결제창이 생성된다. 회원, 비회원에 따라 등급할인, 쿠폰선택을 할 수 있다. |
| 숙소 예약 목록 | 자신이 등록한 숙소를 선택해서 숙소별, 예약 상태별로 예약 현황을 확인할 수 있다.                                                                       |
| 예약 조회 | 예약한 숙소의 정보, 예약 날짜를 확인할 수 있고, 숙소 주인의 마이 페이지로 이동이 가능하다.                                                                |

### 마이 페이지

| 기능    | 내용                                                           |
|-------|--------------------------------------------------------------|
| 예약 목록 | 예약한 현황을 볼 수 있으며, 예약 수정, 취소가 가능하다. 숙소 이용이 끝난 상태라면 리뷰작성이 가능하다. |
| 리뷰 목록 | 작성한 리뷰들을 확인할 수 있으며, 리뷰 수정, 삭제를 할 수 있다.                       |
|  |                                               |
