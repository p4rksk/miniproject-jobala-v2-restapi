package com.example.jobala.resume;

import com.example.jobala._user.User;
import com.example.jobala.jobopen.Jobopen;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ResumeResponse {

    //TODO: 이름들 좀 적어줘~!!!!!선규 그리고 ASave는 뭐여??
    @Data
    public static class ASaveDTO {
        private Integer userId;
        private Integer resumeId;
        private String resumeTitle;
        private String hopeJob;
        private String career;
        private String license;
        private String content;
        private String edu;
        private List<String> skills = new ArrayList<>();

        public ASaveDTO(Resume resume, User user) {
            this.userId = user.getId();
            this.resumeId = resume.getId();
            this.resumeTitle = resume.getResumeTitle();
            this.hopeJob = resume.getHopeJob();
            this.career = resume.getCareer();
            this.license = resume.getLicense();
            this.content = resume.getContent();
            this.edu = resume.getEdu();
            this.skills = Arrays.asList(resume.getSkills());
        }
    }


    //이력서 관리
    @Data
    public static class MngDTO {
        private Integer userId;
        private List<ResumeDTO> resume = new ArrayList<>();

        public MngDTO(Integer userId, List<Resume> resumeList) {
            this.userId = userId;
            this.resume = resumeList.stream().map(ResumeDTO::new).toList();
        }

        @Data
        public static class ResumeDTO {
            private Integer id;
            private String resumeTitle;

            public ResumeDTO(Resume resume) {
                this.id = resume.getId();
                this.resumeTitle = resume.getResumeTitle();
            }
        }
    }


    @AllArgsConstructor
    @Data
    public static class ScrapDTO {
        private UserDTO user;
        private int resumeId;
        private String resumeTitle;
        private String career;
        private String edu;

        public ScrapDTO(Resume resume) {
            this.resumeId = resume.getId();
            this.user = new UserDTO(resume.getUser());
            this.resumeTitle = resume.getResumeTitle();
            this.career = resume.getCareer();
            this.edu = resume.getEdu();
        }

        @Data
        public class UserDTO {
            private int id;
            private String name;

            public UserDTO(User user) {
                this.id = user.getId();
                this.name = user.getName();
            }
        }
    }


    // update시 체크되도록하는 DTO
    @Data
    @AllArgsConstructor
    public static class CheckBoxDTO {
        private Boolean java;
        private Boolean JavaScript;
        private Boolean spring;
        private Boolean html;
        private Boolean jquery;
        private Boolean mysql;

        public CheckBoxDTO(List<String> skillList) {
            this.java = skillList.contains("Java");
            this.JavaScript = skillList.contains(" JavaScript");
            this.spring = skillList.contains(" Spring");
            this.html = skillList.contains(" HTML");
            this.jquery = skillList.contains(" jQuery");
            this.mysql = skillList.contains(" MySQL");
        }
    }


    @AllArgsConstructor
    @Data
    public static class ScoutListDTO {
        private Integer resumeId; //이력서 아이디
        private String username;
        private String resumeTitle; //이력서제목
        private String edu; //학력
        private String career; //경력
        private String imgFilename;

    }


    @AllArgsConstructor
    @Data
    public static class DetailDTO {
        private Integer resumeId;
        private String resumeTitle;
        private String hopeJob;
        private String career;
        private String license;
        private String content;
        private String edu;
        private String skills;
        private boolean isScrap;
        private boolean isGuestScrap;
        private UserDTO userDTO;
        private List<JobopenDTO> applyJobopenList = new ArrayList<>();

        public DetailDTO(Resume resume, User user, List<Jobopen> jobopenList) {
            this.resumeId = resume.getId();
            this.resumeTitle = resume.getResumeTitle();
            this.hopeJob = resume.getHopeJob();
            this.career = resume.getCareer();
            this.license = resume.getLicense();
            this.content = resume.getContent();
            this.edu = resume.getEdu();
            this.skills = resume.getSkills();
            this.isGuestScrap = false;
            this.isScrap = false;

            this.userDTO = new UserDTO(resume.getUser());

            //기업 제안하기 - 모달창 공고 목록
            this.applyJobopenList = jobopenList.stream().map(j -> new JobopenDTO(j)).toList();

            // 회사만 이력서를 스크랩 할 수 있다.
            if (user != null) {
                if (user.getRole() == 1) {
                    this.isGuestScrap = true;
                }
            }
        }

        @Data
        public class JobopenDTO {
            private String jobopenTitle;
            private String hopeJob;
            private String career;

            public JobopenDTO(Jobopen jobopen) {
                this.jobopenTitle = jobopen.getJobopenTitle();
                this.hopeJob = jobopen.getHopeJob();
                this.career = jobopen.getCareer();
            }
        }

        @Data
        public class UserDTO {
            private Integer userId;
            private String imgFilename;
            private String name;
            private Date age;
            private String email;
            private String address;

            public UserDTO(User user) {
                this.userId = user.getId();
                this.imgFilename = user.getImgFilename();
                this.name = user.getName();
                this.age = user.getAge();
                this.email = user.getEmail();
                this.address = user.getAddress();
            }
        }
    }

    @AllArgsConstructor
    @Data
    public static class UpdateDTO {
        private Integer resumeId;
        private String resumeTitle;
        private String hopeJob;
        private String career;
        private String license;
        private String content;
        private String edu;
        private String skills;

        public UpdateDTO(Resume resume) {
            this.resumeId = resume.getId();
            this.resumeTitle = resume.getResumeTitle();
            this.hopeJob = resume.getHopeJob();
            this.career = resume.getCareer();
            this.license = resume.getLicense();
            this.content = resume.getContent();
            this.edu = resume.getEdu();
            this.skills = resume.getSkills();
        }
    }
}