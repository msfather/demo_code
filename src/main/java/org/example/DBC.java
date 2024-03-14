package org.example;

public class DBC {
    private DBC(){}
    private static DBC dbc=null;
    public static DBC Connection(){
        if(dbc==null)dbc=new DBC();
        return dbc;
    }

}
