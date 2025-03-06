public class WasteManagement {
    public static void main(String[] args) {
        WasteCollectionChain wasteCollection = new WasteCollectionChain();
        WasteContainer organicContainer = new WasteContainer("Organic", 10);
        WasteContainer recyclableContainer = new WasteContainer("Recyclable", 20);
        WasteContainer hazardousContainer = new WasteContainer("Hazardous", 5);
        wasteCollection.collect(organicContainer);
        wasteCollection.collect(recyclableContainer);
        wasteCollection.collect(hazardousContainer);
    }
}
