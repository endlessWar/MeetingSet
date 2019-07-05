package com.rutong.warehouse.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.rutong.warehouse.domain.ApiPager;
import com.rutong.warehouse.domain.ApiResult;
import com.rutong.warehouse.domain.FriendlyLink;
import com.rutong.warehouse.persistence.IFriendlyLinkMapper;
import com.rutong.warehouse.service.IFriendlyLinkService;
import com.rutong.warehouse.service.IFriendlyLinkService;
import com.rutong.warehouse.utils.UUIDUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 冯怿
 * @since 2019/6/25 14:36
 */
@Service
public class FriendlyLinkServiceImpl implements IFriendlyLinkService {
    @Resource
    private IFriendlyLinkMapper friendlyLinkMapper;
    
    @Override
    public ApiResult searchFriendlyLinkList(FriendlyLink friendlyLink) {
        PageHelper.startPage(friendlyLink.getPage(), friendlyLink.getSize(), true);
        Page<FriendlyLink> page =(Page<FriendlyLink>) friendlyLinkMapper.searchFriendlyLinkList(friendlyLink);
        ApiPager<FriendlyLink> apiPage = new ApiPager<>(page.getPageSize(), page.getPageNum(), page.getTotal(), page.getResult());
        return new ApiResult<>().success(apiPage);
    }

    @Override
    public ApiResult searchFriendlyLink(FriendlyLink friendlyLink) {
        FriendlyLink resultUser = friendlyLinkMapper.searchFriendlyLink(friendlyLink);
        return new ApiResult<>().success(resultUser);
    }

    @Override
    public ApiResult changeFriendlyLink(FriendlyLink friendlyLink) {
        int i = friendlyLinkMapper.changeFriendlyLink(friendlyLink);
        return new ApiResult<>().success(i);
    }

    @Override
    public ApiResult addFriendlyLink(FriendlyLink friendlyLink) {
        friendlyLink.setGuid(UUIDUtils.getUuid());
        int i = friendlyLinkMapper.addFriendlyLink(friendlyLink);
        return new ApiResult<>().success(i);
    }

    @Override
    public ApiResult delFriendlyLink(FriendlyLink friendlyLink) {
        int i = friendlyLinkMapper.delFriendlyLink(friendlyLink);
        return new ApiResult<>().success(i);
    }
}
