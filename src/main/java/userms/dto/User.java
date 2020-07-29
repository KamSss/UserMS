package userms.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author ZHZ
 */
@Getter
@Setter
public class User implements Serializable {
    private Integer id;
    private String uName;
    private String uAdrs;
    private String uPhone;
    private String uPswd;

    public User(){
    }

    public User(int id,String uName,String uAdrs,String uPhone,String uPswd){
        this.id = id;
        this.uName = uName;
        this.uPhone = uPhone;
        this.uAdrs = uAdrs;
        this.uPswd = uPswd;
    }

    @Override
    public String toString(){
        return "User{id = " + id + " , 姓名 = " + uName + " , 住址 = " + uAdrs +
                " , 电话 = " + uPhone + " , 密码 = " + uPswd + "}";
    }
}
