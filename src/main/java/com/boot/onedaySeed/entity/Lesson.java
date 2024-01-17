package com.boot.onedaySeed.entity;

import com.boot.onedaySeed.constant.LessonStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="lesson")
@Getter
@Setter
@ToString
public class Lesson extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "lesson_id")
    private Long lessonId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "host_num")
    private Host host;

    @Column(nullable = false, name ="lesson_name")
    private String lessonName;

    @Column(nullable = false,  name ="lesson_category")
    private String lessonCategory;

    @Column(nullable = false , name="lesson_schedule")
    private String lessonSchedule;
    //LocalDateTime,Long ?

    @Column(nullable = false, name ="fee")
    private Long price;

    @Column(nullable = false , name ="lesson_limited")
    private Integer lessonLimited; //인원수 제한

    @Enumerated(EnumType.STRING)
    private LessonStatus lessonStatus;

    
    //1.인원수 제한 컬럼 생성 여부 ...
    //2.사업자 번호, 아이디 선택 (Host class 변경) 0
    //3.수업 스케쥴 타입 선택 ....
    //4. fee => price로 변경가능한가 0







}
