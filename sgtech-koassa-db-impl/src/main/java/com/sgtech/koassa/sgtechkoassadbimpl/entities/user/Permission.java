package com.sgtech.koassa.sgtechkoassadbimpl.entities.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Permission {

    ADMIN_READ("admin:read"),
    ADMIN_UPDATE("admin:update"),
    ADMIN_CREATE("admin:create"),
    ADMIN_DELETE("admin:delete"),

    LIVREUR_READ("livreur:read"),
    LIVREUR_UPDATE("livreur:update"),

    SELLER_READ("seller:update"),
    SELLER_UPDATE("seller:update"),

    MANAGER_READ("management:read"),
    MANAGER_UPDATE("management:update"),
    MANAGER_CREATE("management:create"),

;
    @Getter
    private final String permission;

}
