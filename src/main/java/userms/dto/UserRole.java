package userms.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

/**
 * @author ZHZ
 */
@Getter
@Setter
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class UserRole extends PagingParam {
    private Integer n_id;
    private Integer u_id;
    private Integer r_id;
    private List<Role> role;
    private List<User> user;

    public UserRole(){}

    public UserRole(int n_id,int u_id,int r_id){
        this.n_id = n_id;
        this.u_id = u_id;
        this.r_id = r_id;
    }

    @Override
    public String toString(){
        return "UserRole{n_id = " + n_id + " , u_id = " + u_id + " , r_id = " + r_id + "}";
    }
}
