public class RecyclableCollection implements CollectionChain{
    private CollectionChain chain;

    @Override
    public void setNextChain(CollectionChain nextChain) {
        this.chain = nextChain;
    }


    @Override
    public void collect(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("recyclable"))
            System.out.println("Collecting and Recycling Waste with capacity of " + container.getCapacity());
        else {
            this.chain.collect(container);
        }
    }
}
