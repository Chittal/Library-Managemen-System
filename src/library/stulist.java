/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

/**
 *
 * @author Cute
 */
public class stulist {
    private int uid;
    private String uname;
    private String depart;
    private int bt;
    public stulist(int uid,String uname,String depart,int bt){
        this.uid=uid;
        this.uname=uname;
        this.depart=depart;
        this.bt=bt;
    }
    public int getUid(){
        return uid;
    }
    public String getUname(){
        return uname;
    }
    public String getDepart(){
        return depart;
    }
    public int getBt(){
        return bt;
    }
}
