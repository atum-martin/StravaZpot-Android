package com.sweetzpot.stravazpot.authenticaton.api;

public enum AccessScope {
    PUBLIC("read_all"),
    READ("activity:read"),
    WRITE("activity:write"),
    VIEW_PRIVATE("profile:read_all"),
    VIEW_PRIVATE_WRITE("profile:read_all,activity:write"),
    PROFILE_READ("profile:read_all"),    
    PROFILE_WRITE("profile:write"),
    FULL_WRITE("profile:write,activity:write"),
    FULL_READ("profile:read_all,activity:read_all,read_all");

    private String rawValue;

    AccessScope(String rawValue) {
        this.rawValue = rawValue;
    }
    
    @Override
    public String toString() {
        return rawValue;
    }
}
