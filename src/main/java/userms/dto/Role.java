package userms.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author ZHZ
 */
@Getter
@Setter
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class Role extends PagingParam  {
    private Integer rId;
    private String rName;

    public Role(){
    }

    public Role(int rId,String rName){
        this.rId = rId;
        this.rName = rName;
    }

    @Override
    public String toString(){
        return "Role{角色id = " + rId +  ",角色名称 = " + rName + "}";
    }
}
