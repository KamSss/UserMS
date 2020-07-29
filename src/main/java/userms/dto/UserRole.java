package userms.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author ZHZ
 */
@Getter
@Setter
public class UserRole implements Serializable {
    private Integer n_id;
    private Integer u_id;
    private Integer r_id;

    /*
    private String uName;
    private String rName;
     */

    public UserRole(){}

    public UserRole(int n_id,int u_id,int r_id){
        this.n_id = n_id;
        this.u_id = u_id;
        this.r_id = r_id;
        /*
        this.uName = uName;
        this.rName = rName;
         */
    }

    @Override
    public String toString(){
        return "UserRole{n_id = " + n_id + " , u_id = " + u_id + " , r_id = " + r_id + "}";
    }
}
