package org.py.mymodule.submodule.service.impl;

import org.py.mymodule.submodule.entity.Db;
import org.py.mymodule.submodule.mapper.DbMapper;
import org.py.mymodule.submodule.service.IDbService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * Database privileges 服务实现类
 * </p>
 *
 * @author author
 * @since 2024-06-19
 */
@Service
public class DbServiceImpl extends ServiceImpl<DbMapper, Db> implements IDbService {

}
