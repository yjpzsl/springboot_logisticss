package com.entor.service.impl;

import com.entor.entity.Auth;
import com.entor.mapper.AuthMapper;
import com.entor.service.IAuthService;
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
public class AuthServiceImpl extends ServiceImpl<AuthMapper, Auth> implements IAuthService {

}
