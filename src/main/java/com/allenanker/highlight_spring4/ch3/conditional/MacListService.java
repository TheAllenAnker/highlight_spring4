package com.allenanker.highlight_spring4.ch3.conditional;

public class MacListService implements ListService {
    @Override
    public String showListCmd() {
        return "dir";
    }
}
