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
public class PagingParam implements Serializable {

    private Integer pageNum = 1;
    private Integer pageSize = 5;
}
