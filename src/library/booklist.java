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
public class booklist {
    private int boid;
    private String boname;
    private String boauth;
    private String bocat;
    private int av;
    public booklist(int boid,String boname,String boauth,String bocat,int av){
        this.boid=boid;
        this.boname=boname;
        this.boauth=boauth;
        this.bocat=bocat;
        this.av=av;
    }
    public int getBoid(){
        return boid;
    }
    public String getBoname(){
        return boname;
    }
    public String getBoauth(){
        return boauth;
    }
    public String getBocat(){
        return bocat;
    }
    public int getAv(){
        return av;
    }
}
