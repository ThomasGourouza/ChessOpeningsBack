package com.cavalierfou.chessopenings.constant;

public enum Constant {

    O("openings"), 
    M("moves"), 
    R("relations"),
    OID("opening_id"),
    POID("parent_opening_id"),
    COID("child_opening_id"),
    OIS("openings_id_seq"),
    MIS("moves_id_seq"),
    RIS("relations_id_seq");

    private String value; 
  
    public String getValue() 
    { 
        return this.value; 
    } 
  
    private Constant(String value) 
    { 
        this.value = value; 
    }
}
