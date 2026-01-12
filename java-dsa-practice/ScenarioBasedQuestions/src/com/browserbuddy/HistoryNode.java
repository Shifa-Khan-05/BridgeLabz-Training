package com.browserbuddy;

/* ================================
   Node of Doubly Linked List
================================ */
class HistoryNode {
    String url;
    HistoryNode prev;
    HistoryNode next;

    public HistoryNode(String url) {
        this.url = url;
        this.prev = null;
        this.next = null;
    }
}

/* ================================
   Browser Tab (History Manager)
================================ */

class BrowserTab {

    private HistoryNode current;

    // Visit a new page
    public void visit(String url) {
        HistoryNode newNode = new HistoryNode(url);

        // Remove forward history
        if (current != null) {
            current.next = null;
            newNode.prev = current;
            current.next = newNode;
        }

        current = newNode;
        System.out.println("Visited: " + url);
    }

    // Go back
    public void back() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Back to: " + current.url);
        } else {
            System.out.println("No previous page.");
        }
    }

    // Go forward
    public void forward() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Forward to: " + current.url);
        } else {
            System.out.println("No next page.");
        }
    }

    public String getCurrentPage() {
        return current != null ? current.url : "Empty Tab";
    }
}


