package userms.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author ZHZ
 */
@Getter
@Setter
public class Role implements Serializable {
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
