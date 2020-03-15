package com.sxt.sys.service;

import java.util.List;

import com.sxt.sys.domain.Menu;
import com.sxt.sys.vo.MenuVo;

/**
 * 菜单管理服务接口
 * @author MicroFANs
 *
 */

public interface MenuService {
	/**
	 * 查询所有菜单返回
	 * List<Menu>
	 */
	public List<Menu> queryAllMenuForList(MenuVo menuVo);
	
	/**
	 * 根据用户id查询用户的可用菜单
	 */
	public List<Menu> queryMenuByUserIdForList(MenuVo menuVo,Integer userId);

}
