package com.sxt.sys.service;

import com.sxt.sys.domain.User;
import com.sxt.sys.vo.UserVo;

/**
 * 用户服务接口
 * @author MicroFANs
 *
 */

public interface UserService {
	User login(UserVo userVo);

}
