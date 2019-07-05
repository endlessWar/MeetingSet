package com.rutong.warehouse.persistence;

import com.rutong.warehouse.domain.FriendlyLink;

import java.util.List;

/**
 * @author 冯怿
 * @since 2019/6/25 19:25
 */
public interface IFriendlyLinkMapper {
    List<FriendlyLink> searchFriendlyLinkList(FriendlyLink friendlyLink);

    FriendlyLink searchFriendlyLink(FriendlyLink friendlyLink);

    int changeFriendlyLink(FriendlyLink friendlyLink);

    int addFriendlyLink(FriendlyLink friendlyLink);

    int delFriendlyLink(FriendlyLink friendlyLink);
}
