package org.py.mymodule.submodule.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * Database privileges
 * </p>
 *
 * @author author
 * @since 2024-06-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("db")
@ApiModel(value="Db对象", description="Database privileges")
public class Db implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "Host", type = IdType.AUTO)
    private String Host;

    private String Db;

    private String User;

    private String selectPriv;

    private String insertPriv;

    private String updatePriv;

    private String deletePriv;

    private String createPriv;

    private String dropPriv;

    private String grantPriv;

    private String referencesPriv;

    private String indexPriv;

    private String alterPriv;

    private String createTmpTablePriv;

    private String lockTablesPriv;

    private String createViewPriv;

    private String showViewPriv;

    private String createRoutinePriv;

    private String alterRoutinePriv;

    private String executePriv;

    private String eventPriv;

    private String triggerPriv;


}
