package com.urban.MedFinder.entity;


import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Table(name = "HOSPITAL")
@Getter
public class Hospital {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "HOSPITAL_NUM", nullable = false)
    private Long hospitalNum;

    @Column(name = "DUTYADDR", length = 200)
    private String dutyAddr;

    @Column(name = "DUTYDIV", length = 1)
    private String dutyDiv;

    @Column(name = "DUTYDIVNAME", length = 50)
    private String dutyDivName;

    @Column(name = "DUTYEMCLS", length = 4)
    private String dutyEmcls;

    @Column(name = "DUTYEMCLSNAME", length = 50)
    private String dutyEmclsName;

    @Column(name = "DUTYERYN", length = 1)
    private String dutyEryn;

    @Column(name = "DUTYETC", length = 1500)
    private String dutyEtc;

    @Column(name = "DUTYMAPIMG", length = 100)
    private String dutyMapImg;

    @Column(name = "DUTYNAME", length = 100)
    private String dutyName;

    @Column(name = "DUTYTEL1", length = 20)
    private String dutyTel1;

    @Column(name = "DUTYTEL3", length = 20)
    private String dutyTel3;

    @Column(name = "DUTYTIME1C", length = 500)
    private String dutyTime1C;

    @Column(name = "DUTYTIME2C", length = 500)
    private String dutyTime2C;

    @Column(name = "DUTYTIME3C", length = 500)
    private String dutyTime3C;

    @Column(name = "DUTYTIME4C", length = 500)
    private String dutyTime4C;

    @Column(name = "DUTYTIME5C", length = 500)
    private String dutyTime5C;

    @Column(name = "DUTYTIME6C", length = 500)
    private String dutyTime6C;

    @Column(name = "DUTYTIME7C", length = 10)
    private String dutyTime7C;

    @Column(name = "DUTYTIME8C", length = 10)
    private String dutyTime8C;

    @Column(name = "DUTYTIME1S", length = 500)
    private String dutyTime1S;

    @Column(name = "DUTYTIME2S", length = 500)
    private String dutyTime2S;

    @Column(name = "DUTYTIME3S", length = 500)
    private String dutyTime3S;

    @Column(name = "DUTYTIME4S", length = 500)
    private String dutyTime4S;

    @Column(name = "DUTYTIME5S", length = 500)
    private String dutyTime5S;

    @Column(name = "DUTYTIME6S", length = 500)
    private String dutyTime6S;

    @Column(name = "DUTYTIME7S", length = 10)
    private String dutyTime7S;

    @Column(name = "DUTYTIME8S", length = 10)
    private String dutyTime8S;

    @Column(name = "HPID", length = 500)
    private String hpid;

    @Column(name = "POSTCDN1", length = 500)
    private String postCdn1;

    @Column(name = "POSTCDN2", length = 500)
    private String postCdn2;

    @Column(name = "DUTYINF", length = 300)
    private String dutyInf;

    @Column(name = "LON", length = 30)
    private String lon;

    @Column(name = "LAT", length = 30)
    private String lat;

    @Column(name = "X", length = 30)
    private String x;

    @Column(name = "Y", length = 30)
    private String y;

    @Column(name = "DUTYWEEKENDAT", length = 2)
    private String dutyWeekendAt;

    @Column(name = "MEMBER_NUM")
    private Long memberNum;
}
