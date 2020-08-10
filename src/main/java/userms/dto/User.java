package userms.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

/**
 * @author ZHZ
 */
@Getter
@Setter
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class User extends PagingParam {
    private Integer id;
    private String userName;
    private String userAdrs;
    private String userPhone;
    private String userPswd;


    public User(){
    }

    public User(int id,String userName,String userAdrs,String userPhone,String userPswd){
        this.id = id;
        this.userName = userName;
        this.userPhone = userPhone;
        this.userAdrs = userAdrs;
        this.userPswd = userPswd;
    }

    @Override
    public String toString(){
        return "User{id = " + id + " , 姓名 = " + userName + " , 住址 = " + userAdrs +
                " , 电话 = " + userPhone + " , 密码 = " + userPswd + "}";
    }
}
