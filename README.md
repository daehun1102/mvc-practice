# 코멘토 직무부트캠프 과제
5주간 진행한 백엔드 개발 실무 부트캠프에 참여하면서 정리하기위해 작성한 레포지토리입니다.
<br>
<br>

## 1주차 과제: 개발환경 세팅

- **1-1. IntelliJ Community 버전 설치 (2024.02)**
  - IntelliJ Community 버전 설치 및 기본 설정 완료

- **1-2. Debeaver 설치 및 DB Connection**
  - Debeaver 설치 및 데이터베이스 연결 설정

- **1-3. Spring MVC 환경설정 & API PING**
  - Spring MVC 환경 설정 및 간단한 API 핑 테스트 수행

- **1-4. datasource & mybatis 연동**
  - Datasource와 MyBatis 연동하여 데이터베이스 통신 구현
<br>
<br>

## 2주차 과제: API 명세서 작성

- **2-1. API 구성요소 및 명세서 작성방법 학습** <br>
- **2-2. AI 모델 학습 API**의 명세서 작성 <br><br>


아래는 과제를 위해 작성한 API 입니다.
### AI 모델 학습 API

- **카테고리:** 사용자
- **설명:** AI 모델 학습을 위한 파라미터
- **유형:** POST
- **URL:** `api.comento.com/v1/model/train`

#### 본문 파라미터

| **이름**         | **유형** | **필수** | **설명**                              |
| ---------------- | -------- | -------- | ------------------------------------- |
| Model            | string   | O        | 학습시킬 모델 이름 |
| Dataset          | string   | O        | 모델을 학습시키기 위한 Dataset 이름 |
| Epoch            | int      | O        | 학습시킬 epoch 수 |
| ResearcherName   | string   |          | 연구원 이름 |

#### 응답

| **필드**     | **유형** | **설명**                                       |
| ------------ | -------- | ---------------------------------------------- |
| isSuccess    | boolean  | 학습이 제대로 돌아갔는지 여부 |
| metric       | string   | 학습 결과를 나타낼 metric (accuracy, loss, map50) |
| bestscore    | double   | 최고 metric 수치 |
| score        | list     | epoch 별 metric 수치 리스트 |

#### 응답 코드

| **상태 코드** | **응답 본문**       | **설명**               |
| ------------- | ------------------- | ---------------------- |
| 200           | 성공적으로 처리     |                        |
| 400           | 요청 오류           |  |

## 3주차 과제

3주차 과제 내용 추가 예정

## 4주차 과제

4주차 과제 내용 추가 예정

## 최종 과제

최종 과제 내용 추가 예정