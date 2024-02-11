package user;

/**
 * @author Administrator
 * 这个类将会实现以下几个功能
 *  1. 生成uuid
 *  2. 生成时间
 *  3.
 */
public class User {
    String name;
    char[] uuid;
    int time;



    public User(String name){
        this.name = name;
    }
    public User(char[] uuid){
        this.uuid = uuid;

    }


    public char[] getuuid() {
        return uuid;
    }

    public void setuuid(char[] uuid) {
        this.uuid = uuid;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

}
