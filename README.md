# I am
| 이름 | 사진 | 역할 |  
|:--:|:--:|:---------------:|
| 박선규 |<img src="https://github.com/p4rksk/miniproject-jobala-v2-ssr/assets/153582360/cf8fd9c6-50d9-40b5-9914-09527344bf92" width="100">  | (공고)목록보기, 등록, 수정, 삭제 <br/>(이력서)목록보기, 등록, 수정, 삭제<br>(메인 페이지)검색 페이징<br/>API문서<br/>단위테스트 |
---

# Project v2

<img src="https://github.com/kjh5848/miniproject-JOBALR/assets/161176345/8bc39efd-533f-4696-ae5c-99b07c0e1462"><br>

다음 프로젝트(앱과의 통신)를 위해 v1 프로젝트를 리팩토링하여 Stateless 기반의 REST API로 전환하였습니다.
<br>이 과정에서 Session 대신 JWT를 사용하고, DTO와 Rest API를 활용하였으며, API 문서화를 완료하였습니다.

기간 : 2024.03.22 ~ 2024.04.03

---

# Team

<img src="https://github.com/kjh5848/miniproject-JOBALR/assets/161176345/8bc39efd-533f-4696-ae5c-99b07c0e1462"><br>
개발자가 되기 위한 비전공자들이 모인 자바라입니다.

## Teammates
| Team-Leader | Team-Member | Team-Member | Team-Member | Team-Member |
|:-----------:|:-----------:|:-----------:|:-----------:|:-----------:|
| <img src="https://github.com/vosw1/miniproject-jobala-v2-ssr/assets/153582401/d20420bf-008c-4fd0-a7e0-8983d7606c7c" alt="profile" width="100" height="100"> | <img src="https://github.com/vosw1/miniproject-jobala-v2-ssr/assets/153582401/c4180860-481a-46f0-a0e2-df05bdf8a586" alt="profile" width="100" height="100"> | <img src="https://github.com/vosw1/miniproject-jobala-v2-ssr/assets/153582401/9d7395db-e810-466e-bd9d-9216d18d0395" alt="profile" width="100" height="100"> | <img src="https://avatars.githubusercontent.com/u/153582401?v=4" alt="profile" width="100" height="100"> | <img src="https://github.com/vosw1/miniproject-jobala-v2-ssr/assets/153582401/84715293-8f3a-4939-8122-c85438791364" alt="profile" width="100" height="100"> |
| 김주혁 | 박선규 | 박찬혁 | 송민경 | 장유진 | 

---

# Tech Stack

| FrameWork | ![Spring Boot](https://img.shields.io/badge/-Spring%20Boot-brightgreen?logo=spring&logoColor=white) ![REST API](https://img.shields.io/badge/restapi-ED8B00?style=flat&logo=restapi&logoColor=white) ![JWT](https://img.shields.io/badge/JWT-ffcd00.svg?style=flat&logo=jwt&logoColor=white) ![JUnit Test](https://img.shields.io/badge/junitTest-E34F26?style=flat&logo=junit&logoColor=white) ![Base64](https://img.shields.io/badge/base64-FFA500?style=flat&logo=base64&logoColor=white) ![JSON](https://img.shields.io/badge/json-0078D4?style=flat&logo=json&logoColor=white) |
| :-------: | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|    DB     | ![H2](https://img.shields.io/badge/-H2-orange?logo=amazondocumentdb&logoColor=white)                                                                                                                                                                                                                           |
|  DevOps   | ![Apache Tomcat](https://img.shields.io/badge/apache%20tomcat-%23F8DC75.svg?style=flat&logo=apache-tomcat&logoColor=black) ![AWS](https://img.shields.io/badge/Amazonaws-232F3E?style=flat&logo=amazonaws&logoColor=white)                                                                                                                                                                                 |
|   Tools   | ![Notion](https://img.shields.io/badge/-Notion-black?logo=notion&logoColor=white) ![Git](https://img.shields.io/badge/-Git-red?logo=git&logoColor=white) ![Slack](https://img.shields.io/badge/-Slack-purple?logo=slack&logoColor=white) |


---

## API Document
[ JObara의 API 문서 👆 ](https://typical-trick-410.notion.site/API-060e551fe45f4ad3aad9d4e83d1ae128?pvs=4)

---

# Service

| 기업 회원가입 및 로그인 | 개인 회원가입 및 로그 |
|:-----------------:|:-------------------:|
| <p align="center"><img src="https://github.com/vosw1/miniproject-jobala-v2-restapi/assets/153582401/ae047240-7848-4372-91f4-3e5df302f74b" width="300" height="220"/></p> | <p align="center"><img src="https://github.com/vosw1/miniproject-jobala-v2-restapi/assets/153582401/bfd06c3d-24c0-42b1-9f4e-b3449c2b7daa" width="300" height="220"/></p> |
| 기업 채용공고 관리 | 개인 이력서 관리 |
| <p align="center"><img src="https://github.com/vosw1/miniproject-jobala-v2-restapi/assets/153582401/e7d55541-98fe-45f7-91c9-9b7f3fd10134" width="300" height="220"/></p> | <p align="center"><img src="https://github.com/vosw1/miniproject-jobala-v2-restapi/assets/153582401/2a3f5ddf-b2f7-4b6c-80ec-38cbaaabc1ed" width="300" height="220"/></p> |
| 개인 채용공고 검색 및 지원 | 기업 지원자 합격 |
| <p align="center"><img src="https://github.com/vosw1/miniproject-jobala-v2-restapi/assets/153582401/f0351c06-a91f-45ee-bf83-7d3679df8306" width="300" height="220"/></p> | <p align="center"><img src="https://github.com/vosw1/miniproject-jobala-v2-restapi/assets/153582401/9f7dd8fa-f9d2-4921-8345-620492e64411" width="300" height="220"/></p> |
| 기업 인재 검색 및 포지션 제안 수락 | 기업 인재 스크랩 |
| <p align="center"><img src="https://github.com/vosw1/miniproject-jobala-v2-restapi/assets/153582401/07781096-0f37-4573-930b-914f0ba2c46c" width="300" height="220"/></p> | <p align="center"><img src="https://github.com/vosw1/miniproject-jobala-v2-restapi/assets/153582401/be7a72a7-b2fe-4450-b6de-cf719d792449" width="300" height="220"/></p> |
| 개인 채용공고 찜 | 커뮤니티 이용 |
| <p align="center"><img src="https://github.com/vosw1/miniproject-jobala-v2-restapi/assets/153582401/7fd60978-84c8-4e9b-aa41-d03425d5ab2f" width="300" height="220"/></p> | <p align="center"><img src="https://github.com/vosw1/miniproject-jobala-v2-restapi/assets/153582401/e0753fe3-737e-4fed-939b-0bea59e1e5ee" width="300" height="220"/></p> |




> ## 후기
단위 테스트를 통하여 좀더 명확하게 어디서 오류가 발생했는지 알 수있어 확신있게 디버깅 할 수 있었다.
