public class OrganicCollection implements CollectionChain{
    private CollectionChain chain;

    @Override
    public void setNextChain(CollectionChain nextChain) {
        this.chain = nextChain;
    }


    @Override
    public void collect(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("organic"))
            System.out.println("Collecting and Disposing Organic Waste with capacity of " + container.getCapacity());
        else {
            this.chain.collect(container);
        }
    }
    
}
