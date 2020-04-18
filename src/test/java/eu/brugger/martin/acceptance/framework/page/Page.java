package eu.brugger.martin.acceptance.framework.page;

public interface Page {
    void open();
    boolean isOpened();
    void waitUntilPageOpened();
}
