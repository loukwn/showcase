package com.can_apps.home_list.core

internal data class HomeDomain(
    val features: List<HomeFeatDomain>
)

internal data class HomeFeatDomain(
    val title: HomeEnumDomain,
    val destLink: HomeDestLinkDomain
)

internal inline class HomeDestLinkDomain(val value: Int)
internal enum class HomeEnumDomain {
    RANK,
    CHAT
}
