package com.rutong.warehouse.service;

import com.rutong.warehouse.domain.ApiResult;
import com.rutong.warehouse.domain.FriendlyLink;

/**
 * @author 冯怿
 * @since 2019/6/25 19:22
 */
public interface IFriendlyLinkService {
    ApiResult searchFriendlyLinkList(FriendlyLink friendlyLink);

    ApiResult searchFriendlyLink(FriendlyLink friendlyLink);

    ApiResult addFriendlyLink(FriendlyLink friendlyLinkTable);

    ApiResult delFriendlyLink(FriendlyLink friendlyLinkTable);

    ApiResult changeFriendlyLink(FriendlyLink friendlyLink);
}
