package com.songoda.epicanchors;

public class References {

    private String prefix;

    public References() {
        prefix = EpicAnchorsPlugin.getInstance().getLocale().getMessage("general.nametag.prefix") + " ";
    }

    public String getPrefix() {
        return this.prefix;
    }
}