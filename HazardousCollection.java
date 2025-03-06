public class HazardousCollection implements CollectionChain{
    private CollectionChain chain;

    @Override
    public void setNextChain(CollectionChain nextChain) {
        this.chain = nextChain;
    }


    @Override
    public void collect(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("hazardous"))
            System.out.println("Collecting and Handling Hazardous Waste Safely with capacity of " + container.getCapacity());
        else {
            this.chain.collect(container);
        }
    }
}
