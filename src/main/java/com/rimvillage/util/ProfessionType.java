package com.rimvillage.util;

public enum ProfessionType {
    FARMER("farmer", true),
    LUMBERJACK("lumberjack", true);
    
    public final String name;
    public final boolean canCopy;

    private ProfessionType(String name, boolean copy) {
        this.name = name;
        this.canCopy = copy;
    }
}