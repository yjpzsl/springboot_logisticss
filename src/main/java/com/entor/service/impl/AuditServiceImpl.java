package com.entor.service.impl;

import com.entor.entity.Audit;
import com.entor.mapper.AuditMapper;
import com.entor.service.IAuditService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 牙举鹏
 * @since 2020-01-07
 */
@Service
public class AuditServiceImpl extends ServiceImpl<AuditMapper, Audit> implements IAuditService {

}
