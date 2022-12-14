package com.car.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {

    private int _id;
    private long mispar_rechev;
    private int tozeret_cd;
    private String sug_degem;
    private String tozeret_nm;
    private int degem_cd;
    private String degem_nm;
    private String ramat_gimur;
    private String ramat_eivzur_betihuty;
    private int kvutzat_zihum;
    private int shnat_yitzur;
    private String degem_manoa;
    private String mivchan_acharon_dt;
    private String tokef_dt;
    private String baalut;
    private String misgeret;
    private int tzeva_cd;
    private String tzeva_rechev;
    private String zmig_kidmi;
    private String zmig_ahori;
    private String sug_delek_nm;
    private int horaat_rishum;
    private String moed_aliya_lakvish;
    private String kinuy_mishari;
    private double rank;





}
