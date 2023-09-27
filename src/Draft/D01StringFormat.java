package Draft;

public class D01StringFormat {
    public static String DYNAMIC = "//img[@title = '%s']";

    public static void main(String[] args) {
        clickToLink(DYNAMIC, "FedEx");
    }

    public static void clickToLink(String dynamicLocator, String... page) {
        String locator = String.format(dynamicLocator, page);
        System.out.println("Click to: " + dynamicLocator);
    }
}


