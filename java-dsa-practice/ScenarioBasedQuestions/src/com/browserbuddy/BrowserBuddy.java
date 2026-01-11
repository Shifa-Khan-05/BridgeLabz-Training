package com.browserbuddy;

import java.util.Stack;

public class BrowserBuddy {

    private static Stack<BrowserTab> closedTabs = new Stack<>();
    private static BrowserTab currentTab = new BrowserTab();

    // Close current tab
    public static void closeTab() {
        closedTabs.push(currentTab);
        currentTab = new BrowserTab();
        System.out.println("Tab closed.");
    }

    // Restore recently closed tab
    public static void restoreTab() {
        if (!closedTabs.isEmpty()) {
            currentTab = closedTabs.pop();
            System.out.println("Restored tab with page: " + currentTab.getCurrentPage());
        } else {
            System.out.println("No tabs to restore.");
        }
    }

    /* ================================
       Main Driver
    ================================ */
    public static void main(String[] args) {

        currentTab.visit("google.com");
        currentTab.visit("youtube.com");
        currentTab.visit("github.com");

        currentTab.back();
        currentTab.back();
        currentTab.forward();

        closeTab(); // close tab

        restoreTab(); // restore tab
        System.out.println("Current Page: " + currentTab.getCurrentPage());
    }
}